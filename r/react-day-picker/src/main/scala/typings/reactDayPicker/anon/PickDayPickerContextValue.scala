package typings.reactDayPicker.anon

import typings.reactDayPicker.typesModifiersMod.ModifiersClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-day-picker.react-day-picker/dist/contexts/DayPicker.DayPickerContextValue, 'modifiersClassNames' | 'classNames'> */
trait PickDayPickerContextValue extends StObject {
  
  var classNames: RequiredClassNames
  
  var modifiersClassNames: ModifiersClassNames
}
object PickDayPickerContextValue {
  
  inline def apply(classNames: RequiredClassNames, modifiersClassNames: ModifiersClassNames): PickDayPickerContextValue = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], modifiersClassNames = modifiersClassNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDayPickerContextValue]
  }
  
  extension [Self <: PickDayPickerContextValue](x: Self) {
    
    inline def setClassNames(value: RequiredClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setModifiersClassNames(value: ModifiersClassNames): Self = StObject.set(x, "modifiersClassNames", value.asInstanceOf[js.Any])
  }
}
