package typings.reactMdTooltip

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactMdUtils.useModeDetectionMod.UserInteractionMode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHandlersMod {
  
  @JSImport("@react-md/tooltip/types/useHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyboardState(
    hasModeShowTooltipHideTooltipDelayInitiatedSetInitiatedOnFocusOnBlurOnKeyDownSetEstimatedPosition: KeyboardOptions
  ): KeyboardResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardState")(hasModeShowTooltipHideTooltipDelayInitiatedSetInitiatedOnFocusOnBlurOnKeyDownSetEstimatedPosition.asInstanceOf[js.Any]).asInstanceOf[KeyboardResult]
  
  inline def useMouseState(
    hasModeShowTooltipHideTooltipInitiatedSetInitiatedPropDelayOnMouseEnterOnMouseLeaveSetEstimatedPositionDisableHoverMode: MouseOptions
  ): MouseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouseState")(hasModeShowTooltipHideTooltipInitiatedSetInitiatedPropDelayOnMouseEnterOnMouseLeaveSetEstimatedPositionDisableHoverMode.asInstanceOf[js.Any]).asInstanceOf[MouseResult]
  
  inline def useTouchState(
    hasModeVisibleShowTooltipHideTooltipDelaySetInitiatedOnTouchStartOnTouchMoveOnContextMenuSetEstimatedPosition: TouchOptions
  ): TouchResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useTouchState")(hasModeVisibleShowTooltipHideTooltipDelaySetInitiatedOnTouchStartOnTouchMoveOnContextMenuSetEstimatedPosition.asInstanceOf[js.Any]).asInstanceOf[TouchResult]
  
  trait HandlersBaseOptions extends StObject {
    
    /**
      * The amount of delay to wait before showing the tooltip for the mouse and
      * keyboard flows. In the touch flow, this is the amount of time before the
      * tooltip will hide after the user releases their finger from the phone.
      */
    var delay: Double
    
    def hideTooltip(): Unit
    
    /**
      * The type of interaction that initiated the tooltip. When this value is
      * `null`, the tooltip hasn't been initiated yet and _should_ not be visible
      * within the page as well.
      *
      * When this is set to "window", it means that the tooltip was visible when
      * the entire window was blurred. Check out the keyboard `onFocus` comment for
      * more info about this flow.
      */
    var initiated: MutableRefObject[TooltipInitiated]
    
    var mode: UserInteractionMode
    
    /**
      * This is _normally_ triggered at when a timeout starts to help determine
      * what the animation position for the tooltip should be. If this isn't set
      * before the animation starts, the tooltip will animate weirdly.
      */
    def setEstimatedPosition(container: HTMLElement): Unit
    
    /**
      * A small callback that will set the current initiation type for the tooltip.
      */
    def setInitiated(mode: TooltipInitiated): Unit
    
    def showTooltip(): Unit
  }
  object HandlersBaseOptions {
    
    inline def apply(
      delay: Double,
      hideTooltip: () => Unit,
      initiated: MutableRefObject[TooltipInitiated],
      mode: UserInteractionMode,
      setEstimatedPosition: HTMLElement => Unit,
      setInitiated: TooltipInitiated => Unit,
      showTooltip: () => Unit
    ): HandlersBaseOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), initiated = initiated.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], setEstimatedPosition = js.Any.fromFunction1(setEstimatedPosition), setInitiated = js.Any.fromFunction1(setInitiated), showTooltip = js.Any.fromFunction0(showTooltip))
      __obj.asInstanceOf[HandlersBaseOptions]
    }
    
    extension [Self <: HandlersBaseOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setHideTooltip(value: () => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction0(value))
      
      inline def setInitiated(value: MutableRefObject[TooltipInitiated]): Self = StObject.set(x, "initiated", value.asInstanceOf[js.Any])
      
      inline def setMode(value: UserInteractionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSetEstimatedPosition(value: HTMLElement => Unit): Self = StObject.set(x, "setEstimatedPosition", js.Any.fromFunction1(value))
      
      inline def setSetInitiated(value: TooltipInitiated => Unit): Self = StObject.set(x, "setInitiated", js.Any.fromFunction1(value))
      
      inline def setShowTooltip(value: () => Unit): Self = StObject.set(x, "showTooltip", js.Any.fromFunction0(value))
    }
  }
  
  trait KeyboardOptions
    extends StObject
       with MergableKeyboardHandlers
       with HandlersBaseOptions
  object KeyboardOptions {
    
    inline def apply(
      delay: Double,
      hideTooltip: () => Unit,
      initiated: MutableRefObject[TooltipInitiated],
      mode: UserInteractionMode,
      setEstimatedPosition: HTMLElement => Unit,
      setInitiated: TooltipInitiated => Unit,
      showTooltip: () => Unit
    ): KeyboardOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), initiated = initiated.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], setEstimatedPosition = js.Any.fromFunction1(setEstimatedPosition), setInitiated = js.Any.fromFunction1(setInitiated), showTooltip = js.Any.fromFunction0(showTooltip))
      __obj.asInstanceOf[KeyboardOptions]
    }
  }
  
  type KeyboardResult = js.Tuple4[
    js.Function0[Unit], 
    js.UndefOr[FocusEventHandler[HTMLElement]], 
    js.UndefOr[FocusEventHandler[HTMLElement]], 
    js.UndefOr[KeyboardEventHandler[HTMLElement]]
  ]
  
  /* Inlined @react-md/tooltip.@react-md/tooltip/types/useHandlers.MergableMouseHandlers & @react-md/tooltip.@react-md/tooltip/types/useHandlers.MergableKeyboardHandlers & @react-md/tooltip.@react-md/tooltip/types/useHandlers.MergableTouchHandlers */
  trait MergableHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  }
  object MergableHandlers {
    
    inline def apply(): MergableHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergableHandlers]
    }
    
    extension [Self <: MergableHandlers](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLElement>, 'onFocus' | 'onBlur' | 'onKeyDown'> */
  trait MergableKeyboardHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  }
  object MergableKeyboardHandlers {
    
    inline def apply(): MergableKeyboardHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergableKeyboardHandlers]
    }
    
    extension [Self <: MergableKeyboardHandlers](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLElement>, 'onMouseEnter' | 'onMouseLeave'> */
  trait MergableMouseHandlers extends StObject {
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  }
  object MergableMouseHandlers {
    
    inline def apply(): MergableMouseHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergableMouseHandlers]
    }
    
    extension [Self <: MergableMouseHandlers](x: Self) {
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLElement>, 'onTouchStart' | 'onTouchMove' | 'onContextMenu'> */
  trait MergableTouchHandlers extends StObject {
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLElement]] = js.undefined
  }
  object MergableTouchHandlers {
    
    inline def apply(): MergableTouchHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergableTouchHandlers]
    }
    
    extension [Self <: MergableTouchHandlers](x: Self) {
      
      inline def setOnContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  trait MouseOptions
    extends StObject
       with MergableMouseHandlers
       with HandlersBaseOptions {
    
    var disableHoverMode: js.UndefOr[Boolean] = js.undefined
  }
  object MouseOptions {
    
    inline def apply(
      delay: Double,
      hideTooltip: () => Unit,
      initiated: MutableRefObject[TooltipInitiated],
      mode: UserInteractionMode,
      setEstimatedPosition: HTMLElement => Unit,
      setInitiated: TooltipInitiated => Unit,
      showTooltip: () => Unit
    ): MouseOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), initiated = initiated.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], setEstimatedPosition = js.Any.fromFunction1(setEstimatedPosition), setInitiated = js.Any.fromFunction1(setInitiated), showTooltip = js.Any.fromFunction0(showTooltip))
      __obj.asInstanceOf[MouseOptions]
    }
    
    extension [Self <: MouseOptions](x: Self) {
      
      inline def setDisableHoverMode(value: Boolean): Self = StObject.set(x, "disableHoverMode", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverModeUndefined: Self = StObject.set(x, "disableHoverMode", js.undefined)
    }
  }
  
  type MouseResult = js.Tuple3[
    js.Function0[Unit], 
    js.UndefOr[MouseEventHandler[HTMLElement]], 
    js.UndefOr[MouseEventHandler[HTMLElement]]
  ]
  
  type TooltipInitiated = UserInteractionMode | Null
  
  trait TouchOptions
    extends StObject
       with MergableTouchHandlers
       with HandlersBaseOptions {
    
    var visible: Boolean
  }
  object TouchOptions {
    
    inline def apply(
      delay: Double,
      hideTooltip: () => Unit,
      initiated: MutableRefObject[TooltipInitiated],
      mode: UserInteractionMode,
      setEstimatedPosition: HTMLElement => Unit,
      setInitiated: TooltipInitiated => Unit,
      showTooltip: () => Unit,
      visible: Boolean
    ): TouchOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), initiated = initiated.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], setEstimatedPosition = js.Any.fromFunction1(setEstimatedPosition), setInitiated = js.Any.fromFunction1(setInitiated), showTooltip = js.Any.fromFunction0(showTooltip), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchOptions]
    }
    
    extension [Self <: TouchOptions](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type TouchResult = js.Tuple4[
    js.Function0[Unit], 
    TouchEventHandler[HTMLElement], 
    TouchEventHandler[HTMLElement], 
    js.UndefOr[MouseEventHandler[HTMLElement]]
  ]
}
