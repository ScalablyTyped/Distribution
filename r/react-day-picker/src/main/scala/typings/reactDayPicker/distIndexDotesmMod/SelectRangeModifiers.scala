package typings.reactDayPicker.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the modifiers that are changed by the range selection. */
/* Inlined std.Pick<react-day-picker.react-day-picker/dist/index.esm.Modifiers, react-day-picker.react-day-picker/dist/index.esm.InternalModifier.Disabled | react-day-picker.react-day-picker/dist/index.esm.InternalModifier.RangeEnd | react-day-picker.react-day-picker/dist/index.esm.InternalModifier.RangeMiddle | react-day-picker.react-day-picker/dist/index.esm.InternalModifier.RangeStart> */
trait SelectRangeModifiers extends StObject {
  
  var disabled: js.UndefOr[Any] = js.undefined
  
  var range_end: js.UndefOr[Any] = js.undefined
  
  var range_middle: js.UndefOr[Any] = js.undefined
  
  var range_start: js.UndefOr[Any] = js.undefined
}
object SelectRangeModifiers {
  
  inline def apply(): SelectRangeModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectRangeModifiers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectRangeModifiers] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setRange_end(value: Any): Self = StObject.set(x, "range_end", value.asInstanceOf[js.Any])
    
    inline def setRange_endUndefined: Self = StObject.set(x, "range_end", js.undefined)
    
    inline def setRange_middle(value: Any): Self = StObject.set(x, "range_middle", value.asInstanceOf[js.Any])
    
    inline def setRange_middleUndefined: Self = StObject.set(x, "range_middle", js.undefined)
    
    inline def setRange_start(value: Any): Self = StObject.set(x, "range_start", value.asInstanceOf[js.Any])
    
    inline def setRange_startUndefined: Self = StObject.set(x, "range_start", js.undefined)
  }
}
