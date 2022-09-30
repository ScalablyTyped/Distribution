package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the modifiers that are changed by the multiple selection. */
/* Inlined std.Pick<react-day-picker.react-day-picker.Modifiers, react-day-picker.react-day-picker.InternalModifier.Disabled> */
trait SelectMultipleModifiers extends StObject {
  
  var disabled: js.UndefOr[Any] = js.undefined
}
object SelectMultipleModifiers {
  
  inline def apply(): SelectMultipleModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMultipleModifiers]
  }
  
  extension [Self <: SelectMultipleModifiers](x: Self) {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
