package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped new Some()Some((args  : ...any))Some(: react-native.react-native.NativeMethodsMixin) */ @JSImport("react-native", "DrawerLayoutAndroid")
@js.native
class DrawerLayoutAndroid () extends js.Object {
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

