package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaretPosition extends js.Object {
  val offset: Double = js.native
  val offsetNode: Node = js.native
  def getClientRect(): DOMRect | Null = js.native
}

object CaretPosition {
  @scala.inline
  def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
  @scala.inline
  implicit class CaretPositionOps[Self <: CaretPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetClientRect(value: () => DOMRect | Null): Self = this.set("getClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetNode(value: Node): Self = this.set("offsetNode", value.asInstanceOf[js.Any])
  }
  
}

