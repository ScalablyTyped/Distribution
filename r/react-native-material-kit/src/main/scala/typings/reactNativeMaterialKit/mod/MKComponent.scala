package typings.reactNativeMaterialKit.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-kit", "MKComponent")
@js.native
class MKComponent[P, S] protected ()
  extends Component[P, S, js.Any] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
}
/* static members */
object MKComponent {
  
  @JSImport("react-native-material-kit", "MKComponent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-material-kit", "MKComponent.Builder")
  @js.native
  def Builder: js.Any = js.native
  @scala.inline
  def Builder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Builder")(x.asInstanceOf[js.Any])
}
