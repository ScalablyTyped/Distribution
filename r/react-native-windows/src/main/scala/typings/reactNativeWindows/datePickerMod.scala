package typings.reactNativeWindows

import typings.react.mod.Component
import typings.reactNativeWindows.datePickerPropsMod.IDatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/Libraries/Components/DatePicker/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  
  @js.native
  class DatePicker protected ()
    extends Component[IDatePickerProps, js.Object, js.Any] {
    def this(props: IDatePickerProps) = this()
    
    var _onChange: js.Any = js.native
    
    var _rctDatePicker: js.Any = js.native
    
    var _setRef: js.Any = js.native
  }
  /* static members */
  @js.native
  object DatePicker extends js.Object {
    
    var defaultProps: IDatePickerProps = js.native
  }
}
