package typings.semanticDashUiDashReact.distCommonjsModulesPopupPopupMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.StrictPortalProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsModulesPopupPopupContentMod.PopupContentProps
import typings.semanticDashUiDashReact.distCommonjsModulesPopupPopupHeaderMod.PopupHeaderProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`bottom center`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`bottom left`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`bottom right`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`left center`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`right center`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`top center`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`top left`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`top right`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.click
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.focus
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.hover
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.very
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
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
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
    triggerRef: Ref[_] = null,
    wide: Boolean | very = null
  ): StrictPopupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave)
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur)
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick)
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool)
    if (!js.isUndefined(eventsEnabled)) __obj.updateDynamic("eventsEnabled")(eventsEnabled)
    if (!js.isUndefined(flowing)) __obj.updateDynamic("flowing")(flowing)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnScroll)) __obj.updateDynamic("hideOnScroll")(hideOnScroll)
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick)
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus)
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (popperDependencies != null) __obj.updateDynamic("popperDependencies")(popperDependencies)
    if (popperModifiers != null) __obj.updateDynamic("popperModifiers")(popperModifiers)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(positionFixed)) __obj.updateDynamic("positionFixed")(positionFixed)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    if (wide != null) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPopupProps]
  }
}

