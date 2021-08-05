package typings.reactTabsRedux

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabLinkMod {
  
  @JSImport("react-tabs-redux/TabLink", "TabLink")
  @js.native
  class TabLink protected ()
    extends Component[TabLinkProps, js.Object, js.Any] {
    def this(props: TabLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabLinkProps, context: js.Any) = this()
  }
  
  trait TabLinkProps extends StObject {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[js.Object] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[String] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var to: Double | String
  }
  object TabLinkProps {
    
    inline def apply(to: Double | String): TabLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabLinkProps]
    }
    
    extension [Self <: TabLinkProps](x: Self) {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveStyle(value: js.Object): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setHandleSelect(value: (/* tab */ String, /* name */ String) => Unit): Self = StObject.set(x, "handleSelect", js.Any.fromFunction2(value))
      
      inline def setHandleSelectUndefined: Self = StObject.set(x, "handleSelect", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOnClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
