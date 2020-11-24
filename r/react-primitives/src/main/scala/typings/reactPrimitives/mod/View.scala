package typings.reactPrimitives.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "View")
@js.native
class View ()
  extends typings.reactNative.mod.View
/* static members */
@JSImport("react-primitives", "View")
@js.native
object View extends js.Object {
  
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  var forceTouchAvailable: Boolean = js.native
}
