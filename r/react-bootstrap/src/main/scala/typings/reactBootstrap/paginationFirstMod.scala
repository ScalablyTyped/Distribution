package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationFirstMod {
  
  @JSImport("react-bootstrap/lib/PaginationFirst", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PaginationFirstProps, js.Object, js.Any]
  
  @js.native
  trait PaginationFirst
    extends Component[PaginationFirstProps, js.Object, js.Any]
  
  trait PaginationFirstProps
    extends StObject
       with HTMLProps[PaginationFirst]
  object PaginationFirstProps {
    
    @scala.inline
    def apply(): PaginationFirstProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationFirstProps]
    }
  }
}
