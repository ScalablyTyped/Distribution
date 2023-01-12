package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.aborted
import typings.relayRuntime.relayRuntimeStrings.complete
import typings.relayRuntime.relayRuntimeStrings.error_
import typings.relayRuntime.relayRuntimeStrings.missing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingState extends StObject {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var status: aborted | complete | error_ | missing
}
object LoadingState {
  
  inline def apply(status: aborted | complete | error_ | missing): LoadingState = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadingState] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: aborted | complete | error_ | missing): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
