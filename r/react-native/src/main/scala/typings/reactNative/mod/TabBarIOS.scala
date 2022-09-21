package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "TabBarIOS")
@js.native
open class TabBarIOS protected ()
  extends Component[TabBarIOSProps, js.Object, Any] {
  def this(props: TabBarIOSProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabBarIOSProps, context: Any) = this()
}
/* static members */
object TabBarIOS {
  
  @JSImport("react-native", "TabBarIOS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "TabBarIOS.Item")
  @js.native
  def Item: Instantiable0[TabBarIOSItem] = js.native
  inline def Item_=(x: Instantiable0[TabBarIOSItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
