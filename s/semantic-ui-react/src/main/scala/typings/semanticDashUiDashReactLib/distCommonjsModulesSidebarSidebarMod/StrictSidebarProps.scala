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
  /** Duration of sidebar animation. */
  var duration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Called after a sidebar has finished animating out.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onHidden: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
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

