package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.menuItemMod.MenuItemProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "MenuItem")
@js.native
open class MenuItem protected () extends Component[MenuItemProps, ComponentState, Any] {
  def this(props: MenuItemProps) = this()
  def this(props: MenuItemProps, context: Any) = this()
}
object MenuItem {
  
  inline def apply: ComponentClass[MenuItemProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("MenuItem").asInstanceOf[ComponentClass[MenuItemProps, ComponentState]]
}
