package typings
package semanticDashUiDashReactLib.distCommonjsModulesDimmerDimmerInnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictDimmerInnerProps extends js.Object {
  /** An active dimmer will dim its parent container. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A disabled dimmer cannot be activated */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A dimmer can be formatted to have its colors inverted. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Called when the dimmer is clicked.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ DimmerInnerProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Handles click outside Dimmer's content, but inside Dimmer area.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClickOutside: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      /* data */ DimmerInnerProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A dimmer can be formatted to be fixed to the page. */
  var page: js.UndefOr[scala.Boolean] = js.undefined
  /** A dimmer can be controlled with simple prop. */
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  /** A dimmer can have its content top or bottom aligned. */
  var verticalAlign: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top
  ] = js.undefined
}

