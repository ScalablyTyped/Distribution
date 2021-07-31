package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.itemContentMod.ItemContentProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "ItemContent")
@js.native
class ItemContent protected ()
  extends Component[ItemContentProps, ComponentState, js.Any] {
  def this(props: ItemContentProps) = this()
  def this(props: ItemContentProps, context: js.Any) = this()
}
object ItemContent {
  
  @scala.inline
  def apply: ComponentClass[ItemContentProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("ItemContent").asInstanceOf[ComponentClass[ItemContentProps, ComponentState]]
}
