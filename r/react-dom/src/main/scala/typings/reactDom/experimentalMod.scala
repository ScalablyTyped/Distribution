package typings.reactDom

import typings.reactDom.reactDomBooleans.`false`
import typings.reactDom.reactDomBooleans.`true`
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactDomAugmentingMod {
    
    @JSImport("react-dom", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def experimentalUseFormStatus(): FormStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useFormStatus")().asInstanceOf[FormStatus]
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusPending
      - typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusNotPending
    */
    trait FormStatus extends StObject
    object FormStatus {
      
      inline def FormStatusNotPending(action: Null, data: Null, method: Null): typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusNotPending = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = false)
        __obj.asInstanceOf[typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusNotPending]
      }
      
      inline def FormStatusPending(
        action: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]]),
        data: FormData,
        method: String
      ): typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusPending = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = true)
        __obj.asInstanceOf[typings.reactDom.experimentalMod.reactDomAugmentingMod.FormStatusPending]
      }
    }
    
    trait FormStatusNotPending
      extends StObject
         with typings.reactDom.mod.FormStatus
         with FormStatus {
      
      var action: Null
      
      var data: Null
      
      var method: Null
      
      var pending: `false`
    }
    object FormStatusNotPending {
      
      inline def apply(action: Null, data: Null, method: Null): FormStatusNotPending = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = false)
        __obj.asInstanceOf[FormStatusNotPending]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FormStatusNotPending] (val x: Self) extends AnyVal {
        
        inline def setAction(value: Null): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setData(value: Null): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: Null): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setPending(value: `false`): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      }
    }
    
    trait FormStatusPending
      extends StObject
         with typings.reactDom.mod.FormStatus
         with FormStatus {
      
      var action: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]])
      
      var data: FormData
      
      var method: String
      
      var pending: `true`
    }
    object FormStatusPending {
      
      inline def apply(
        action: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]]),
        data: FormData,
        method: String
      ): FormStatusPending = {
        val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pending = true)
        __obj.asInstanceOf[FormStatusPending]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FormStatusPending] (val x: Self) extends AnyVal {
        
        inline def setAction(value: String | (js.Function1[/* formData */ FormData, Unit | js.Promise[Unit]])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionFunction1(value: /* formData */ FormData => Unit | js.Promise[Unit]): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
        
        inline def setData(value: FormData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setPending(value: `true`): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      }
    }
  }
}
