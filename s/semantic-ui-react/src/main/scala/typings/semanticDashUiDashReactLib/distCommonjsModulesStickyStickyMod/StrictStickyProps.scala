package typings
package semanticDashUiDashReactLib.distCommonjsModulesStickyStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictStickyProps extends js.Object {
  /** A Sticky can be active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Offset in pixels from the bottom of the screen when fixing element to viewport. */
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object] = js.undefined
  /** Offset in pixels from the top of the screen when fixing element to viewport. */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
     * Callback when element is bound to bottom of parent container.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onBottom: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Callback when element is fixed to page.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onStick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Callback when element is bound to top of parent container.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onTop: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Callback when element is unfixed from page.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onUnstick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ StickyProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up. */
  var pushing: js.UndefOr[scala.Boolean] = js.undefined
  /** Context which sticky should attach onscroll events. */
  var scrollContext: js.UndefOr[js.Object] = js.undefined
  /** Custom style for sticky element. */
  var styleElement: js.UndefOr[js.Object] = js.undefined
}

