package typings.reactNativeWindows.pickerWindowsMod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.reactNativeWindows.pickerPropsMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows/Libraries/Components/Picker/PickerWindows", "Picker")
@js.native
class Picker protected ()
  extends Component[IPickerProps, State, js.Any] {
  def this(props: IPickerProps) = this()
  
  var _onChange: js.Any = js.native
  
  var _rctPicker: js.Any = js.native
  
  var _setRef: js.Any = js.native
}
/* static members */
@JSImport("react-native-windows/Libraries/Components/Picker/PickerWindows", "Picker")
@js.native
object Picker extends js.Object {
  
  var Item: Instantiable0[PickerItem] = js.native
  
  def getDerivedStateFromProps(props: PickerPropsWithChildren): State = js.native
}
