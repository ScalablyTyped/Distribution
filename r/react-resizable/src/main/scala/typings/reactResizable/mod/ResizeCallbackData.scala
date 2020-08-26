package typings.reactResizable.mod

import typings.reactResizable.anon.Height
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeCallbackData extends js.Object {
  var handle: ResizeHandle = js.native
  var node: HTMLElement = js.native
  var size: Height = js.native
}

object ResizeCallbackData {
  @scala.inline
  def apply(handle: ResizeHandle, node: HTMLElement, size: Height): ResizeCallbackData = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeCallbackData]
  }
  @scala.inline
  implicit class ResizeCallbackDataOps[Self <: ResizeCallbackData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandle(value: ResizeHandle): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

