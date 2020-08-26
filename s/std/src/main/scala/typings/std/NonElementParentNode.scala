package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonElementParentNode extends js.Object {
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  def getElementById(elementId: java.lang.String): Element | Null = js.native
}

object NonElementParentNode {
  @scala.inline
  def apply(getElementById: java.lang.String => Element | Null): NonElementParentNode = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById))
    __obj.asInstanceOf[NonElementParentNode]
  }
  @scala.inline
  implicit class NonElementParentNodeOps[Self <: NonElementParentNode] (val x: Self) extends AnyVal {
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
    def setGetElementById(value: java.lang.String => Element | Null): Self = this.set("getElementById", js.Any.fromFunction1(value))
  }
  
}

