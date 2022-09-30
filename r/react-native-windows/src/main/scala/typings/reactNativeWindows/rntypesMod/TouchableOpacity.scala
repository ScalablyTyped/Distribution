package typings.reactNativeWindows.rntypesMod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.TimerMixin
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.TouchableMixin
- Dropped new (args : ...any): react-native-windows.react-native-windows/rntypes.NativeMethods */ @JSImport("react-native-windows/rntypes", "TouchableOpacity")
@js.native
open class TouchableOpacity ()
  extends Component[TouchableOpacityProps, js.Object, Any] {
  
  /**
    * Animate the touchable to a new opacity.
    */
  def setOpacityTo(value: Double): Unit = js.native
}
