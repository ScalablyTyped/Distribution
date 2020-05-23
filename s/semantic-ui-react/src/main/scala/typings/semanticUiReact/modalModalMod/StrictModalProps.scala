package typings.semanticUiReact.modalModalMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.modalActionsMod.ModalActionsProps
import typings.semanticUiReact.modalContentMod.ModalContentProps
import typings.semanticUiReact.modalHeaderMod.ModalHeaderProps
import typings.semanticUiReact.portalPortalMod.StrictPortalProps
import typings.semanticUiReact.semanticUiReactBooleans.`true`
import typings.semanticUiReact.semanticUiReactStrings.blurring
import typings.semanticUiReact.semanticUiReactStrings.fullscreen
import typings.semanticUiReact.semanticUiReactStrings.inverted
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictModalProps extends StrictPortalProps {
  /** Shorthand for Modal.Actions. Typically an array of button shorthand. */
  var actions: js.UndefOr[SemanticShorthandItem[ModalActionsProps]] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A Modal can reduce its complexity */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** A modal can be vertically centered in the viewport */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Icon. */
  var closeIcon: js.UndefOr[js.Any] = js.undefined
  /** Whether or not the Modal should close when the dimmer is clicked. */
  var closeOnDimmerClick: js.UndefOr[Boolean] = js.undefined
  /** A Modal can be passed content via shorthand. */
  var content: js.UndefOr[SemanticShorthandItem[ModalContentProps]] = js.undefined
  /** A modal can appear in a dimmer. */
  var dimmer: js.UndefOr[`true` | blurring | inverted] = js.undefined
  /** A Modal can be passed header via shorthand. */
  var header: js.UndefOr[SemanticShorthandItem[ModalHeaderProps]] = js.undefined
  /**
    * Action onClick handler when using shorthand `actions`.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onActionClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
  ] = js.undefined
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onClose")
  var onClose_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
  ] = js.undefined
  /**
    * Called when the portal is mounted on the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onMount")
  var onMount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  @JSName("onOpen")
  var onOpen_StrictModalProps: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps, Unit]
  ] = js.undefined
  /**
    * Called when the portal is unmounted from the DOM.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  @JSName("onUnmount")
  var onUnmount_StrictModalProps: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ ModalProps, Unit]] = js.undefined
  /** A modal can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | fullscreen] = js.undefined
  /** Custom styles. */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StrictModalProps {
  @scala.inline
  def apply(
    actions: SemanticShorthandItem[ModalActionsProps] = null,
    as: js.Any = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
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
    mouseEnterDelay: js.UndefOr[Double] = js.undefined,
    mouseLeaveDelay: js.UndefOr[Double] = js.undefined,
    onActionClick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit = null,
    onClose: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit = null,
    onMount: (/* nothing */ Null, /* data */ ModalProps) => Unit = null,
    onOpen: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ ModalProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ ModalProps) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | fullscreen = null,
    style: CSSProperties = null,
    trigger: ReactNode = null,
    triggerRef: js.UndefOr[Null | Ref[_]] = js.undefined
  ): StrictModalProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDimmerClick)) __obj.updateDynamic("closeOnDimmerClick")(closeOnDimmerClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.get.asInstanceOf[js.Any])
    if (dimmer != null) __obj.updateDynamic("dimmer")(dimmer.asInstanceOf[js.Any])
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEnterDelay)) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseLeaveDelay)) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.get.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2(onActionClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction2(onOpen))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerRef)) __obj.updateDynamic("triggerRef")(triggerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictModalProps]
  }
}

