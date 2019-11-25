package typings.reactDashResizable.reactDashResizableMod

import typings.reactDashResizable.Anon_Height
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeCallbackData extends js.Object {
  var node: HTMLElement
  var size: Anon_Height
}

object ResizeCallbackData {
  @scala.inline
  def apply(node: HTMLElement, size: Anon_Height): ResizeCallbackData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizeCallbackData]
  }
}

