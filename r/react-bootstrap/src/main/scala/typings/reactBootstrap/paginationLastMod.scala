package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationLastMod {
  
  @JSImport("react-bootstrap/lib/PaginationLast", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationLastProps, js.Object, Any]
  
  type PaginationLast = Component[PaginationLastProps, js.Object, Any]
  
  trait PaginationLastProps
    extends StObject
       with HTMLProps[PaginationLast]
  object PaginationLastProps {
    
    inline def apply(): PaginationLastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLastProps]
    }
  }
}
