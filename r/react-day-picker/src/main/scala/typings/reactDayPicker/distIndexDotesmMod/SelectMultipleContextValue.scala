package typings.reactDayPicker.distIndexDotesmMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of a {@link SelectMultipleContext}. */
trait SelectMultipleContextValue extends StObject {
  
  /** The modifiers for the corresponding selection. */
  var modifiers: SelectMultipleModifiers
  
  /** Event handler to attach to the day button to enable the multiple select. */
  var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
  
  /** The days that have been selected. */
  var selected: js.UndefOr[js.Array[js.Date]] = js.undefined
}
object SelectMultipleContextValue {
  
  inline def apply(modifiers: SelectMultipleModifiers): SelectMultipleContextValue = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMultipleContextValue]
  }
  
  extension [Self <: SelectMultipleContextValue](x: Self) {
    
    inline def setModifiers(value: SelectMultipleModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setOnDayClick(
      value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
    ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
    
    inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
    
    inline def setSelected(value: js.Array[js.Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: js.Date*): Self = StObject.set(x, "selected", js.Array(value*))
  }
}
