package typings.reactTabsRedux

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("react-tabs-redux/Tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends Component[TabsProps, js.Object, js.Any] {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: js.Any) = this()
  }
  
  trait TabsProps extends StObject {
    
    var activeLinkStyle: js.UndefOr[js.Object] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.undefined
    
    var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
    
    var selectedTab: js.UndefOr[String] = js.undefined
    
    var visibleTabStyle: js.UndefOr[js.Object] = js.undefined
  }
  object TabsProps {
    
    @scala.inline
    def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit class TabsPropsMutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLinkStyle(value: js.Object): Self = StObject.set(x, "activeLinkStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkStyleUndefined: Self = StObject.set(x, "activeLinkStyle", js.undefined)
      
      @scala.inline
      def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      @scala.inline
      def setHandleSelect(value: (/* tab */ String, /* name */ String) => Unit): Self = StObject.set(x, "handleSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleSelectUndefined: Self = StObject.set(x, "handleSelect", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* selectedTab */ String, /* name */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRenderActiveTabContentOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabContentOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderActiveTabContentOnlyUndefined: Self = StObject.set(x, "renderActiveTabContentOnly", js.undefined)
      
      @scala.inline
      def setSelectedTab(value: String): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedTabUndefined: Self = StObject.set(x, "selectedTab", js.undefined)
      
      @scala.inline
      def setVisibleTabStyle(value: js.Object): Self = StObject.set(x, "visibleTabStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleTabStyleUndefined: Self = StObject.set(x, "visibleTabStyle", js.undefined)
    }
  }
}
