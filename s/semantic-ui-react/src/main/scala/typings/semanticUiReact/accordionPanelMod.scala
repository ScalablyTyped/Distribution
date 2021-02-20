package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.accordionContentMod.AccordionContentProps
import typings.semanticUiReact.accordionTitleMod.AccordionTitleProps
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionPanelMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Accordion/AccordionPanel", JSImport.Default)
  @js.native
  class default ()
    extends Component[AccordionPanelProps, js.Object, js.Any]
  
  type AccordionPanel = Component[AccordionPanelProps, js.Object, js.Any]
  
  @js.native
  trait AccordionPanelProps
    extends StrictAccordionPanelProps
       with /* key */ StringDictionary[js.Any]
  object AccordionPanelProps {
    
    @scala.inline
    def apply(): AccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionPanelProps]
    }
  }
  
  @js.native
  trait StrictAccordionPanelProps extends StObject {
    
    /** Whether or not the title is in the open state. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** A shorthand for Accordion.Content. */
    var content: js.UndefOr[SemanticShorthandItem[AccordionContentProps]] = js.native
    
    /** A panel index. */
    var index: js.UndefOr[Double | String] = js.native
    
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
      ] = js.native
    
    /** A shorthand for Accordion.Title. */
    var title: js.UndefOr[SemanticShorthandItem[AccordionTitleProps]] = js.native
  }
  object StrictAccordionPanelProps {
    
    @scala.inline
    def apply(): StrictAccordionPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictAccordionPanelProps]
    }
    
    @scala.inline
    implicit class StrictAccordionPanelPropsMutableBuilder[Self <: StrictAccordionPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandItem[AccordionContentProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction3(
        value: (/* component */ ElementType[AccordionContentProps], AccordionContentProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "content", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnTitleClick(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ AccordionTitleProps) => Unit
      ): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      @scala.inline
      def setTitle(value: SemanticShorthandItem[AccordionTitleProps]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction3(
        value: (/* component */ ElementType[AccordionTitleProps], AccordionTitleProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "title", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
