package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.sidebarSidebarMod.SidebarComponent
import typings.semanticUiReact.sidebarSidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Namespace)
@js.native
object sidebarMod extends js.Object {
  
  @js.native
  class default protected ()
    extends Component[SidebarProps, ComponentState, js.Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: js.Any) = this()
  }
  @js.native
  object default extends TopLevel[SidebarComponent]
}
