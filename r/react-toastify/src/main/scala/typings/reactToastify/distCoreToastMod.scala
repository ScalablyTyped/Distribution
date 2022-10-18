package typings.reactToastify

import typings.reactToastify.distTypesMod.UpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreToastMod {
  
  trait ToastPromiseParams[T] extends StObject {
    
    var error: js.UndefOr[String | UpdateOptions[Any]] = js.undefined
    
    var pending: js.UndefOr[String | UpdateOptions[Unit]] = js.undefined
    
    var success: js.UndefOr[String | UpdateOptions[T]] = js.undefined
  }
  object ToastPromiseParams {
    
    inline def apply[T](): ToastPromiseParams[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastPromiseParams[T]]
    }
    
    extension [Self <: ToastPromiseParams[?], T](x: Self & ToastPromiseParams[T]) {
      
      inline def setError(value: String | UpdateOptions[Any]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setPending(value: String | UpdateOptions[Unit]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setSuccess(value: String | UpdateOptions[T]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
