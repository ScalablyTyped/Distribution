package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationNextMod {
  
  @JSImport("react-bootstrap/lib/PaginationNext", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PaginationNextProps, js.Object, js.Any]
  
  @js.native
  trait PaginationNext
    extends Component[PaginationNextProps, js.Object, js.Any]
  
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
