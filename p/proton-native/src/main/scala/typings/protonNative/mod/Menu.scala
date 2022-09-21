package typings.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proton-native", "Menu")
@js.native
open class Menu protected ()
  extends Component[MenuProps, js.Object, Any] {
  def this(props: MenuProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MenuProps, context: Any) = this()
}
/* static members */
object Menu {
  
  @JSImport("proton-native", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A single item in a Menu.
    */
  @JSImport("proton-native", "Menu.Item")
  @js.native
  def Item: Instantiable0[MenuItem] = js.native
  inline def Item_=(x: Instantiable0[MenuItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
