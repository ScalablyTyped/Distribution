package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.accordionAccordionMod.AccordionComponent
import typings.semanticUiReact.accordionAccordionMod.AccordionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", JSImport.Namespace)
@js.native
object accordionMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[AccordionProps, ComponentState, js.Any] {
    def this(props: AccordionProps) = this()
    def this(props: AccordionProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[AccordionComponent] {
    @js.native
    class Panel ()
      extends typings.semanticUiReact.accordionPanelMod.default
    
  }
  
}

