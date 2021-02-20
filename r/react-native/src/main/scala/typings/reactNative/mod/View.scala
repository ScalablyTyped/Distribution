package typings.reactNative.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-native", "View")
@js.native
class View ()
  extends Component[ViewProps, js.Object, js.Any]
/* static members */
object View {
  
  @JSImport("react-native", "View")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  @JSImport("react-native", "View.forceTouchAvailable")
  @js.native
  def forceTouchAvailable: Boolean = js.native
  @scala.inline
  def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
}
