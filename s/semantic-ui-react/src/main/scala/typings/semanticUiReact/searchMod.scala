package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.searchSearchMod.SearchComponent
import typings.semanticUiReact.searchSearchMod.SearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[SearchProps, ComponentState, js.Any] {
    def this(props: SearchProps) = this()
    def this(props: SearchProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[SearchComponent]
  
}

