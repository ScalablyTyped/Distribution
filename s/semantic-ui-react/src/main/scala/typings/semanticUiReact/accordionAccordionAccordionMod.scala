package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.accordionPanelMod.AccordionPanelProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionAccordionMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionAccordion", JSImport.Default)
  @js.native
  open class default protected () extends Component[AccordionAccordionProps, ComponentState, Any] {
    def this(props: AccordionAccordionProps) = this()
    def this(props: AccordionAccordionProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionAccordion", JSImport.Default)
  @js.native
  val default: ComponentClass[AccordionAccordionProps, ComponentState] = js.native
  
  trait AccordionAccordionProps
    extends StObject
       with StrictAccordionAccordionProps
       with /* key */ StringDictionary[Any]
  object AccordionAccordionProps {
    
    inline def apply(): AccordionAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionAccordionProps]
    }
  }
  
  trait StrictAccordionAccordionProps extends StObject {
    
    /** Index of the currently active panel. */
    var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Initial activeIndex value. */
    var defaultActiveIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /** Only allow one panel open at a time. */
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called when a panel title is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {AccordionTitleProps} data - All item props.
      */
    var onTitleClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ AccordionTitleProps, 
          Unit
        ]
      ] = js.undefined
    
    /** Shorthand array of props for Accordion. */
    var panels: js.UndefOr[SemanticShorthandCollection[AccordionPanelProps]] = js.undefined
  }
  object StrictAccordionAccordionProps {
    
    inline def apply(): StrictAccordionAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionAccordionProps]
    }
    
    extension [Self <: StrictAccordionAccordionProps](x: Self) {
      
      inline def setActiveIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setActiveIndexVarargs(value: Double*): Self = StObject.set(x, "activeIndex", js.Array(value*))
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultActiveIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      inline def setDefaultActiveIndexVarargs(value: Double*): Self = StObject.set(x, "defaultActiveIndex", js.Array(value*))
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setOnTitleClick(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit
      ): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction2(value))
      
      inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      inline def setPanels(value: SemanticShorthandCollection[AccordionPanelProps]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
      
      inline def setPanelsVarargs(value: SemanticShorthandItem[AccordionPanelProps]*): Self = StObject.set(x, "panels", js.Array(value*))
    }
  }
  
  type _To = ComponentClass[AccordionAccordionProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `accordionAccordionAccordionMod.foo` */
  override def _to: ComponentClass[AccordionAccordionProps, ComponentState] = default
}
