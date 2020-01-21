package typings.reactSimpleCodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: Double
  var stack: js.Array[AnonSelectionEnd]
}

object AnonOffset {
  @scala.inline
  def apply(offset: Double, stack: js.Array[AnonSelectionEnd]): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOffset]
  }
}

