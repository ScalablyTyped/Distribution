package typings.reactNativeReanimated.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-reanimated", "TransitioningView")
@js.native
open class TransitioningView protected ()
  extends Component[TransitioningViewProps, js.Object, Any] {
  def this(props: TransitioningViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TransitioningViewProps, context: Any) = this()
  
  def animateNextTransition(): Unit = js.native
}
