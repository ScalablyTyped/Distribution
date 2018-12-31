package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPortalProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Controls whether or not the portal should close on a click outside. */
  var closeOnDocumentClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should close when escape is pressed is displayed. */
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls whether or not the portal should close when mousing out of the portal.
    * NOTE: This will prevent `closeOnTriggerMouseLeave` when mousing over the
    * gap from the trigger to the portal.
    */
  var closeOnPortalMouseLeave: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should close on blur of the trigger. */
  var closeOnTriggerBlur: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should close on click of the trigger. */
  var closeOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should close when mousing out of the trigger. */
  var closeOnTriggerMouseLeave: js.UndefOr[scala.Boolean] = js.undefined
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Event pool namespace that is used to handle component events. */
  var eventPool: js.UndefOr[java.lang.String] = js.undefined
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.undefined
  /** Milliseconds to wait before opening on mouse over */
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  /** Milliseconds to wait before closing on mouse leave */
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Called when a close event happens
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ PortalProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the portal is mounted on the DOM
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onMount: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ PortalProps, scala.Unit]] = js.undefined
  /**
    * Called when an open event happens
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onOpen: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ PortalProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the portal is unmounted from the DOM
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ PortalProps, scala.Unit]] = js.undefined
  /** Controls whether or not the portal is displayed. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should open when the trigger is clicked. */
  var openOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should open on focus of the trigger. */
  var openOnTriggerFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Controls whether or not the portal should open when mousing over the trigger. */
  var openOnTriggerMouseEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** Element to be rendered in-place where the portal is defined. */
  var trigger: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Called when componentDidMount.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var triggerRef: js.UndefOr[js.Function1[/* node */ reactLib.HTMLElement, scala.Unit]] = js.undefined
}

