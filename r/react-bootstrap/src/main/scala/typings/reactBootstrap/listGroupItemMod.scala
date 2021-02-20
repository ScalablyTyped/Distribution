package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listGroupItemMod {
  
  @JSImport("react-bootstrap/lib/ListGroupItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ListGroupItemProps, js.Object, js.Any]
  
  @js.native
  trait ListGroupItem
    extends Component[ListGroupItemProps, js.Object, js.Any]
  
  @js.native
  trait ListGroupItemProps extends HTMLProps[ListGroupItem] {
    
    var active: js.UndefOr[js.Any] = js.native
    
    var bsSize: js.UndefOr[Sizes] = js.native
    
    var bsStyle: js.UndefOr[String] = js.native
    
    var eventKey: js.UndefOr[js.Any] = js.native
    
    var header: js.UndefOr[ReactNode] = js.native
    
    var listItem: js.UndefOr[Boolean] = js.native
  }
  object ListGroupItemProps {
    
    @scala.inline
    def apply(): ListGroupItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupItemProps]
    }
    
    @scala.inline
    implicit class ListGroupItemPropsMutableBuilder[Self <: ListGroupItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: js.Any): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      @scala.inline
      def setEventKey(value: js.Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setListItem(value: Boolean): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    }
  }
}
