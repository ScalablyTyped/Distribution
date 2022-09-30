package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.NativeMethods */ @JSImport("react-native-windows/rntypes", "DrawerLayoutAndroid")
@js.native
open class DrawerLayoutAndroid ()
  extends Component[DrawerLayoutAndroidProps, js.Object, Any] {
  
  /**
    * Closes the drawer.
    */
  def closeDrawer(): Unit = js.native
  
  /**
    * Opens the drawer.
    */
  def openDrawer(): Unit = js.native
  
  /**
    * drawer's positions.
    */
  var positions: DrawerPosition = js.native
}
