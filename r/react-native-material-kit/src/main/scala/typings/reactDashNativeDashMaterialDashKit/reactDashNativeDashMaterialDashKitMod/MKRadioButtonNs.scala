package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
object MKRadioButtonNs extends js.Object {
  @js.native
  class Group () extends MKRadioButtonGroup {
    def this(onAdd: js.Function1[
            /* btn */ typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod.MKRadioButtonNs.MKRadioButton, 
            Unit
          ]) = this()
    def this(
      onAdd: js.Function1[
            /* btn */ typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod.MKRadioButtonNs.MKRadioButton, 
            Unit
          ],
      onRemove: js.Function1[
            /* btn */ typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod.MKRadioButtonNs.MKRadioButton, 
            Unit
          ]
    ) = this()
    /* CompleteClass */
    override var buttons: js.Array[_] = js.native
    def add(
      btn: typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod.MKRadioButtonNs.MKRadioButton
    ): Unit = js.native
    def onChecked(
      btn: typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod.MKRadioButtonNs.MKRadioButton,
      checked: Boolean
    ): Unit = js.native
    def onRemoved(
      btn: typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod.MKRadioButtonNs.MKRadioButton
    ): Unit = js.native
  }
  
  @js.native
  class MKRadioButton () extends js.Object
  
}

