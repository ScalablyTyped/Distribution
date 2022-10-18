package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesSidebarSidebarMod.SidebarComponent
import typings.semanticUiReact.distCommonjsModulesSidebarSidebarMod.SidebarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesSidebarMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Default)
  @js.native
  open class default protected () extends Component[SidebarProps, ComponentState, Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Default)
  @js.native
  val default: SidebarComponent = js.native
  
  type _To = SidebarComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesSidebarMod.foo` */
  override def _to: SidebarComponent = default
}
