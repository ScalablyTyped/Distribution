package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped new Some()Some((args  : ...any))Some(: react-native.react-native.NativeMethodsMixin) */ @JSImport("react-native", "View")
@js.native
class View () extends js.Object

/* RemoveDifficultInheritance: 
- Dropped new Some()Some((args  : ...any))Some(: react-native.react-native.NativeMethodsMixin) */ @JSImport("react-native", "View")
@js.native
object View extends js.Object {
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  var forceTouchAvailable: scala.Boolean = js.native
}

