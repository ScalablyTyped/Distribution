package typings.reactResizable.mod

import typings.reactResizable.AnonHeight
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeCallbackData extends js.Object {
  var handle: ResizeHandle
  var node: HTMLElement
  var size: AnonHeight
}

object ResizeCallbackData {
  @scala.inline
  def apply(handle: ResizeHandle, node: HTMLElement, size: AnonHeight): ResizeCallbackData = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeCallbackData]
  }
}

