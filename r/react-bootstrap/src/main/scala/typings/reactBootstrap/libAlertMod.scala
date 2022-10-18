package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAlertMod {
  
  @JSImport("react-bootstrap/lib/Alert", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[AlertProps, js.Object, Any]
  
  type Alert = Component[AlertProps, js.Object, Any]
  
  trait AlertProps
    extends StObject
       with HTMLProps[Alert] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var closeLabel: js.UndefOr[String] = js.undefined
    
    /** @deprecated since v0.29.0 */ var dismissAfter: js.UndefOr[Double] = js.undefined
    
    // TODO: Add more specific type
    var onDismiss: js.UndefOr[js.Function] = js.undefined
  }
  object AlertProps {
    
    inline def apply(): AlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertProps]
    }
    
    extension [Self <: AlertProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      inline def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      inline def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      inline def setOnDismiss(value: js.Function): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    }
  }
}
