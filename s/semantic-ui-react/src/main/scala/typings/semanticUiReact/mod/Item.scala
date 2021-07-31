package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.itemContentMod.ItemContentProps
import typings.semanticUiReact.itemItemMod.ItemComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item extends Shortcut {
  
  @JSImport("semantic-ui-react", "Item")
  @js.native
  val ^ : ItemComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Item.Content")
  @js.native
  class Content protected ()
    extends Component[ItemContentProps, ComponentState, js.Any] {
    def this(props: ItemContentProps) = this()
    def this(props: ItemContentProps, context: js.Any) = this()
  }
  
  type _To = ItemComponent
  
  /* This means you don't have to write `^`, but can instead just say `Item.foo` */
  override def _to: ItemComponent = ^
}
