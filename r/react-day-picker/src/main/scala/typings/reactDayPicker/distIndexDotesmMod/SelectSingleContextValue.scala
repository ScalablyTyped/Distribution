package typings.reactDayPicker.distIndexDotesmMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of a {@link SelectSingleContext}. */
trait SelectSingleContextValue extends StObject {
  
  /** Event handler to attach to the day button to enable the single select. */
  var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
  
  /** The day that has been selected. */
  var selected: js.UndefOr[js.Date] = js.undefined
}
object SelectSingleContextValue {
  
  inline def apply(): SelectSingleContextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectSingleContextValue]
  }
  
  extension [Self <: SelectSingleContextValue](x: Self) {
    
    inline def setOnDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
