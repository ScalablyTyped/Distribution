package typings.reactNativeReanimated.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "Transition")
@js.native
class Transition protected ()
  extends Component[js.Object, js.Object, js.Any] {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: js.Any) = this()
}
/* static members */
object Transition {
  
  @JSImport("react-native-reanimated", "Transition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated", "Transition.Change")
  @js.native
  def Change: ComponentClass[TransitionProps, ComponentState] = js.native
  inline def Change_=(x: ComponentClass[TransitionProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Change")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.In")
  @js.native
  def In: ComponentClass[TransitionInOutProps, ComponentState] = js.native
  inline def In_=(x: ComponentClass[TransitionInOutProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("In")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.Out")
  @js.native
  def Out: ComponentClass[TransitionInOutProps, ComponentState] = js.native
  inline def Out_=(x: ComponentClass[TransitionInOutProps, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Out")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.Sequence")
  @js.native
  def Sequence: ComponentClass[js.Object, ComponentState] = js.native
  inline def Sequence_=(x: ComponentClass[js.Object, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sequence")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-reanimated", "Transition.Together")
  @js.native
  def Together: ComponentClass[js.Object, ComponentState] = js.native
  inline def Together_=(x: ComponentClass[js.Object, ComponentState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Together")(x.asInstanceOf[js.Any])
}
