package typings.semanticDashUiDashReact.distCommonjsModulesSidebarSidebarMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`scale down`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`slide along`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`slide out`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very thin`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very wide`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.overlay
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.push
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.thin
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.uncover
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.wide
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps
  extends StrictSidebarProps
     with /* key */ StringDictionary[js.Any]

object SidebarProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animation: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`) = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    direction: top | right | bottom | left = null,
    onHidden: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit = null,
    onHide: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit = null,
    onShow: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit = null,
    onVisible: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit = null,
    target: js.Object | RefObject[HTMLElement] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: (`very thin`) | thin | wide | (`very wide`) = null
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
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
}

