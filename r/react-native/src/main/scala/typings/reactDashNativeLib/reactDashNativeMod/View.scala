package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @JSImport("react-native", "View")
@js.native
class View ()
  extends reactLib.reactMod.Component[ViewProps, js.Object, js.Any]

/* static members */
@JSImport("react-native", "View")
@js.native
object View extends js.Object {
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  var forceTouchAvailable: scala.Boolean = js.native
}

