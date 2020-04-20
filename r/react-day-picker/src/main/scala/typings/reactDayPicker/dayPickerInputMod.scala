package typings.reactDayPicker

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/DayPickerInput", JSImport.Namespace)
@js.native
object dayPickerInputMod extends js.Object {
  @js.native
  trait DayPickerInput
    extends Component[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DayPickerInputProps */ js.Any, 
          js.Any, 
          js.Any
        ] {
    def getDayPicker(): typings.reactDayPicker.dayPickerMod.default = js.native
    def getInput(): js.Any = js.native
    def hideDayPicker(): Unit = js.native
    def showDayPicker(): Unit = js.native
  }
  
  @js.native
  class default () extends DayPickerInput
  
}

