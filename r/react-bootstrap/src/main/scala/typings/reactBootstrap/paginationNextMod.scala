package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationNextMod {
  
  @JSImport("react-bootstrap/lib/PaginationNext", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationNextProps, js.Object, Any]
  
  type PaginationNext = Component[PaginationNextProps, js.Object, Any]
  
  trait PaginationNextProps
    extends StObject
       with HTMLProps[PaginationNext]
  object PaginationNextProps {
    
    inline def apply(): PaginationNextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationNextProps]
    }
  }
}
