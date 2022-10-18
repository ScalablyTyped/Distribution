package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.RefreshControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("react-native-sensor-manager", "RefreshControl")
@js.native
open class RefreshControl protected ()
  extends typings.reactNative.mod.RefreshControl {
  def this(props: RefreshControlProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: RefreshControlProps, context: Any) = this()
}
/* static members */
object RefreshControl {
  
  @JSImport("react-native-sensor-manager", "RefreshControl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-sensor-manager", "RefreshControl.SIZE")
  @js.native
  def SIZE: js.Object = js.native
  inline def SIZE_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIZE")(x.asInstanceOf[js.Any])
}
