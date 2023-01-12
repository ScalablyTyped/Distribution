package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListGroupItemMod {
  
  @JSImport("react-bootstrap/lib/ListGroupItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ListGroupItemProps, js.Object, Any]
  
  type ListGroupItem = Component[ListGroupItemProps, js.Object, Any]
  
  trait ListGroupItemProps
    extends StObject
       with HTMLProps[ListGroupItem] {
    
    var active: js.UndefOr[Any] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var header: js.UndefOr[ReactNode] = js.undefined
    
    var listItem: js.UndefOr[Boolean] = js.undefined
  }
  object ListGroupItemProps {
    
    inline def apply(): ListGroupItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListGroupItemProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setListItem(value: Boolean): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    }
  }
}
