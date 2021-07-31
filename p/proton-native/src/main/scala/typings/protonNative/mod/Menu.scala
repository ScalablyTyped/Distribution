package typings.protonNative.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("proton-native", "Menu")
@js.native
class Menu protected ()
  extends Component[MenuProps, js.Object, js.Any] {
  def this(props: MenuProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MenuProps, context: js.Any) = this()
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
  @scala.inline
  def Item_=(x: Instantiable0[MenuItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
