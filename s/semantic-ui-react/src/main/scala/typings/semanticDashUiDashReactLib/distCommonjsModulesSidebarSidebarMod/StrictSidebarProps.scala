package typings
package semanticDashUiDashReactLib.distCommonjsModulesSidebarSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictSidebarProps extends js.Object {
  /** Animation style. */
  var animation: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.overlay | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.push | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`scale down`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.uncover | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`slide out`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`slide along`)
  ] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Direction the sidebar should appear on. */
  var direction: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left
  ] = js.undefined
  /**
    * Called after a sidebar has finished animating out.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onHidden: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SidebarProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called before a sidebar begins to animate out.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onHide: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SidebarProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when a sidebar has finished animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onShow: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SidebarProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when a sidebar begins animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onVisible: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ SidebarProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A sidebar can handle clicks on the passed element. */
  var target: js.UndefOr[js.Object] = js.undefined
  /** Controls whether or not the sidebar is visible on the page. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** Sidebar width. */
  var width: js.UndefOr[
    (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very thin`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.thin | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.wide | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`very wide`)
  ] = js.undefined
}

object StrictSidebarProps {
  @scala.inline
  def apply(
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
  ): StrictSidebarProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictSidebarProps]
  }
}

