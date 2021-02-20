package typings.reactNative.mod

import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "Picker")
@js.native
class Picker protected ()
  extends Component[PickerProps, js.Object, js.Any] {
  def this(props: PickerProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PickerProps, context: js.Any) = this()
}
/* static members */
object Picker {
  
  @JSImport("react-native", "Picker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "Picker.Item")
  @js.native
  def Item: ComponentType[PickerItemProps] = js.native
  @scala.inline
  def Item_=(x: ComponentType[PickerItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  /**
    * On Android, display the options in a dialog.
    */
  @JSImport("react-native", "Picker.MODE_DIALOG")
  @js.native
  def MODE_DIALOG: String = js.native
  @scala.inline
  def MODE_DIALOG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
  
  /**
    * On Android, display the options in a dropdown (this is the default).
    */
  @JSImport("react-native", "Picker.MODE_DROPDOWN")
  @js.native
  def MODE_DROPDOWN: String = js.native
  @scala.inline
  def MODE_DROPDOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
}
