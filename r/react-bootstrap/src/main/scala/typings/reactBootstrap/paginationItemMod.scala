package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemMod {
  
  @JSImport("react-bootstrap/lib/PaginationItem", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PaginationItemProps, js.Object, js.Any]
  
  @js.native
  trait PaginationItem
    extends Component[PaginationItemProps, js.Object, js.Any]
  
  @js.native
  trait PaginationItemProps extends HTMLProps[PaginationItem] {
    
    var active: js.UndefOr[Boolean] = js.native
  }
  object PaginationItemProps {
    
    @scala.inline
    def apply(): PaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationItemProps]
    }
    
    @scala.inline
    implicit class PaginationItemPropsMutableBuilder[Self <: PaginationItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
}
