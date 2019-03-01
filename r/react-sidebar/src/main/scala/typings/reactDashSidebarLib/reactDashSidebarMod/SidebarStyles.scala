package typings
package reactDashSidebarLib.reactDashSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarStyles extends js.Object {
  var content: js.UndefOr[stdLib.Partial[stdLib.CSSStyleDeclaration]] = js.undefined
  var dragHandle: js.UndefOr[stdLib.Partial[stdLib.CSSStyleDeclaration]] = js.undefined
  var overlay: js.UndefOr[stdLib.Partial[stdLib.CSSStyleDeclaration]] = js.undefined
  var root: js.UndefOr[stdLib.Partial[stdLib.CSSStyleDeclaration]] = js.undefined
  var sidebar: js.UndefOr[stdLib.Partial[stdLib.CSSStyleDeclaration]] = js.undefined
}

object SidebarStyles {
  @scala.inline
  def apply(
    content: stdLib.Partial[stdLib.CSSStyleDeclaration] = null,
    dragHandle: stdLib.Partial[stdLib.CSSStyleDeclaration] = null,
    overlay: stdLib.Partial[stdLib.CSSStyleDeclaration] = null,
    root: stdLib.Partial[stdLib.CSSStyleDeclaration] = null,
    sidebar: stdLib.Partial[stdLib.CSSStyleDeclaration] = null
  ): SidebarStyles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (dragHandle != null) __obj.updateDynamic("dragHandle")(dragHandle)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (root != null) __obj.updateDynamic("root")(root)
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar)
    __obj.asInstanceOf[SidebarStyles]
  }
}

