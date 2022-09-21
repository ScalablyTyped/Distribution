package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishedAt[T] extends StObject {
  
  var data: js.UndefOr[T] = js.undefined
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var finishedAt: Unit
  
  var isFulfilled: `false`
  
  var isInitial: `false`
  
  var isLoading: `true`
  
  var isPending: `true`
  
  var isRejected: `false`
  
  var isResolved: `false`
  
  var isSettled: `false`
  
  var startedAt: js.Date
  
  var status: pending
  
  var value: js.UndefOr[T | js.Error] = js.undefined
}
object FinishedAt {
  
  inline def apply[T](finishedAt: Unit, startedAt: js.Date): FinishedAt[T] = {
    val __obj = js.Dynamic.literal(finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = false, isInitial = false, isLoading = true, isPending = true, isRejected = false, isResolved = false, isSettled = false, startedAt = startedAt.asInstanceOf[js.Any], status = "pending")
    __obj.asInstanceOf[FinishedAt[T]]
  }
  
  extension [Self <: FinishedAt[?], T](x: Self & FinishedAt[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFinishedAt(value: Unit): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setIsFulfilled(value: `false`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
    
    inline def setIsInitial(value: `false`): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `true`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsPending(value: `true`): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setIsRejected(value: `false`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
    
    inline def setIsResolved(value: `false`): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    inline def setIsSettled(value: `false`): Self = StObject.set(x, "isSettled", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T | js.Error): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
