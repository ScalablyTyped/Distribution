package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationEllipsisMod {
  
  @JSImport("react-bootstrap/lib/PaginationEllipsis", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationEllipsisProps, js.Object, Any]
  
  type PaginationEllipsis = Component[PaginationEllipsisProps, js.Object, Any]
  
  trait PaginationEllipsisProps
    extends StObject
       with HTMLProps[PaginationEllipsis]
  object PaginationEllipsisProps {
    
    inline def apply(): PaginationEllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationEllipsisProps]
    }
  }
}
