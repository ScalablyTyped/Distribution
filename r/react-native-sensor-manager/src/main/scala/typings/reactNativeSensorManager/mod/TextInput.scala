package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextInputState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.NativeMethods
- Dropped new (args : ...any): react-native.react-native.TimerMixin */ @JSImport("react-native-sensor-manager", "TextInput")
@js.native
open class TextInput protected ()
  extends typings.reactNative.mod.TextInput {
  def this(props: TextInputProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TextInputProps, context: Any) = this()
}
/* static members */
object TextInput {
  
  @JSImport("react-native-sensor-manager", "TextInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Access the current focus state.
    */
  @JSImport("react-native-sensor-manager", "TextInput.State")
  @js.native
  def State: TextInputState = js.native
  inline def State_=(x: TextInputState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("State")(x.asInstanceOf[js.Any])
}
