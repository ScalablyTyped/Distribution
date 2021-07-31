package typings.primereact

import typings.primereact.anon.Index
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabViewMod {
  
  @JSImport("primereact/components/tabview/TabView", "TabPanel")
  @js.native
  class TabPanel protected ()
    extends Component[TabPanelProps, js.Any, js.Any] {
    def this(props: TabPanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabPanelProps, context: js.Any) = this()
  }
  
  @JSImport("primereact/components/tabview/TabView", "TabView")
  @js.native
  class TabView protected ()
    extends Component[TabViewProps, js.Any, js.Any] {
    def this(props: TabViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabViewProps, context: js.Any) = this()
  }
  
  trait TabPanelProps extends StObject {
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[js.Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var headerClassName: js.UndefOr[String] = js.undefined
    
    var headerStyle: js.UndefOr[js.Any] = js.undefined
    
    var leftIcon: js.UndefOr[String] = js.undefined
    
    var rightIcon: js.UndefOr[String] = js.undefined
  }
  object TabPanelProps {
    
    @scala.inline
    def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
    
    @scala.inline
    implicit class TabPanelPropsMutableBuilder[Self <: TabPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: js.Any): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
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
      def setHeaderStyle(value: js.Any): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLeftIcon(value: String): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      @scala.inline
      def setRightIcon(value: String): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    }
  }
  
  trait TabViewProps extends StObject {
    
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* e */ Index, Unit]] = js.undefined
    
    var renderActiveOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
  }
  object TabViewProps {
    
    @scala.inline
    def apply(): TabViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabViewProps]
    }
    
    @scala.inline
    implicit class TabViewPropsMutableBuilder[Self <: TabViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* e */ Index => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setRenderActiveOnly(value: Boolean): Self = StObject.set(x, "renderActiveOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderActiveOnlyUndefined: Self = StObject.set(x, "renderActiveOnly", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
