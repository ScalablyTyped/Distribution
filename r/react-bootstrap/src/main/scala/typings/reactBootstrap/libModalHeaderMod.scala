package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalHeaderMod {
  
  @JSImport("react-bootstrap/lib/ModalHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalHeaderProps, js.Object, Any]
  
  type ModalHeader = Component[ModalHeaderProps, js.Object, Any]
  
  trait ModalHeaderProps
    extends StObject
       with HTMLProps[ModalHeader] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var closeLabel: js.UndefOr[String] = js.undefined
    
    var onHide: js.UndefOr[js.Function] = js.undefined
  }
  object ModalHeaderProps {
    
    inline def apply(): ModalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    }
  }
}
