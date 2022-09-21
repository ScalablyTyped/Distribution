package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPrevMod {
  
  @JSImport("react-bootstrap/lib/PaginationPrev", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationPrevProps, js.Object, Any]
  
  type PaginationPrev = Component[PaginationPrevProps, js.Object, Any]
  
  trait PaginationPrevProps
    extends StObject
       with HTMLProps[PaginationPrev]
  object PaginationPrevProps {
    
    inline def apply(): PaginationPrevProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationPrevProps]
    }
  }
}
