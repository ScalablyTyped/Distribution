package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "AccordionAccordion")
@js.native
class AccordionAccordion protected ()
  extends Component[AccordionAccordionProps, ComponentState, js.Any] {
  def this(props: AccordionAccordionProps) = this()
  def this(props: AccordionAccordionProps, context: js.Any) = this()
}
object AccordionAccordion {
  
  @scala.inline
  def apply: ComponentClass[AccordionAccordionProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("AccordionAccordion").asInstanceOf[ComponentClass[AccordionAccordionProps, ComponentState]]
}
