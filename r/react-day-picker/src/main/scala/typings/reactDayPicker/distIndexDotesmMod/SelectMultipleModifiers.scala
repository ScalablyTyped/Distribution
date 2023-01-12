package typings.reactDayPicker.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the modifiers that are changed by the multiple selection. */
/* Inlined std.Pick<react-day-picker.react-day-picker/dist/index.esm.Modifiers, react-day-picker.react-day-picker/dist/index.esm.InternalModifier.Disabled> */
trait SelectMultipleModifiers extends StObject {
  
  var disabled: js.UndefOr[Any] = js.undefined
}
object SelectMultipleModifiers {
  
  inline def apply(): SelectMultipleModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMultipleModifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectMultipleModifiers] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
