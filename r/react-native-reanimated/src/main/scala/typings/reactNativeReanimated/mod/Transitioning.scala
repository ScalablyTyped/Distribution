package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "Transitioning")
@js.native
class Transitioning protected ()
  extends Component[js.Object, js.Object, js.Any] {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: js.Any) = this()
}
/* static members */
object Transitioning {
  
  @JSImport("react-native-reanimated", "Transitioning")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated", "Transitioning.View")
  @js.native
  def View: Instantiable0[TransitioningView] = js.native
  inline def View_=(x: Instantiable0[TransitioningView]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
}
