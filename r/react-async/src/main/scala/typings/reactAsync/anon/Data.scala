package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.fulfilled
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T] extends StObject {
  
  var data: T
  
  var error: Unit
  
  var finishedAt: Date
  
  var isFulfilled: `true`
  
  var isInitial: `false`
  
  var isLoading: `false`
  
  var isPending: `false`
  
  var isRejected: `false`
  
  var isResolved: `true`
  
  var isSettled: `true`
  
  var startedAt: Date
  
  var status: fulfilled
  
  var value: T
}
object Data {
  
  @scala.inline
  def apply[T](data: T, error: Unit, finishedAt: Date, startedAt: Date, value: T): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = true, isInitial = false, isLoading = false, isPending = false, isRejected = false, isResolved = true, isSettled = true, startedAt = startedAt.asInstanceOf[js.Any], status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[?], T] (val x: Self & Data[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: Date): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFulfilled(value: `true`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitial(value: `false`): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPending(value: `false`): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRejected(value: `false`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResolved(value: `true`): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSettled(value: `true`): Self = StObject.set(x, "isSettled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
