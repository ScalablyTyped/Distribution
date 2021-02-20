package typings.reactDayPicker

import typings.react.mod.Component
import typings.reactDayPicker.propsMod.DayPickerInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerInputMod {
  
  @JSImport("react-day-picker/types/DayPickerInput", JSImport.Default)
  @js.native
  class default () extends DayPickerInput
  
  @js.native
  trait DayPickerInput
    extends Component[DayPickerInputProps, js.Any, js.Any] {
    
    def getDayPicker(): typings.reactDayPicker.dayPickerMod.default = js.native
    
    def getInput(): js.Any = js.native
    
    def hideDayPicker(): Unit = js.native
    
    def showDayPicker(): Unit = js.native
  }
}
