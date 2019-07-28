package typings.reactDashLatexDashNext.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var display: Boolean
  var left: String
  var right: String
}

object Delimiter {
  @scala.inline
  def apply(display: Boolean, left: String, right: String): Delimiter = {
    val __obj = js.Dynamic.literal(display = display, left = left, right = right)
  
    __obj.asInstanceOf[Delimiter]
  }
}

