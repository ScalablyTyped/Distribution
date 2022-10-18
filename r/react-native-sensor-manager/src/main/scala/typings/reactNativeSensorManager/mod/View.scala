package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-native-sensor-manager", "View")
@js.native
open class View protected ()
  extends typings.reactNative.mod.View {
  def this(props: ViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ViewProps, context: Any) = this()
}
/* static members */
object View {
  
  @JSImport("react-native-sensor-manager", "View")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
    * @platform ios
    */
  @JSImport("react-native-sensor-manager", "View.forceTouchAvailable")
  @js.native
  def forceTouchAvailable: Boolean = js.native
  inline def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
}
