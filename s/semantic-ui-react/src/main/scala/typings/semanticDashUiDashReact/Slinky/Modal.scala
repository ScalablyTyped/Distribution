package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsModulesModalMod.default
import typings.semanticDashUiDashReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typings.semanticDashUiDashReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typings.semanticDashUiDashReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
import typings.semanticDashUiDashReact.distCommonjsModulesModalModalMod.ModalProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`true`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.blurring
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.fullscreen
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.inverted
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, open, style, className */
object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.semanticDashUiDashReact.distCommonjsModulesModalMod.default].asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    actions: SemanticShorthandItem[ModalActionsProps] = null,
    as: js.Any = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    closeIcon: js.Any = null,
    closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnDocumentClick: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandItem[ModalContentProps] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    dimmer: `true` | blurring | inverted = null,
    eventPool: String = null,
    header: SemanticShorthandItem[ModalHeaderProps] = null,
    mountNode: js.Any = null,
    mouseEnterDelay: Int | Double = null,
    mouseLeaveDelay: Int | Double = null,
    onActionClick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit = null,
    onClose: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps) => Unit = null,
    onClose_StrictModalProps: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit = null,
    onMount: (/* nothing */ Null, /* data */ PortalProps) => Unit = null,
    onMount_StrictModalProps: (/* nothing */ Null, /* data */ ModalProps) => Unit = null,
    onOpen: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ PortalProps) => Unit = null,
    onOpen_StrictModalProps: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalProps) => Unit = null,
    onUnmount_StrictModalProps: (/* nothing */ Null, /* data */ ModalProps) => Unit = null,
    openOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | fullscreen = null,
    trigger: ReactNode = null,
    triggerRef: typings.react.reactMod.Ref[_] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon)
    if (!js.isUndefined(closeOnDimmerClick)) __obj.updateDynamic("closeOnDimmerClick")(closeOnDimmerClick)
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave)
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur)
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick)
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onClose_StrictModalProps != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose_StrictModalProps))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onMount_StrictModalProps != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount_StrictModalProps))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onOpen_StrictModalProps != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen_StrictModalProps))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    if (onUnmount_StrictModalProps != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount_StrictModalProps))
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick)
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus)
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ModalProps
}

