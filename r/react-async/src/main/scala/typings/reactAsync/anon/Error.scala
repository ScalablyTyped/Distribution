package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncStrings.initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var data: Unit
  
  var error: Unit
  
  var finishedAt: Unit
  
  var initialValue: Unit
  
  var isFulfilled: `false`
  
  var isInitial: `false`
  
  var isLoading: `false`
  
  var isPending: `false`
  
  var isRejected: `false`
  
  var isResolved: `false`
  
  var isSettled: `false`
  
  var startedAt: Unit
  
  var status: initial
  
  var value: Unit
}
object Error {
  
  inline def apply(data: Unit, error: Unit, finishedAt: Unit, initialValue: Unit, startedAt: Unit, value: Unit): Error = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], initialValue = initialValue.asInstanceOf[js.Any], isFulfilled = false, isInitial = false, isLoading = false, isPending = false, isRejected = false, isResolved = false, isSettled = false, startedAt = startedAt.asInstanceOf[js.Any], status = "initial", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFinishedAt(value: Unit): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setInitialValue(value: Unit): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setIsFulfilled(value: `false`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
    
    inline def setIsInitial(value: `false`): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsPending(value: `false`): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    inline def setIsRejected(value: `false`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
    
    inline def setIsResolved(value: `false`): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    inline def setIsSettled(value: `false`): Self = StObject.set(x, "isSettled", value.asInstanceOf[js.Any])
    
    inline def setStartedAt(value: Unit): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: initial): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
