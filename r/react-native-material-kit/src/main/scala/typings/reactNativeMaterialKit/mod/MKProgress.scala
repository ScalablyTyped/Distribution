package typings.reactNativeMaterialKit.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-material-kit", "MKProgress")
@js.native
class MKProgress protected ()
  extends MKComponent[MKProgressProperties, js.Any] {
  def this(props: MKProgressProperties) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MKProgressProperties, context: js.Any) = this()
}
object MKProgress {
  
  @JSImport("react-native-material-kit", "MKProgress.Indeterminate")
  @js.native
  class Indeterminate protected ()
    extends Component[IndeterminateProgressProperties, js.Object, js.Any] {
    def this(props: IndeterminateProgressProperties) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IndeterminateProgressProperties, context: js.Any) = this()
  }
}
