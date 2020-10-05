package typings.reactNative.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "DrawerLayoutAndroid")
@js.native
class DrawerLayoutAndroid ()
  extends Component[DrawerLayoutAndroidProps, js.Object, js.Any] {
  /**
    * drawer's positions.
    */
  var positions: DrawerPosition = js.native
  /**
    * Closes the drawer.
    */
  def closeDrawer(): Unit = js.native
  /**
    * Opens the drawer.
    */
  def openDrawer(): Unit = js.native
}

