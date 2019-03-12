package typings
package reactDashResizableLib.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeCallbackData extends js.Object {
  var node: stdLib.HTMLElement
  var size: reactDashResizableLib.Anon_Height
}

object ResizeCallbackData {
  @scala.inline
  def apply(node: stdLib.HTMLElement, size: reactDashResizableLib.Anon_Height): ResizeCallbackData = {
    val __obj = js.Dynamic.literal(node = node, size = size)
  
    __obj.asInstanceOf[ResizeCallbackData]
  }
}

