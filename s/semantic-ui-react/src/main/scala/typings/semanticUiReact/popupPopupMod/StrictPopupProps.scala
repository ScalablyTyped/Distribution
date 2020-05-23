package typings.semanticUiReact.popupPopupMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.popupContentMod.PopupContentProps
import typings.semanticUiReact.popupHeaderMod.PopupHeaderProps
import typings.semanticUiReact.portalPortalMod.StrictPortalProps
import typings.semanticUiReact.semanticUiReactStrings.`bottom center`
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`left center`
import typings.semanticUiReact.semanticUiReactStrings.`right center`
import typings.semanticUiReact.semanticUiReactStrings.`top center`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.click
import typings.semanticUiReact.semanticUiReactStrings.focus
import typings.semanticUiReact.semanticUiReactStrings.hover
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.very
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPopupProps extends StrictPortalProps {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Display the popup without the pointing arrow */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Simple text content for the popover. */
  var content: js.UndefOr[SemanticShorthandItem[PopupContentProps]] = js.undefined
  /** Existing element the pop-up should be bound to. */
  var context: js.UndefOr[js.Object | RefObject[HTMLElement]] = js.undefined
  /** A disabled popup only renders its trigger. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Enables the Popper.js event listeners. */
  var eventsEnabled: js.UndefOr[Boolean] = js.undefined
  /** A flowing Popup has no maximum width and continues to flow to fit its content. */
  var flowing: js.UndefOr[Boolean] = js.undefined
  /** Header displayed above the content in bold. */
  var header: js.UndefOr[SemanticShorthandItem[PopupHeaderProps]] = js.undefined
  /** Hide the Popup when scrolling the window. */
  var hideOnScroll: js.UndefOr[Boolean] = js.undefined
  /** Whether the popup should not close on hover. */
  var hoverable: js.UndefOr[Boolean] = js.undefined
  /** Invert the colors of the popup */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Offset value to apply to rendered popup. Accepts the following units:
    * - px or unit-less, interpreted as pixels
    * - %, percentage relative to the length of the trigger element
    * - %p, percentage relative to the length of the popup element
    * - vw, CSS viewport width unit
    * - vh, CSS viewport height unit
    */
  var offset: js.UndefOr[Double | String] = js.undefined
  /** Events triggering the popup. */
  var on: js.UndefOr[hover | click | focus | (js.Array[hover | click | focus])] = js.undefined
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClose")
  var onClose_StrictPopupProps: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps, Unit]
  ] = js.undefined
  /**
    * Called when the portal is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onMount")
  var onMount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PopupProps, Unit]] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onOpen")
  var onOpen_StrictPopupProps: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps, Unit]
  ] = js.undefined
  /**
    * Called when the portal is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onUnmount")
  var onUnmount_StrictPopupProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ PopupProps, Unit]] = js.undefined
  /** Disables automatic repositioning of the component, it will always be placed according to the position value. */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /** A popup can have dependencies which update will schedule a position update. */
  var popperDependencies: js.UndefOr[js.Array[_]] = js.undefined
  /** An object containing custom settings for the Popper.js modifiers. */
  var popperModifiers: js.UndefOr[js.Object] = js.undefined
  /** Position for the popover. */
  var position: js.UndefOr[
    (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`)
  ] = js.undefined
  /** Tells `Popper.js` to use the `position: fixed` strategy to position the popover. */
  var positionFixed: js.UndefOr[Boolean] = js.undefined
  /** Popup size. */
  var size: js.UndefOr[mini | tiny | small | large | huge] = js.undefined
  /** Custom Popup style. */
  var style: js.UndefOr[js.Object] = js.undefined
  /** Popup width. */
  var wide: js.UndefOr[Boolean | very] = js.undefined
}

object StrictPopupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[PopupContentProps] = null,
    context: js.Object | RefObject[HTMLElement] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventPool: String = null,
    eventsEnabled: js.UndefOr[Boolean] = js.undefined,
    flowing: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[PopupHeaderProps] = null,
    hideOnScroll: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    mountNode: js.Any = null,
    mouseEnterDelay: js.UndefOr[Double] = js.undefined,
    mouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    offset: Double | String = null,
    on: hover | click | focus | (js.Array[hover | click | focus]) = null,
    onClose: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps) => Unit = null,
    onMount: (/* nothing */ Null, /* data */ PopupProps) => Unit = null,
    onOpen: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PopupProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PopupProps) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined,
    pinned: js.UndefOr[Boolean] = js.undefined,
    popperDependencies: js.Array[_] = null,
    popperModifiers: js.Object = null,
    position: (`top left`) | (`top right`) | (`bottom right`) | (`bottom left`) | (`right center`) | (`left center`) | (`top center`) | (`bottom center`) = null,
    positionFixed: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | huge = null,
    style: js.Object = null,
    trigger: ReactNode = null,
    triggerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    wide: Boolean | very = null
  ): StrictPopupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool.asInstanceOf[js.Any])
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flowing)) __obj.updateDynamic("flowing")(flowing.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnScroll)) __obj.updateDynamic("hideOnScroll")(hideOnScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEnterDelay)) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseLeaveDelay)) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (popperDependencies != null) __obj.updateDynamic("popperDependencies")(popperDependencies.asInstanceOf[js.Any])
    if (popperModifiers != null) __obj.updateDynamic("popperModifiers")(popperModifiers.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerRef)) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    if (wide != null) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPopupProps]
  }
}

