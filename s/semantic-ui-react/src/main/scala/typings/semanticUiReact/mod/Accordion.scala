package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps
import typings.semanticUiReact.accordionAccordionMod.AccordionComponent
import typings.semanticUiReact.accordionAccordionMod.AccordionProps
import typings.semanticUiReact.accordionPanelMod.default
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Accordion")
@js.native
class Accordion protected ()
  extends Component[AccordionProps, ComponentState, js.Any] {
  def this(props: AccordionProps) = this()
  def this(props: AccordionProps, context: js.Any) = this()
}
object Accordion extends Shortcut {
  
  @JSImport("semantic-ui-react", "Accordion")
  @js.native
  val ^ : AccordionComponent = js.native
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Accordion.Accordion")
  @js.native
  class Accordion protected ()
    extends Component[AccordionAccordionProps, ComponentState, js.Any] {
    def this(props: AccordionAccordionProps) = this()
    def this(props: AccordionAccordionProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Accordion.Panel")
  @js.native
  class Panel () extends default
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Accordion.Title")
  @js.native
  class Title protected ()
    extends Component[AccordionTitleProps, ComponentState, js.Any] {
    def this(props: AccordionTitleProps) = this()
    def this(props: AccordionTitleProps, context: js.Any) = this()
  }
  
  type _To = AccordionComponent
  
  /* This means you don't have to write `^`, but can instead just say `Accordion.foo` */
  override def _to: AccordionComponent = ^
}
