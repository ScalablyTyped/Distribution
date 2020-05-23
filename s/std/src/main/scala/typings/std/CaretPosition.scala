package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaretPosition extends js.Object {
  val offset: Double
  val offsetNode: Node
  def getClientRect(): DOMRect | Null
}

object CaretPosition {
  @scala.inline
  def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
}

