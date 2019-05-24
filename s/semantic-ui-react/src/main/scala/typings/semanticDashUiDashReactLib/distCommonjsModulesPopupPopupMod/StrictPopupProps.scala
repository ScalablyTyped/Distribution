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
  var context: js.UndefOr[js.Object | reactLib.reactMod.RefObject[stdLib.HTMLElement]] = js.undefined
  /** A disabled popup only renders its trigger. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
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
  /** Whether the popup should not close on hover. */
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  /** Invert the colors of the popup */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Offset value to apply to rendered popup. Accepts the following units:
    * - px or unit-less, interpreted as pixels
    * - %, percentage relative to the length of the trigger element
    * - %p, percentage relative to the length of the popup element
    * - vw, CSS viewport width unit
    * - vh, CSS viewport height unit
    */
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
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
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
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
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
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
  /** Popup width. */
  var wide: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
}

object StrictPopupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    closeOnDocumentClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[scala.Boolean] = js.undefined,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesPopupPopupContentMod.PopupContentProps
    ] = null,
    context: js.Object | reactLib.reactMod.RefObject[stdLib.HTMLElement] = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    eventPool: java.lang.String = null,
    flowing: js.UndefOr[scala.Boolean] = js.undefined,
    header: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[
      semanticDashUiDashReactLib.distCommonjsModulesPopupPopupHeaderMod.PopupHeaderProps
    ] = null,
    hideOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    mountNode: js.Any = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    offset: scala.Double | java.lang.String = null,
    on: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.hover | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.click | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.focus | (js.Array[
      semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.hover | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.click | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.focus
    ]) = null,
    onClose: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ PopupProps) => scala.Unit = null,
    onMount: (/* nothing */ scala.Null, /* data */ PopupProps) => scala.Unit = null,
    onOpen: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* data */ PopupProps) => scala.Unit = null,
    onUnmount: (/* nothing */ scala.Null, /* data */ PopupProps) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[scala.Boolean] = js.undefined,
    position: (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom center`) = null,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge = null,
    style: js.Object = null,
    trigger: reactLib.reactMod.ReactNode = null,
    triggerRef: reactLib.reactMod.Ref[_] = null,
    wide: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null
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
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    if (wide != null) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPopupProps]
  }
}

