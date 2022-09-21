package typings.reactDayPicker

import typings.reactDayPicker.dayPickerContextMod.DayPickerContextValue
import typings.reactDayPicker.selectMultipleContextMod.SelectMultipleContextValue
import typings.reactDayPicker.selectRangeContextMod.SelectRangeContextValue
import typings.reactDayPicker.typesModifiersMod.InternalModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInternalModifiersMod {
  
  @JSImport("react-day-picker/dist/contexts/Modifiers/utils/getInternalModifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInternalModifiers(
    dayPicker: DayPickerContextValue,
    selectMultiple: SelectMultipleContextValue,
    selectRange: SelectRangeContextValue
  ): InternalModifiers = (^.asInstanceOf[js.Dynamic].applyDynamic("getInternalModifiers")(dayPicker.asInstanceOf[js.Any], selectMultiple.asInstanceOf[js.Any], selectRange.asInstanceOf[js.Any])).asInstanceOf[InternalModifiers]
}
