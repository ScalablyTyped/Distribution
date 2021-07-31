package typings.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proton-native", "Picker")
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
  
  @JSImport("proton-native", "Picker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("proton-native", "Picker.Item")
  @js.native
  def Item: Instantiable0[PickerItem] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[PickerItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
