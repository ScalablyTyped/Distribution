package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.tabTabMod.TabComponent
import typings.semanticUiReact.tabTabMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/modules/Tab", JSImport.Namespace)
@js.native
object tabMod extends js.Object {
  
  @js.native
  class default protected ()
    extends Component[TabProps, ComponentState, js.Any] {
    def this(props: TabProps) = this()
    def this(props: TabProps, context: js.Any) = this()
  }
  @js.native
  object default extends TopLevel[TabComponent]
}
