package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesAccordionAccordionAccordionMod.AccordionAccordionProps
import typings.semanticUiReact.distCommonjsModulesAccordionAccordionMod.AccordionComponent
import typings.semanticUiReact.distCommonjsModulesAccordionAccordionMod.AccordionProps
import typings.semanticUiReact.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesAccordionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", JSImport.Default)
  @js.native
  open class default protected () extends Component[AccordionProps, ComponentState, Any] {
    def this(props: AccordionProps) = this()
    def this(props: AccordionProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", JSImport.Default)
    @js.native
    val ^ : AccordionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", "default.Accordion")
    @js.native
    open class Accordion protected () extends Component[AccordionAccordionProps, ComponentState, Any] {
      def this(props: AccordionAccordionProps) = this()
      def this(props: AccordionAccordionProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", "default.Panel")
    @js.native
    open class Panel ()
      extends typings.semanticUiReact.distCommonjsModulesAccordionAccordionPanelMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion", "default.Title")
    @js.native
    open class Title protected () extends Component[AccordionTitleProps, ComponentState, Any] {
      def this(props: AccordionTitleProps) = this()
      def this(props: AccordionTitleProps, context: Any) = this()
    }
    
    type _To = AccordionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AccordionComponent = ^
  }
}
