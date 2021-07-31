package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "PickerIOS")
@js.native
class PickerIOS ()
  extends Component[PickerIOSProps, js.Object, js.Any]
/* static members */
object PickerIOS {
  
  @JSImport("react-native", "PickerIOS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "PickerIOS.Item")
  @js.native
  def Item: Instantiable0[PickerIOSItem] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[PickerIOSItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
