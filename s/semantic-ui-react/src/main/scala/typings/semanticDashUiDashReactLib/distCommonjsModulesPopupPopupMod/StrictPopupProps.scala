package typings
package semanticDashUiDashReactLib.distCommonjsModulesPopupPopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictPopupProps
  extends semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.StrictPortalProps {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Display the popup without the pointing arrow */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Simple text content for the popover. */
  var content: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesPopupPopupContentMod.PopupContentProps
    ]
  ] = js.undefined
  /** Existing element the pop-up should be bound to. */
  var context: js.UndefOr[js.Object] = js.undefined
  /** A flowing Popup has no maximum width and continues to flow to fit its content. */
  var flowing: js.UndefOr[scala.Boolean] = js.undefined
  /** Header displayed above the content in bold. */
  var header: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesPopupPopupHeaderMod.PopupHeaderProps
    ]
  ] = js.undefined
  /** The node where the popup should mount. */
  var hideOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** Horizontal offset in pixels to be applied to the popup. */
  var horizontalOffset: js.UndefOr[scala.Double] = js.undefined
  /** Whether the popup should not close on hover. */
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  /** Invert the colors of the popup */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Element to be rendered within the confines of the viewport whenever possible. */
  var keepInViewPort: js.UndefOr[scala.Boolean] = js.undefined
  /** Events triggering the popup. */
  var on: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.hover | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.click | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.focus | (js.Array[
      semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.hover | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.click | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.focus
    ])
  ] = js.undefined
  /**
     * Called when a close event happens.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  @JSName("onClose")
  var onClose_StrictPopupProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ PopupProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the portal is mounted on the DOM.
     *
     * @param {null}
     * @param {object} data - All props.
     */
  @JSName("onMount")
  var onMount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ PopupProps, scala.Unit]] = js.undefined
  /**
     * Called when an open event happens.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  @JSName("onOpen")
  var onOpen_StrictPopupProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ PopupProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the portal is unmounted from the DOM.
     *
     * @param {null}
     * @param {object} data - All props.
     */
  @JSName("onUnmount")
  var onUnmount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ PopupProps, scala.Unit]] = js.undefined
  /** Position for the popover. */
  var position: js.UndefOr[
    (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom center`)
  ] = js.undefined
  /** Popup size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge
  ] = js.undefined
  /** Custom Popup style. */
  var style: js.UndefOr[js.Object] = js.undefined
  /** Vertical offset in pixels to be applied to the popup. */
  var verticalOffset: js.UndefOr[scala.Double] = js.undefined
  /** Popup width. */
  var wide: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
}

