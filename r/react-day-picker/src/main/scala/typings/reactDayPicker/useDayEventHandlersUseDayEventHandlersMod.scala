package typings.reactDayPicker

import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.std.Element
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDayEventHandlersUseDayEventHandlersMod {
  
  @JSImport("react-day-picker/dist/hooks/useDayEventHandlers/useDayEventHandlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDayEventHandlers(date: js.Date, activeModifiers: ActiveModifiers): DayEventHandlers = (^.asInstanceOf[js.Dynamic].applyDynamic("useDayEventHandlers")(date.asInstanceOf[js.Any], activeModifiers.asInstanceOf[js.Any])).asInstanceOf[DayEventHandlers]
  
  /* Inlined std.Pick<react.react.HTMLProps<std.HTMLButtonElement>, react-day-picker.react-day-picker/dist/hooks/useDayEventHandlers/useDayEventHandlers.EventName> */
  trait DayEventHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.undefined
  }
  object DayEventHandlers {
    
    inline def apply(): DayEventHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayEventHandlers]
    }
    
    extension [Self <: DayEventHandlers](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[HTMLButtonElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLButtonElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnMouseEnter(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchCancel(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: TouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.reactDayPickerStrings.onDayClick
    - typings.reactDayPicker.reactDayPickerStrings.onDayFocus
    - typings.reactDayPicker.reactDayPickerStrings.onDayBlur
    - typings.reactDayPicker.reactDayPickerStrings.onDayKeyDown
    - typings.reactDayPicker.reactDayPickerStrings.onDayKeyUp
    - typings.reactDayPicker.reactDayPickerStrings.onDayMouseEnter
    - typings.reactDayPicker.reactDayPickerStrings.onDayMouseLeave
    - typings.reactDayPicker.reactDayPickerStrings.onDayTouchCancel
    - typings.reactDayPicker.reactDayPickerStrings.onDayTouchEnd
    - typings.reactDayPicker.reactDayPickerStrings.onDayTouchMove
    - typings.reactDayPicker.reactDayPickerStrings.onDayTouchStart
  */
  trait DayEventName extends StObject
  object DayEventName {
    
    inline def onDayBlur: typings.reactDayPicker.reactDayPickerStrings.onDayBlur = "onDayBlur".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayBlur]
    
    inline def onDayClick: typings.reactDayPicker.reactDayPickerStrings.onDayClick = "onDayClick".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayClick]
    
    inline def onDayFocus: typings.reactDayPicker.reactDayPickerStrings.onDayFocus = "onDayFocus".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayFocus]
    
    inline def onDayKeyDown: typings.reactDayPicker.reactDayPickerStrings.onDayKeyDown = "onDayKeyDown".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayKeyDown]
    
    inline def onDayKeyUp: typings.reactDayPicker.reactDayPickerStrings.onDayKeyUp = "onDayKeyUp".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayKeyUp]
    
    inline def onDayMouseEnter: typings.reactDayPicker.reactDayPickerStrings.onDayMouseEnter = "onDayMouseEnter".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayMouseEnter]
    
    inline def onDayMouseLeave: typings.reactDayPicker.reactDayPickerStrings.onDayMouseLeave = "onDayMouseLeave".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayMouseLeave]
    
    inline def onDayTouchCancel: typings.reactDayPicker.reactDayPickerStrings.onDayTouchCancel = "onDayTouchCancel".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayTouchCancel]
    
    inline def onDayTouchEnd: typings.reactDayPicker.reactDayPickerStrings.onDayTouchEnd = "onDayTouchEnd".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayTouchEnd]
    
    inline def onDayTouchMove: typings.reactDayPicker.reactDayPickerStrings.onDayTouchMove = "onDayTouchMove".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayTouchMove]
    
    inline def onDayTouchStart: typings.reactDayPicker.reactDayPickerStrings.onDayTouchStart = "onDayTouchStart".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onDayTouchStart]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.reactDayPickerStrings.onClick
    - typings.reactDayPicker.reactDayPickerStrings.onFocus
    - typings.reactDayPicker.reactDayPickerStrings.onBlur
    - typings.reactDayPicker.reactDayPickerStrings.onKeyDown
    - typings.reactDayPicker.reactDayPickerStrings.onKeyUp
    - typings.reactDayPicker.reactDayPickerStrings.onMouseEnter
    - typings.reactDayPicker.reactDayPickerStrings.onMouseLeave
    - typings.reactDayPicker.reactDayPickerStrings.onTouchCancel
    - typings.reactDayPicker.reactDayPickerStrings.onTouchEnd
    - typings.reactDayPicker.reactDayPickerStrings.onTouchMove
    - typings.reactDayPicker.reactDayPickerStrings.onTouchStart
  */
  trait EventName extends StObject
  object EventName {
    
    inline def onBlur: typings.reactDayPicker.reactDayPickerStrings.onBlur = "onBlur".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onBlur]
    
    inline def onClick: typings.reactDayPicker.reactDayPickerStrings.onClick = "onClick".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onClick]
    
    inline def onFocus: typings.reactDayPicker.reactDayPickerStrings.onFocus = "onFocus".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onFocus]
    
    inline def onKeyDown: typings.reactDayPicker.reactDayPickerStrings.onKeyDown = "onKeyDown".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onKeyDown]
    
    inline def onKeyUp: typings.reactDayPicker.reactDayPickerStrings.onKeyUp = "onKeyUp".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onKeyUp]
    
    inline def onMouseEnter: typings.reactDayPicker.reactDayPickerStrings.onMouseEnter = "onMouseEnter".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onMouseEnter]
    
    inline def onMouseLeave: typings.reactDayPicker.reactDayPickerStrings.onMouseLeave = "onMouseLeave".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onMouseLeave]
    
    inline def onTouchCancel: typings.reactDayPicker.reactDayPickerStrings.onTouchCancel = "onTouchCancel".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onTouchCancel]
    
    inline def onTouchEnd: typings.reactDayPicker.reactDayPickerStrings.onTouchEnd = "onTouchEnd".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onTouchEnd]
    
    inline def onTouchMove: typings.reactDayPicker.reactDayPickerStrings.onTouchMove = "onTouchMove".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onTouchMove]
    
    inline def onTouchStart: typings.reactDayPicker.reactDayPickerStrings.onTouchStart = "onTouchStart".asInstanceOf[typings.reactDayPicker.reactDayPickerStrings.onTouchStart]
  }
}
