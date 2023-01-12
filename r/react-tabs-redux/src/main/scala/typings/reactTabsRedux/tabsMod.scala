package typings.reactTabsRedux

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("react-tabs-redux/Tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends Component[TabsProps, js.Object, Any] {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: Any) = this()
  }
  
  trait TabsProps extends StObject {
    
    var activeLinkStyle: js.UndefOr[js.Object] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.undefined
    
    var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
    
    var selectedTab: js.UndefOr[String] = js.undefined
    
    var visibleTabStyle: js.UndefOr[js.Object] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsProps] (val x: Self) extends AnyVal {
      
      inline def setActiveLinkStyle(value: js.Object): Self = StObject.set(x, "activeLinkStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkStyleUndefined: Self = StObject.set(x, "activeLinkStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setHandleSelect(value: (/* tab */ String, /* name */ String) => Unit): Self = StObject.set(x, "handleSelect", js.Any.fromFunction2(value))
      
      inline def setHandleSelectUndefined: Self = StObject.set(x, "handleSelect", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* selectedTab */ String, /* name */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderActiveTabContentOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabContentOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActiveTabContentOnlyUndefined: Self = StObject.set(x, "renderActiveTabContentOnly", js.undefined)
      
      inline def setSelectedTab(value: String): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
      
      inline def setSelectedTabUndefined: Self = StObject.set(x, "selectedTab", js.undefined)
      
      inline def setVisibleTabStyle(value: js.Object): Self = StObject.set(x, "visibleTabStyle", value.asInstanceOf[js.Any])
      
      inline def setVisibleTabStyleUndefined: Self = StObject.set(x, "visibleTabStyle", js.undefined)
    }
  }
}
