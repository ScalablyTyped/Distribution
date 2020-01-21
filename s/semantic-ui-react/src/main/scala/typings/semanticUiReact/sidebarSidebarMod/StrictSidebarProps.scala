package typings.semanticUiReact.sidebarSidebarMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.`scale down`
import typings.semanticUiReact.semanticUiReactStrings.`slide along`
import typings.semanticUiReact.semanticUiReactStrings.`slide out`
import typings.semanticUiReact.semanticUiReactStrings.`very thin`
import typings.semanticUiReact.semanticUiReactStrings.`very wide`
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.overlay
import typings.semanticUiReact.semanticUiReactStrings.push
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.thin
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.uncover
import typings.semanticUiReact.semanticUiReactStrings.wide
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSidebarProps extends js.Object {
  /** Animation style. */
  var animation: js.UndefOr[overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Direction the sidebar should appear on. */
  var direction: js.UndefOr[top | right | bottom | left] = js.undefined
  /**
    * Called after a sidebar has finished animating out.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onHidden: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /**
    * Called before a sidebar begins to animate out.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onHide: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /**
    * Called when a sidebar has finished animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onShow: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /**
    * Called when a sidebar begins animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onVisible: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.undefined
  /** A sidebar can handle clicks on the passed element. */
  var target: js.UndefOr[js.Object | RefObject[HTMLElement]] = js.undefined
  /** Controls whether or not the sidebar is visible on the page. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Sidebar width. */
  var width: js.UndefOr[(`very thin`) | thin | wide | (`very wide`)] = js.undefined
}

object StrictSidebarProps {
  @scala.inline
  def apply(
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
  ): StrictSidebarProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction2(onShow))
    if (onVisible != null) __obj.updateDynamic("onVisible")(js.Any.fromFunction2(onVisible))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSidebarProps]
  }
}

