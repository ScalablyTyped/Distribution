package typings.reactMdTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactMdPortal.typesGetContainerMod.PortalInto
import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import typings.reactMdUtils.typesPositioningTypesMod.SimplePosition
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTooltippedMod {
  
  @JSImport("@react-md/tooltip/types/Tooltipped", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tooltipped(param0: TooltippedProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltipped")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type ChildElement = ReactElement
  
  /* Inlined std.Partial<std.Omit<@react-md/tooltip.@react-md/tooltip/types/Tooltipped.TooltippedProvidedProps, 'tooltip'>> */
  trait ChildProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  }
  object ChildProps {
    
    inline def apply(): ChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildProps]
    }
    
    extension [Self <: ChildProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  type ChildrenRenderer = js.Function1[/* props */ TooltippedProvidedProps, ReactElement]
  
  /* Inlined parent @react-md/portal.@react-md/portal.RenderConditionalPortalProps */
  /* Inlined parent @react-md/tooltip.@react-md/tooltip/types/useTooltip.BaseTooltipHookOptions<std.HTMLElement> */
  /* Inlined parent std.Pick<@react-md/tooltip.@react-md/tooltip/types/Tooltip.TooltipProps, 'dense' | 'lineWrap' | 'temporary'> */
  trait TooltippedProps extends StObject {
    
    /**
      * An optional additional `aria-describedby` id or ids to merge with the
      * tooltip id. This is really used for things like notifications or when
      * multiple elements describe your tooltipped element.
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * The children for this component should either be a function or a single
      * element. When the children is a single React element, this component will
      * clone in an `id`, `aria-describedby`, and all the event handlers required
      * to show and hide a tooltip relative to that element. This means that you
      * will need to ensure that the child component accepts and passes down the
      * `on*` event handlers to a DOM node as well as the `id` and
      * `aria-describedby` for accessibility. Every component within react-md
      * should do this by default.
      *
      * If the children is a function, the `id`, `aria-describedby`, and event
      * handlers will be provided as well as a new `tooltip` prop so that you have
      * more control over rendering the tooltip.
      *
      * If the tooltip prop was not provided to this component, the
      * `aria-describedby` and the event handlers will be omitted.
      */
    var children: ChildElement | ChildrenRenderer
    
    /**
      * An optional className for the tooltip
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * An optional position to use before the positioning calculation has
      * occurred. This is also used to determine if the position should be
      * horizontal vs vertical.
      *
      * Vertical - `"below"` or `"above"`
      * Horizontal - `"left"` or `"right"`
      *
      * @defaultValue `"below"`
      */
    var defaultPosition: js.UndefOr[SimplePosition] = js.undefined
    
    /**
      * Boolean if the tooltip is using the dense spec. This will reduce the
      * padding, margin and font size for the tooltip and is usually used for
      * desktop displays.
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of spacing to use for a dense tooltip. This is the distance
      * between the container element and the tooltip.
      */
    var denseSpacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Since `react-md` provides mixins to automatically apply a dense spec
      * through mixins via media queries, the dense spec might be applied in css
      * instead of in JS. This component will actually check the current spacing
      * amount that has been applied when the tooltip becomes visible.
      *
      * If this behavior is not desired, you can enable this prop and it will only
      * use the provided `spacing` or `denseSpacing` props based on the `dense`
      * prop.
      *
      * Note: This will be defaulted to `true` when the
      * `process.env.NODE_ENV === 'test'` since test environments normally don't
      * have a default `window.getComputedStyle` value that is not `NaN`
      * which will display errors in your tests.
      */
    var disableAutoSpacing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the hover mode functionality should be disabled for this
      * instance instead of inheriting the value from the
      * {@link HoverModeProvider}.
      */
    var disableHoverMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the auto-swapping behavior should be disabled. When this value
      * is `undefined`, it'll be treated as `true` when the `position` prop is
      * defined, otherwise `false`.
      */
    var disableSwapping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the event handlers should no longer attempt to show a tooltip. This
      * should be set to `true` when your component might not have a tooltip associated
      * with it.
      *
      * @example
      * Real World Example
      * ```tsx
      * import type { ReactElement, ReactNode } from "react";
      * import { Button, ButtonProps } from "@react-md/button";
      * import { Tooltip, useTooltip } from "@react-md/tooltip":
      *
      * export interface TooltippedButtonProps extends ButtonProps {
      *   id: string;
      *   tooltip?: ReactNode;
      * }
      *
      * export function TooltippedButton({
      *   id,
      *   tooltip,
      *   children,
      *   onClick,
      *   onBlur,
      *   onFocus,
      *   onKeyDown,
      *   onMouseEnter,
      *   onMouseLeave,
      *   onTouchStart,
      *   onContextMenu,
      *   ...props
      * }: TooltippedButtonProps): ReactElement {
      *   const { elementProps, tooltipProps } = useTooltip({
      *     disabled: !tooltip,
      *     baseId: id,
      *     onClick,
      *     onBlur,
      *     onFocus,
      *     onKeyDown,
      *     onMouseEnter,
      *     onMouseLeave,
      *     onTouchStart,
      *     onContextMenu,
      *   });
      *
      *   return (
      *     <>
      *       <Button {...props} {...elementProps}>
      *         {children}
      *       </Button>
      *       <Tooltip {...tooltipProps}>{tooltip}</Tooltip>
      *     </>
      *   );
      * }
      * ```
      *
      * @defaultValue `false`
      * @remarks \@since 5.1.0
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of time to wait (in ms) before showing the tooltip after a
      * keyboard user has triggered a `focus` event. You _probably_ won't ever need
      * to change this value.
      */
    var focusTime: js.UndefOr[Double] = js.undefined
    
    /**
      * The id for the element that has a tooltip. This is always required since it
      * will be passed down to the `containerProps` in the children renderer
      * function. It is also used to generate a `tooltipId` when there is a
      * tooltip.
      */
    var id: String
    
    var lineWrap: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    /**
      * This function will be called once the {@link TransitionStage} has been set
      * to `"enter"`.
      *
      * @see {@link TransitionEnterHandler}
      */
    var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    /**
      * This function will be called once the {@link TransitionStage} has been set
      * to `"entering"`.
      *
      * @see {@link TransitionEnterHandler}
      */
    var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    /**
      * This function will be called once the {@link TransitionStage} has been set
      * to `"enter"`.
      *
      * @see {@link TransitionEnterHandler}
      */
    var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
    
    /**
      * This function will be called once the {@link TransitionStage} has been set
      * to `"entered"`.
      *
      * @see {@link TransitionEnterHandler}
      */
    var onExit: js.UndefOr[TransitionExitHandler] = js.undefined
    
    /**
      * This function will be called once the {@link TransitionStage} has been set
      * to `"exited"`.
      *
      * @see {@link TransitionExitHandler}
      */
    var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
    
    /**
      * This function will be called once the {@link TransitionStage} has been set
      * to `"exiting"`.
      *
      * @see {@link TransitionExitHandler}
      */
    var onExiting: js.UndefOr[TransitionExitHandler] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Boolean if the portal should be used.
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see {@link PortalProps.into}
      */
    var portalInto: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * @see {@link PortalProps.intoId}
      */
    var portalIntoId: js.UndefOr[String] = js.undefined
    
    /**
      * An optional controlled position to use that will disable the functionality
      * to determine the "best" position to render the tooltip within the viewport.
      */
    var position: js.UndefOr[SimplePosition] = js.undefined
    
    /**
      * The amount of spacing to use for a non-dense tooltip. This is the distance
      * between the container element and the tooltip.
      */
    var spacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * An optional style for the tooltip.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var temporary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This value should be between 0 and 1 and will be multiplied by either the
      * viewport height or viewport width to determine the best position to render
      * the tooltip based on available space within the viewport.
      *
      * You _probably_ won't ever really need to update this value.
      */
    var threshold: js.UndefOr[Double] = js.undefined
    
    /**
      * The tooltip to display. When this is false-ish, the children renderer will
      * always return `null` for the `tooltip` prop.
      */
    var tooltip: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The amount of time to wait (in ms) before showing the tooltip after
      * triggering a `touchstart` event. You _probably_ won't ever need to change
      * this value.
      *
      * The default time is about the same it takes to display the context menu
      * with a "long touch" and cancel displaying the context menu.
      */
    var touchTime: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the viewport height margin to use in the positioning calculation.
      * This is just used so that the tooltip can be placed with some spacing
      * between the top and bottom edges of the viewport if desired.
      */
    var vhMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the viewport width margin to use in the positioning calculation.
      * This is just used so that the tooltip can be placed with some spacing
      * between the left and right edges of the viewport if desired.
      */
    var vwMargin: js.UndefOr[Double] = js.undefined
  }
  object TooltippedProps {
    
    inline def apply(children: ChildElement | ChildrenRenderer, id: String): TooltippedProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltippedProps]
    }
    
    extension [Self <: TooltippedProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setChildren(value: ChildElement | ChildrenRenderer): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ TooltippedProvidedProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultPosition(value: SimplePosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseSpacing(value: Double | String): Self = StObject.set(x, "denseSpacing", value.asInstanceOf[js.Any])
      
      inline def setDenseSpacingUndefined: Self = StObject.set(x, "denseSpacing", js.undefined)
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setDisableAutoSpacing(value: Boolean): Self = StObject.set(x, "disableAutoSpacing", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoSpacingUndefined: Self = StObject.set(x, "disableAutoSpacing", js.undefined)
      
      inline def setDisableHoverMode(value: Boolean): Self = StObject.set(x, "disableHoverMode", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverModeUndefined: Self = StObject.set(x, "disableHoverMode", js.undefined)
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusTime(value: Double): Self = StObject.set(x, "focusTime", value.asInstanceOf[js.Any])
      
      inline def setFocusTimeUndefined: Self = StObject.set(x, "focusTime", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLineWrap(value: Boolean): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
      
      inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnEnter(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: () => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction0(value))
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalInto(value: PortalInto): Self = StObject.set(x, "portalInto", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "portalInto", js.Any.fromFunction0(value))
      
      inline def setPortalIntoId(value: String): Self = StObject.set(x, "portalIntoId", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoIdUndefined: Self = StObject.set(x, "portalIntoId", js.undefined)
      
      inline def setPortalIntoNull: Self = StObject.set(x, "portalInto", null)
      
      inline def setPortalIntoUndefined: Self = StObject.set(x, "portalInto", js.undefined)
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      inline def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTooltip(value: ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTouchTime(value: Double): Self = StObject.set(x, "touchTime", value.asInstanceOf[js.Any])
      
      inline def setTouchTimeUndefined: Self = StObject.set(x, "touchTime", js.undefined)
      
      inline def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      inline def setVhMarginUndefined: Self = StObject.set(x, "vhMargin", js.undefined)
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      inline def setVwMarginUndefined: Self = StObject.set(x, "vwMargin", js.undefined)
    }
  }
  
  /* Inlined parent @react-md/tooltip.@react-md/tooltip/types/useTooltip.TooltippedElementEventHandlers<std.HTMLElement> */
  trait TooltippedProvidedProps extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var tooltip: ReactNode
  }
  object TooltippedProvidedProps {
    
    inline def apply(id: String): TooltippedProvidedProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltippedProvidedProps]
    }
    
    extension [Self <: TooltippedProvidedProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setTooltip(value: ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
