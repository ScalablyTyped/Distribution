package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
open class MKRadioButton protected () extends MKComponent[MKRadioButtonProperties, Any] {
  def this(props: MKRadioButtonProperties) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MKRadioButtonProperties, context: Any) = this()
}
object MKRadioButton {
  
  @JSImport("react-native-material-kit", "MKRadioButton.Group")
  @js.native
  open class Group ()
    extends StObject
       with MKRadioButtonGroup {
    def this(onAdd: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit]) = this()
    def this(
      onAdd: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit],
      onRemove: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit]
    ) = this()
    def this(
      onAdd: Unit,
      onRemove: js.Function1[/* btn */ typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, Unit]
    ) = this()
    
    def add(btn: typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
    
    /* CompleteClass */
    var buttons: js.Array[Any] = js.native
    
    def onChecked(btn: typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, checked: Boolean): Unit = js.native
    
    def onRemoved(btn: typings.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
  }
  
  @JSImport("react-native-material-kit", "MKRadioButton.MKRadioButton")
  @js.native
  open class MKRadioButton () extends StObject
}
