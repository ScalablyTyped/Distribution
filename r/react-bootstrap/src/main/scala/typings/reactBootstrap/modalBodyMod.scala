package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalBodyMod {
  
  @JSImport("react-bootstrap/lib/ModalBody", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ModalBodyProps, js.Object, js.Any]
  
  @js.native
  trait ModalBody
    extends Component[ModalBodyProps, js.Object, js.Any]
  
  trait ModalBodyProps
    extends StObject
       with HTMLProps[ModalBody] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ReactType[js.Any]] = js.undefined
  }
  object ModalBodyProps {
    
    inline def apply(): ModalBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalBodyProps]
    }
    
    extension [Self <: ModalBodyProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ReactType[js.Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
