package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "TabBarIOS")
@js.native
class TabBarIOS protected ()
  extends Component[TabBarIOSProps, js.Object, js.Any] {
  def this(props: TabBarIOSProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TabBarIOSProps, context: js.Any) = this()
}
/* static members */
object TabBarIOS {
  
  @JSImport("react-native", "TabBarIOS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "TabBarIOS.Item")
  @js.native
  def Item: Instantiable0[TabBarIOSItem] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[TabBarIOSItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
