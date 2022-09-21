package typings.reactNativeMaterialKit.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-kit", "MKProgress")
@js.native
open class MKProgress protected () extends MKComponent[MKProgressProperties, Any] {
  def this(props: MKProgressProperties) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MKProgressProperties, context: Any) = this()
}
object MKProgress {
  
  @JSImport("react-native-material-kit", "MKProgress.Indeterminate")
  @js.native
  open class Indeterminate protected ()
    extends Component[IndeterminateProgressProperties, js.Object, Any] {
    def this(props: IndeterminateProgressProperties) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IndeterminateProgressProperties, context: Any) = this()
  }
}
