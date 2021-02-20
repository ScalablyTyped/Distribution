package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
class MKRadioButton protected ()
  extends MKComponent[MKRadioButtonProperties, js.Any] {
  def this(props: MKRadioButtonProperties) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MKRadioButtonProperties, context: js.Any) = this()
}
object MKRadioButton {
  
  @JSImport("react-native-material-kit", "MKRadioButton.Group")
  @js.native
  class Group () extends MKRadioButtonGroup {
    def this(onAdd: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit]) = this()
    def this(
      onAdd: js.UndefOr[scala.Nothing],
      onRemove: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit]
    ) = this()
    def this(
      onAdd: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit],
      onRemove: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit]
    ) = this()
    
    def add(btn: typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
    
    def onChecked(btn: typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, checked: Boolean): Unit = js.native
    
    def onRemoved(btn: typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
  }
  
  @JSImport("react-native-material-kit", "MKRadioButton.MKRadioButton")
  @js.native
  class MKRadioButton () extends StObject
}
