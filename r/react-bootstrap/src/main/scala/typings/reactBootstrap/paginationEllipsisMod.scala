package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationEllipsisMod {
  
  @JSImport("react-bootstrap/lib/PaginationEllipsis", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PaginationEllipsisProps, js.Object, js.Any]
  
  @js.native
  trait PaginationEllipsis
    extends Component[PaginationEllipsisProps, js.Object, js.Any]
  
  trait PaginationEllipsisProps
    extends StObject
       with HTMLProps[PaginationEllipsis]
  object PaginationEllipsisProps {
    
    @scala.inline
    def apply(): PaginationEllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationEllipsisProps]
    }
  }
}
