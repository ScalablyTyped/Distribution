package typings
package reactDashLatexDashNextLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var display: scala.Boolean
  var left: java.lang.String
  var right: java.lang.String
}

object Delimiter {
  @scala.inline
  def apply(display: scala.Boolean, left: java.lang.String, right: java.lang.String): Delimiter = {
    val __obj = js.Dynamic.literal(display = display, left = left, right = right)
  
    __obj.asInstanceOf[Delimiter]
  }
}

