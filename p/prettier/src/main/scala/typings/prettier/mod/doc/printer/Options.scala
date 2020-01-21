package typings.prettier.mod.doc.printer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Specify the line length that the printer will wrap on.
    */
  var printWidth: Double
  /**
    * Specify the number of spaces per indentation-level.
    */
  var tabWidth: Double
  /**
    * Indent lines with tabs instead of spaces
    */
  var useTabs: Boolean
}

object Options {
  @scala.inline
  def apply(printWidth: Double, tabWidth: Double, useTabs: Boolean): Options = {
    val __obj = js.Dynamic.literal(printWidth = printWidth.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

