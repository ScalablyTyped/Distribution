package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.rejected
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFulfilled[T] extends StObject {
  
  var data: js.UndefOr[T] = js.undefined
  
  var error: typings.std.Error
  
  var finishedAt: Date
  
  var isFulfilled: `false`
  
  var isInitial: `false`
  
  var isLoading: `false`
  
  var isPending: `false`
  
  var isRejected: `true`
  
  var isResolved: `false`
  
  var isSettled: `true`
  
  var startedAt: Date
  
  var status: rejected
  
  var value: typings.std.Error
}
object IsFulfilled {
  
  inline def apply[T](error: typings.std.Error, finishedAt: Date, startedAt: Date, value: typings.std.Error): IsFulfilled[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = false, isInitial = false, isLoading = false, isPending = false, isRejected = true, isResolved = false, isSettled = true, startedAt = startedAt.asInstanceOf[js.Any], status = "rejected", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFulfilled[T]]
  }
  
  extension [Self <: IsFulfilled[?], T](x: Self & IsFulfilled[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFinishedAt(value: Date): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setIsFulfilled(value: `false`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
    
    inline def setIsInitial(value: `false`): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsPending(value: `false`): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setIsRejected(value: `true`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
    
    inline def setIsResolved(value: `false`): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    inline def setIsSettled(value: `true`): Self = StObject.set(x, "isSettled", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.std.Error): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
