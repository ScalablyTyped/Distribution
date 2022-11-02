package typings.reactToastify

import typings.reactToastify.distTypesMod.UpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreToastMod {
  
  trait ToastPromiseParams[TData, TError, TPending] extends StObject {
    
    var error: js.UndefOr[String | UpdateOptions[TError]] = js.undefined
    
    var pending: js.UndefOr[String | UpdateOptions[TPending]] = js.undefined
    
    var success: js.UndefOr[String | UpdateOptions[TData]] = js.undefined
  }
  object ToastPromiseParams {
    
    inline def apply[TData, TError, TPending](): ToastPromiseParams[TData, TError, TPending] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastPromiseParams[TData, TError, TPending]]
    }
    
    extension [Self <: ToastPromiseParams[?, ?, ?], TData, TError, TPending](x: Self & (ToastPromiseParams[TData, TError, TPending])) {
      
      inline def setError(value: String | UpdateOptions[TError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setPending(value: String | UpdateOptions[TPending]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      inline def setSuccess(value: String | UpdateOptions[TData]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
