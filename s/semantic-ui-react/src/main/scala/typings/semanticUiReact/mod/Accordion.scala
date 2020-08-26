package typings.semanticUiReact.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.accordionAccordionMod.AccordionComponent
import typings.semanticUiReact.accordionAccordionMod.AccordionProps
import typings.semanticUiReact.accordionPanelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react", "Accordion")
@js.native
class Accordion protected ()
  extends Component[AccordionProps, ComponentState, js.Any] {
  def this(props: AccordionProps) = this()
  def this(props: AccordionProps, context: js.Any) = this()
}

@JSImport("semantic-ui-react", "Accordion")
@js.native
object Accordion extends TopLevel[AccordionComponent] {
  @js.native
  class Panel () extends default
  
}

