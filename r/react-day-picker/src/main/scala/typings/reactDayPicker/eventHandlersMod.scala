package typings.reactDayPicker

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.reactDayPicker.matchersMod.DateRange
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventHandlersMod {
  
  type DayClickEventHandler = js.Function3[
    /* day */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  type DayFocusEventHandler = js.Function3[
    /* day */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ (FocusEvent[Element, Element]) | KeyboardEvent[Element], 
    Unit
  ]
  
  type DayKeyboardEventHandler = js.Function3[
    /* day */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ KeyboardEvent[Element], 
    Unit
  ]
  
  type DayMouseEventHandler = js.Function3[
    /* day */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  type DayTouchEventHandler = js.Function3[
    /* day */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ TouchEvent[Element], 
    Unit
  ]
  
  type MonthChangeEventHandler = js.Function1[/* month */ js.Date, Unit]
  
  type SelectMultipleEventHandler = js.Function4[
    /* days */ js.UndefOr[js.Array[js.Date]], 
    /* selectedDay */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  type SelectRangeEventHandler = js.Function4[
    /* range */ js.UndefOr[DateRange], 
    /* selectedDay */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  type SelectSingleEventHandler = js.Function4[
    /* day */ js.UndefOr[js.Date], 
    /* selectedDay */ js.Date, 
    /* activeModifiers */ ActiveModifiers, 
    /* e */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
  
  type WeekNumberClickEventHandler = js.Function3[
    /* weekNumber */ Double, 
    /* dates */ js.Array[js.Date], 
    /* e */ MouseEvent[Element, NativeMouseEvent], 
    Unit
  ]
}
