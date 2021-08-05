package typings.semanticUiReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.accordionAccordionAccordionMod.AccordionAccordionProps
import typings.semanticUiReact.accordionAccordionAccordionMod.StrictAccordionAccordionProps
import typings.semanticUiReact.accordionContentMod.AccordionContentProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AccordionProps, ComponentState, js.Any] {
    def this(props: AccordionProps) = this()
    def this(props: AccordionProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", JSImport.Default)
    @js.native
    val ^ : AccordionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", "default.Accordion")
    @js.native
    class Accordion protected ()
      extends Component[AccordionAccordionProps, ComponentState, js.Any] {
      def this(props: AccordionAccordionProps) = this()
      def this(props: AccordionAccordionProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", "default.Panel")
    @js.native
    class Panel ()
      extends typings.semanticUiReact.accordionPanelMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/Accordion", "default.Title")
    @js.native
    class Title protected ()
      extends Component[AccordionTitleProps, ComponentState, js.Any] {
      def this(props: AccordionTitleProps) = this()
      def this(props: AccordionTitleProps, context: js.Any) = this()
    }
    
    type _To = AccordionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AccordionComponent = ^
  }
  
  @js.native
  trait AccordionComponent
    extends StObject
       with ComponentClass[AccordionProps, ComponentState] {
    
    var Accordion: ComponentClass[AccordionAccordionProps, ComponentState] = js.native
    
    var Content: StatelessComponent[AccordionContentProps] = js.native
    
    var Panel: Instantiable0[typings.semanticUiReact.accordionPanelMod.default] = js.native
    
    var Title: ComponentClass[AccordionTitleProps, ComponentState] = js.native
  }
  
  trait AccordionProps
    extends StObject
       with StrictAccordionProps
       with /* key */ StringDictionary[js.Any]
  object AccordionProps {
    
    inline def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
  }
  
  trait StrictAccordionProps
    extends StObject
       with StrictAccordionAccordionProps {
    
    /** Format to take up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Format for dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Adds some basic styling to accordion panels. */
    var styled: js.UndefOr[Boolean] = js.undefined
  }
  object StrictAccordionProps {
    
    inline def apply(): StrictAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionProps]
    }
    
    extension [Self <: StrictAccordionProps](x: Self) {
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setStyled(value: Boolean): Self = StObject.set(x, "styled", value.asInstanceOf[js.Any])
      
      inline def setStyledUndefined: Self = StObject.set(x, "styled", js.undefined)
    }
  }
}
