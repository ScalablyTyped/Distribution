package typings.reactDashStickyDashBox.reactDashStickyDashBoxMod

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBoxInstance extends js.Object {
  var latestScrollY: Double
  var mode: StickyBoxMode
  var naturalTop: Double
  var node: HTMLElement
  var nodeHeight: Double
  var offset: Double
  var parentHeight: Double
  var scrollPane: HTMLElement | Window
  var viewportHeight: Double
}

object StickyBoxInstance {
  @scala.inline
  def apply(
    latestScrollY: Double,
    mode: StickyBoxMode,
    naturalTop: Double,
    node: HTMLElement,
    nodeHeight: Double,
    offset: Double,
    parentHeight: Double,
    scrollPane: HTMLElement | Window,
    viewportHeight: Double
  ): StickyBoxInstance = {
    val __obj = js.Dynamic.literal(latestScrollY = latestScrollY, mode = mode, naturalTop = naturalTop, node = node, nodeHeight = nodeHeight, offset = offset, parentHeight = parentHeight, scrollPane = scrollPane.asInstanceOf[js.Any], viewportHeight = viewportHeight)
  
    __obj.asInstanceOf[StickyBoxInstance]
  }
}

