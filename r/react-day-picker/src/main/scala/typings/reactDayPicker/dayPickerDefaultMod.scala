package typings.reactDayPicker

import typings.reactDayPicker.dayPickerBaseMod.DayPickerBase
import typings.reactDayPicker.dayPickerBaseMod.DaySelectionMode
import typings.reactDayPicker.distDayPickerMod.DayPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerDefaultMod {
  
  @JSImport("react-day-picker/dist/types/DayPickerDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDayPickerDefault(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/types/DayPickerDefault.DayPickerDefaultProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerDefault")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerDefault.DayPickerDefaultProps */ Boolean]
  
  trait DayPickerDefaultProps
    extends StObject
       with DayPickerBase
       with DayPickerProps {
    
    var mode: js.UndefOr[DaySelectionMode] = js.undefined
  }
  object DayPickerDefaultProps {
    
    inline def apply(): DayPickerDefaultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DayPickerDefaultProps]
    }
    
    extension [Self <: DayPickerDefaultProps](x: Self) {
      
      inline def setMode(value: DaySelectionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
