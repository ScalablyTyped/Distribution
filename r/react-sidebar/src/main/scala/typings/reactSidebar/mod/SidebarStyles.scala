package typings.reactSidebar.mod

import typings.reactSidebar.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarStyles extends js.Object {
  var content: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var dragHandle: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var overlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var root: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  var sidebar: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
}

object SidebarStyles {
  @scala.inline
  def apply(
    content: PartialCSSStyleDeclaratio = null,
    dragHandle: PartialCSSStyleDeclaratio = null,
    overlay: PartialCSSStyleDeclaratio = null,
    root: PartialCSSStyleDeclaratio = null,
    sidebar: PartialCSSStyleDeclaratio = null
  ): SidebarStyles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dragHandle != null) __obj.updateDynamic("dragHandle")(dragHandle.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarStyles]
  }
}

