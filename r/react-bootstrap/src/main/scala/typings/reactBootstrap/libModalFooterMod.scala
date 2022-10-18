package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalFooterMod {
  
  @JSImport("react-bootstrap/lib/ModalFooter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalFooterProps, js.Object, Any]
  
  type ModalFooter = Component[ModalFooterProps, js.Object, Any]
  
  trait ModalFooterProps
    extends StObject
       with HTMLProps[ModalFooter] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object ModalFooterProps {
    
    inline def apply(): ModalFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalFooterProps]
    }
    
    extension [Self <: ModalFooterProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
