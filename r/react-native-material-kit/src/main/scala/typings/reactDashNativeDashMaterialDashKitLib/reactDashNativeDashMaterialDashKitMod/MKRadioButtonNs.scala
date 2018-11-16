package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
object MKRadioButtonNs extends js.Object {
  @js.native
  class Group ()
    extends reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod.MKRadioButtonGroup {
    def this(onAdd: js.Function1[/* btn */ MKRadioButton, scala.Unit]) = this()
    def this(onAdd: js.Function1[/* btn */ MKRadioButton, scala.Unit], onRemove: js.Function1[/* btn */ MKRadioButton, scala.Unit]) = this()
    /* CompleteClass */
    override var buttons: js.Array[_] = js.native
    def add(btn: MKRadioButton): scala.Unit = js.native
    def onChecked(btn: MKRadioButton, checked: scala.Boolean): scala.Unit = js.native
    def onRemoved(btn: MKRadioButton): scala.Unit = js.native
  }
  
  @js.native
  class MKRadioButton () extends js.Object
  
}

