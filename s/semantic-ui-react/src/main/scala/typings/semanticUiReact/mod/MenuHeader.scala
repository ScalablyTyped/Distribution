package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsCollectionsMenuMenuHeaderMod.MenuHeaderProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "MenuHeader")
@js.native
open class MenuHeader protected () extends Component[MenuHeaderProps, ComponentState, Any] {
  def this(props: MenuHeaderProps) = this()
  def this(props: MenuHeaderProps, context: Any) = this()
}
object MenuHeader {
  
  inline def apply: ComponentClass[MenuHeaderProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("MenuHeader").asInstanceOf[ComponentClass[MenuHeaderProps, ComponentState]]
}
