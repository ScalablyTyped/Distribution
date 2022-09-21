package typings.reactToastify.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastContentProps[Data] extends StObject {
  
  var closeToast: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.UndefOr[Data] = js.undefined
  
  var toastProps: ToastProps
}
object ToastContentProps {
  
  inline def apply[Data](toastProps: ToastProps): ToastContentProps[Data] = {
    val __obj = js.Dynamic.literal(toastProps = toastProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastContentProps[Data]]
  }
  
  extension [Self <: ToastContentProps[?], Data](x: Self & ToastContentProps[Data]) {
    
    inline def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
    
    inline def setCloseToastUndefined: Self = StObject.set(x, "closeToast", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setToastProps(value: ToastProps): Self = StObject.set(x, "toastProps", value.asInstanceOf[js.Any])
  }
}
