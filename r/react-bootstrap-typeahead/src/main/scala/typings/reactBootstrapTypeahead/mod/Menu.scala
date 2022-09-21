package typings.reactBootstrapTypeahead.mod

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-typeahead", "Menu")
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
  
  @JSImport("react-bootstrap-typeahead", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-bootstrap-typeahead", "Menu.Divider")
  @js.native
  def Divider: FunctionComponent[js.Object] = js.native
  inline def Divider_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("react-bootstrap-typeahead", "Menu.Header")
  @js.native
  def Header: FunctionComponent[MenuHeaderProps] = js.native
  inline def Header_=(x: FunctionComponent[MenuHeaderProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
}
