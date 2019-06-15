package typings
package semanticDashUiDashReactLib.distCommonjsModulesPopupPopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupProps
  extends StrictPopupProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object PopupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    popperDependencies: js.Array[_] = null,
    popperModifiers: js.Object = null,
    position: (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top center`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom center`) = null,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge = null,
    style: js.Object = null,
    trigger: reactLib.reactMod.ReactNode = null,
    triggerRef: reactLib.reactMod.Ref[_] = null,
    wide: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null
  ): PopupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (popperDependencies != null) __obj.updateDynamic("popperDependencies")(popperDependencies)
    if (popperModifiers != null) __obj.updateDynamic("popperModifiers")(popperModifiers)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    if (wide != null) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
}

