package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @JSImport("react-native", "DrawerLayoutAndroid")
@js.native
class DrawerLayoutAndroid ()
  extends reactLib.reactMod.Component[DrawerLayoutAndroidProps, js.Object, js.Any] {
  /**
    * drawer's positions.
    */
  var positions: DrawerPosition = js.native
  /**
    * Closes the drawer.
    */
  def closeDrawer(): scala.Unit = js.native
  /**
    * Opens the drawer.
    */
  def openDrawer(): scala.Unit = js.native
}

