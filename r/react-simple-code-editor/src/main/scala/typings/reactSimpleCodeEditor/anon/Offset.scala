package typings.reactSimpleCodeEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: Double
  var stack: js.Array[SelectionEnd]
}

object Offset {
  @scala.inline
  def apply(offset: Double, stack: js.Array[SelectionEnd]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

