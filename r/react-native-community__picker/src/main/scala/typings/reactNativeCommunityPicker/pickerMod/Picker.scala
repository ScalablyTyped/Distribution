package typings.reactNativeCommunityPicker.pickerMod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/picker/typings/Picker", "Picker")
@js.native
class Picker ()
  extends Component[PickerProps, js.Object, js.Any]
/* static members */
@JSImport("@react-native-community/picker/typings/Picker", "Picker")
@js.native
object Picker extends js.Object {
  
  var Item: ComponentType[PickerItemProps] = js.native
  
  /**
    * On Android, display the options in a dialog.
    */
  var MODE_DIALOG: String = js.native
  
  /**
    * On Android, display the options in a dropdown (this is the default).
    */
  var MODE_DROPDOWN: String = js.native
}
