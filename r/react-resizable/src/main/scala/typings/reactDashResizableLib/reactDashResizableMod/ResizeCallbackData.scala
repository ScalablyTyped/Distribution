package typings
package reactDashResizableLib.reactDashResizableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeCallbackData extends js.Object {
  var node: reactLib.HTMLElement
  var size: reactDashResizableLib.Anon_Height
}

object ResizeCallbackData {
  @scala.inline
  def apply(node: reactLib.HTMLElement, size: reactDashResizableLib.Anon_Height): ResizeCallbackData = {
    val __obj = js.Dynamic.literal(node = node, size = size)
  
    __obj.asInstanceOf[ResizeCallbackData]
  }
}

