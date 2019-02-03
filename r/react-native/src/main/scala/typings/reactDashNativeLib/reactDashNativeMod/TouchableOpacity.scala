package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.TimerMixin
- Dropped new (args : ...any): react-native.react-native.TouchableMixin
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @JSImport("react-native", "TouchableOpacity")
@js.native
class TouchableOpacity ()
  extends reactLib.reactMod.Component[TouchableOpacityProps, js.Object, js.Any] {
  /**
    * Animate the touchable to a new opacity.
    */
  def setOpacityTo(value: scala.Double): scala.Unit = js.native
}

