package typings.reactDayPicker.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactDayPicker.mod.DayPickerDefaultProps
  - typings.reactDayPicker.mod.DayPickerSingleProps
  - typings.reactDayPicker.mod.DayPickerMultipleProps
  - typings.reactDayPicker.mod.DayPickerRangeProps
*/
trait DayPickerProps extends StObject
object DayPickerProps {
  
  inline def DayPickerDefaultProps(): typings.reactDayPicker.mod.DayPickerDefaultProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.reactDayPicker.mod.DayPickerDefaultProps]
  }
  
  inline def DayPickerMultipleProps(): typings.reactDayPicker.mod.DayPickerMultipleProps = {
    val __obj = js.Dynamic.literal(mode = "multiple")
    __obj.asInstanceOf[typings.reactDayPicker.mod.DayPickerMultipleProps]
  }
  
  inline def DayPickerRangeProps(): typings.reactDayPicker.mod.DayPickerRangeProps = {
    val __obj = js.Dynamic.literal(mode = "range")
    __obj.asInstanceOf[typings.reactDayPicker.mod.DayPickerRangeProps]
  }
  
  inline def DayPickerSingleProps(): typings.reactDayPicker.mod.DayPickerSingleProps = {
    val __obj = js.Dynamic.literal(mode = "single")
    __obj.asInstanceOf[typings.reactDayPicker.mod.DayPickerSingleProps]
  }
}
