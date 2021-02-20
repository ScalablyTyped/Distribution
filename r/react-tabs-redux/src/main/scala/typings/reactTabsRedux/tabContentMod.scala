package typings.reactTabsRedux

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContentMod {
  
  @JSImport("react-tabs-redux/TabContent", "TabContent")
  @js.native
  class TabContent protected ()
    extends Component[TabContentProps, js.Object, js.Any] {
    def this(props: TabContentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabContentProps, context: js.Any) = this()
  }
  
  @js.native
  trait TabContentProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.native
    
    var `for`: String | Double = js.native
    
    var isVisible: js.UndefOr[Boolean] = js.native
    
    var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var visibleClassName: js.UndefOr[String] = js.native
    
    var visibleStyle: js.UndefOr[js.Object] = js.native
  }
  object TabContentProps {
    
    @scala.inline
    def apply(`for`: String | Double): TabContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContentProps]
    }
    
    @scala.inline
    implicit class TabContentPropsMutableBuilder[Self <: TabContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      @scala.inline
      def setFor(value: String | Double): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      @scala.inline
      def setRenderActiveTabContentOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabContentOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderActiveTabContentOnlyUndefined: Self = StObject.set(x, "renderActiveTabContentOnly", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisibleClassName(value: String): Self = StObject.set(x, "visibleClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleClassNameUndefined: Self = StObject.set(x, "visibleClassName", js.undefined)
      
      @scala.inline
      def setVisibleStyle(value: js.Object): Self = StObject.set(x, "visibleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleStyleUndefined: Self = StObject.set(x, "visibleStyle", js.undefined)
    }
  }
}
