package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.breadcrumbBreadcrumbMod.BreadcrumbComponent
import typings.semanticUiReact.breadcrumbBreadcrumbMod.BreadcrumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/collections/Breadcrumb", JSImport.Namespace)
@js.native
object breadcrumbMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[BreadcrumbProps, ComponentState, js.Any] {
    def this(props: BreadcrumbProps) = this()
    def this(props: BreadcrumbProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[BreadcrumbComponent]
  
}

