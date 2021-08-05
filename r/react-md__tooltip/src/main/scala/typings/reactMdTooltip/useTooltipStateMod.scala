package typings.reactMdTooltip

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactMdTooltip.anon.PickHTMLAttributesHTMLEle
import typings.reactMdTooltip.useHandlersMod.TooltipInitiated
import typings.reactMdUtils.typesMod.SimplePosition
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTooltipStateMod {
  
  @JSImport("@react-md/tooltip/types/useTooltipState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOtherInteractionDisable(initiated: TooltipInitiated, hideTooltip: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOtherInteractionDisable")(initiated.asInstanceOf[js.Any], hideTooltip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useTooltipState(
    hasPropPositionDefaultPositionPositionThresholdHoverDelayTouchTimeoutFocusDelayDisableHoverModeOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnFocusOnBlurOnKeyDownOnShowOnHide: TooltipStateOptions
  ): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipState")(hasPropPositionDefaultPositionPositionThresholdHoverDelayTouchTimeoutFocusDelayDisableHoverModeOnMouseEnterOnMouseLeaveOnTouchStartOnTouchMoveOnFocusOnBlurOnKeyDownOnShowOnHide.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  trait ReturnValue extends StObject {
    
    var handlers: PickHTMLAttributesHTMLEle
    
    def hide(): Unit
    
    var position: SimplePosition
    
    var visible: Boolean
  }
  object ReturnValue {
    
    inline def apply(handlers: PickHTMLAttributesHTMLEle, hide: () => Unit, position: SimplePosition, visible: Boolean): ReturnValue = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    extension [Self <: ReturnValue](x: Self) {
      
      inline def setHandlers(value: PickHTMLAttributesHTMLEle): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @react-md/tooltip.@react-md/tooltip/types/useHandlers.MergableHandlers */
  /* Inlined parent std.Pick<@react-md/tooltip.@react-md/tooltip/types/Tooltip.TooltipProps, 'position'> */
  /* Inlined parent std.Pick<@react-md/tooltip.@react-md/tooltip/types/useVisibilityChange.VisibilityChangeOptions, 'onShow' | 'onHide'> */
  trait TooltipStateOptions extends StObject {
    
    /**
      * The default position to use for the "auto" positioning mode.
      */
    var defaultPosition: SimplePosition
    
    /**
      * Bolean if the hover mode functionality should be disabled. When this is
      * `undefined`, it will default to `false` if there is no
      * `ToolipHoverModeConfig` parent component of the current tooltip, otherwise
      * it will be `true`. When this value is a boolean, it will always be used
      * instead.
      */
    var disableHoverMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of time in ms to wait before a tooltip should be shown after the
      * user keyboard focuses the container element.
      */
    var focusDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in ms to wait before a tooltip should be shown after the
      * user hovers the container element.
      */
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* mode */ UserInteractionMode, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var position: js.UndefOr[SimplePosition] = js.undefined
    
    /**
      * The threshold multiplier to apply to the entire viewheight to determine if
      * the tooltip should be placed above or below the container element.
      */
    var positionThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in ms to wait before triggering the exit animation after
      * the user stops touching the container element on mobile devices.
      */
    var touchTimeout: js.UndefOr[Double] = js.undefined
  }
  object TooltipStateOptions {
    
    inline def apply(defaultPosition: SimplePosition): TooltipStateOptions = {
      val __obj = js.Dynamic.literal(defaultPosition = defaultPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateOptions]
    }
    
    extension [Self <: TooltipStateOptions](x: Self) {
      
      inline def setDefaultPosition(value: SimplePosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverMode(value: Boolean): Self = StObject.set(x, "disableHoverMode", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverModeUndefined: Self = StObject.set(x, "disableHoverMode", js.undefined)
      
      inline def setFocusDelay(value: Double): Self = StObject.set(x, "focusDelay", value.asInstanceOf[js.Any])
      
      inline def setFocusDelayUndefined: Self = StObject.set(x, "focusDelay", js.undefined)
      
      inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnShow(value: /* mode */ UserInteractionMode => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionThreshold(value: Double): Self = StObject.set(x, "positionThreshold", value.asInstanceOf[js.Any])
      
      inline def setPositionThresholdUndefined: Self = StObject.set(x, "positionThreshold", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTouchTimeout(value: Double): Self = StObject.set(x, "touchTimeout", value.asInstanceOf[js.Any])
      
      inline def setTouchTimeoutUndefined: Self = StObject.set(x, "touchTimeout", js.undefined)
    }
  }
}
