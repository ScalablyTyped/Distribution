package typings.reactStickyBox.mod

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
    val __obj = js.Dynamic.literal(latestScrollY = latestScrollY.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], naturalTop = naturalTop.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHeight = nodeHeight.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentHeight = parentHeight.asInstanceOf[js.Any], scrollPane = scrollPane.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBoxInstance]
  }
}

