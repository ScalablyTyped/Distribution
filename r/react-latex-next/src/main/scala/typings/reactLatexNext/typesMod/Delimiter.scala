package typings.reactLatexNext.typesMod

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
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delimiter]
  }
}

