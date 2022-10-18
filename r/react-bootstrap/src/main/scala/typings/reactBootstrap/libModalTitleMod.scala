package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalTitleMod {
  
  @JSImport("react-bootstrap/lib/ModalTitle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalTitleProps, js.Object, Any]
  
  type ModalTitle = Component[ModalTitleProps, js.Object, Any]
  
  trait ModalTitleProps
    extends StObject
       with HTMLProps[ModalTitle] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object ModalTitleProps {
    
    inline def apply(): ModalTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalTitleProps]
    }
    
    extension [Self <: ModalTitleProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
