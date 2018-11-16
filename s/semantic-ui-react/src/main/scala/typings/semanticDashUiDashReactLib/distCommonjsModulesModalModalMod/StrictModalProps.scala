package typings
package semanticDashUiDashReactLib.distCommonjsModulesModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictModalProps
  extends semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod.StrictPortalProps {
  /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
  var actions: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesModalModalActionsMod.ModalActionsProps
    ]
  ] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A Modal can reduce its complexity */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** A modal can be vertically centered in the viewport */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Icon. */
  var closeIcon: js.UndefOr[js.Any] = js.undefined
  /** Whether or not the Modal should close when the dimmer is clicked. */
  var closeOnDimmerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** A Modal can be passed content via shorthand. */
  var content: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesModalModalContentMod.ModalContentProps
    ]
  ] = js.undefined
  /** A modal can appear in a dimmer. */
  var dimmer: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibNumbers.`true` | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.blurring | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.inverted
  ] = js.undefined
  /** A Modal can be passed header via shorthand. */
  var header: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
    ]
  ] = js.undefined
  /**
     * Action onClick handler when using shorthand `actions`.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onActionClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ ModalProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when a close event happens.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  @JSName("onClose")
  var onClose_StrictModalProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ ModalProps, 
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
  var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ ModalProps, scala.Unit]] = js.undefined
  /**
     * Called when an open event happens.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  @JSName("onOpen")
  var onOpen_StrictModalProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement], 
      /* data */ ModalProps, 
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
  var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ ModalProps, scala.Unit]] = js.undefined
  /** A modal can vary in size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fullscreen | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny
  ] = js.undefined
  /** Custom styles. */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

