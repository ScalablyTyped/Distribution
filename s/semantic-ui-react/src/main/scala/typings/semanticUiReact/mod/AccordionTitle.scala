package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "AccordionTitle")
@js.native
open class AccordionTitle protected () extends Component[AccordionTitleProps, ComponentState, Any] {
  def this(props: AccordionTitleProps) = this()
  def this(props: AccordionTitleProps, context: Any) = this()
}
object AccordionTitle {
  
  inline def apply: ComponentClass[AccordionTitleProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("AccordionTitle").asInstanceOf[ComponentClass[AccordionTitleProps, ComponentState]]
}
