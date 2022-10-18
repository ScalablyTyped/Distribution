package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuHeaderMod.MenuHeaderProps
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuMod.MenuComponent
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Menu")
@js.native
open class Menu protected () extends Component[MenuProps, ComponentState, Any] {
  def this(props: MenuProps) = this()
  def this(props: MenuProps, context: Any) = this()
}
object Menu extends Shortcut {
  
  @JSImport("semantic-ui-react", "Menu")
  @js.native
  val ^ : MenuComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Menu.Header")
  @js.native
  open class Header protected () extends Component[MenuHeaderProps, ComponentState, Any] {
    def this(props: MenuHeaderProps) = this()
    def this(props: MenuHeaderProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Menu.Item")
  @js.native
  open class Item protected () extends Component[MenuItemProps, ComponentState, Any] {
    def this(props: MenuItemProps) = this()
    def this(props: MenuItemProps, context: Any) = this()
  }
  
  type _To = MenuComponent
  
  /* This means you don't have to write `^`, but can instead just say `Menu.foo` */
  override def _to: MenuComponent = ^
}
