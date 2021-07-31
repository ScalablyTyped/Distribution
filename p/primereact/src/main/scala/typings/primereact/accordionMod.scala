package typings.primereact

import typings.primereact.anon.Index
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("primereact/components/accordion/Accordion", "Accordion")
  @js.native
  class Accordion protected ()
    extends Component[AccordionProps, js.Any, js.Any] {
    def this(props: AccordionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AccordionProps, context: js.Any) = this()
  }
  
  @JSImport("primereact/components/accordion/Accordion", "AccordionTab")
  @js.native
  class AccordionTab protected ()
    extends Component[AccordionTabProps, js.Any, js.Any] {
    def this(props: AccordionTabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AccordionTabProps, context: js.Any) = this()
  }
  
  trait AccordionProps extends StObject {
    
    var activeIndex: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapseIcon: js.UndefOr[String] = js.undefined
    
    var expandIcon: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.undefined
    
    var onTabClose: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.undefined
    
    var onTabOpen: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object AccordionProps {
    
    @scala.inline
    def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    @scala.inline
    implicit class AccordionPropsMutableBuilder[Self <: AccordionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: js.Any): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapseIcon(value: String): Self = StObject.set(x, "collapseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseIconUndefined: Self = StObject.set(x, "collapseIcon", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: String): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* e */ Index => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setOnTabClose(value: /* e */ Index => Unit): Self = StObject.set(x, "onTabClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabCloseUndefined: Self = StObject.set(x, "onTabClose", js.undefined)
      
      @scala.inline
      def setOnTabOpen(value: /* e */ Index => Unit): Self = StObject.set(x, "onTabOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabOpenUndefined: Self = StObject.set(x, "onTabOpen", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait AccordionTabProps extends StObject {
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[js.Object] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var headerClassName: js.UndefOr[String] = js.undefined
    
    var headerStyle: js.UndefOr[js.Object] = js.undefined
    
    var headerTemplate: js.UndefOr[js.Any] = js.undefined
  }
  object AccordionTabProps {
    
    @scala.inline
    def apply(): AccordionTabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionTabProps]
    }
    
    @scala.inline
    implicit class AccordionTabPropsMutableBuilder[Self <: AccordionTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: js.Object): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: js.Any): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
