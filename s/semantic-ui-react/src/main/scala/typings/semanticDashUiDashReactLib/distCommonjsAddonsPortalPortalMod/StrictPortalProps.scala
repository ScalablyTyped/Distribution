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

object StrictPortalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    closeOnDocumentClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    eventPool: java.lang.String = null,
    mountNode: js.Any = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onClose: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ PortalProps, 
      scala.Unit
    ] = null,
    onMount: js.Function2[/* nothing */ scala.Null, /* data */ PortalProps, scala.Unit] = null,
    onOpen: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ PortalProps, 
      scala.Unit
    ] = null,
    onUnmount: js.Function2[/* nothing */ scala.Null, /* data */ PortalProps, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[scala.Boolean] = js.undefined,
    trigger: reactLib.reactMod.ReactNs.ReactNode = null,
    triggerRef: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null
  ): StrictPortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave)
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur)
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick)
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onMount != null) __obj.updateDynamic("onMount")(onMount)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(onUnmount)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick)
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus)
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef)
    __obj.asInstanceOf[StrictPortalProps]
  }
}

