package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.tabTabMod.TabComponent
import typings.semanticUiReact.tabTabMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Default)
  @js.native
  open class default protected () extends Component[TabProps, ComponentState, Any] {
    def this(props: TabProps) = this()
    def this(props: TabProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Default)
  @js.native
  val default: TabComponent = js.native
  
  type _To = TabComponent
  
  /* This means you don't have to write `default`, but can instead just say `tabMod.foo` */
  override def _to: TabComponent = default
}
