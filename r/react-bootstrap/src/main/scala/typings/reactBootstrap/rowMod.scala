package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowMod {
  
  @JSImport("react-bootstrap/lib/Row", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[RowProps, js.Object, js.Any]
  
  @js.native
  trait Row
    extends Component[RowProps, js.Object, js.Any]
  
  trait RowProps
    extends StObject
       with HTMLProps[Row] {
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
