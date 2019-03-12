package typings
package semanticDashUiDashReactLib.distCommonjsModulesSidebarSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps
  extends StrictSidebarProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object SidebarProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    animation: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.overlay | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.push | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`scale down`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.uncover | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`slide out`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`slide along`) = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    direction: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left = null,
    onHidden: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SidebarProps) => scala.Unit = null,
    onHide: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SidebarProps) => scala.Unit = null,
    onShow: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SidebarProps) => scala.Unit = null,
    onVisible: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ SidebarProps) => scala.Unit = null,
    target: js.Object = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very thin`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.thin | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.wide | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very wide`) = null
  ): SidebarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onVisible != null) __obj.updateDynamic("onVisible")(js.Any.fromFunction2(onVisible))
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
}

