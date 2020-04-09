package typings.prettier.mod.doc.printer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Specify the line length that the printer will wrap on.
    * @default 80
    */
  var printWidth: Double
  /**
    * Specify the number of spaces per indentation-level.
    * @default 2
    */
  var tabWidth: Double
  /**
    * Indent lines with tabs instead of spaces
    * @default false
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

