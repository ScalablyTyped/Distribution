package typings.reactDayPicker

import typings.react.mod.Component
import typings.reactDayPicker.dayPickerMod.default
import typings.reactDayPicker.propsMod.DayPickerInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/DayPickerInput", JSImport.Namespace)
@js.native
object dayPickerInputMod extends js.Object {
  @js.native
  class DayPickerInput ()
    extends Component[DayPickerInputProps, js.Any, js.Any] {
    def getDayPicker(): default = js.native
    def getInput(): js.Any = js.native
    def hideDayPicker(): Unit = js.native
    def showDayPicker(): Unit = js.native
  }
  
}

