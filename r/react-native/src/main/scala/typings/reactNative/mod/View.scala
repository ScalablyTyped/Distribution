package typings.reactNative.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "View")
@js.native
class View ()
  extends Component[ViewProps, js.Object, js.Any]

/* static members */
@JSImport("react-native", "View")
@js.native
object View extends js.Object {
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  var forceTouchAvailable: Boolean = js.native
}

