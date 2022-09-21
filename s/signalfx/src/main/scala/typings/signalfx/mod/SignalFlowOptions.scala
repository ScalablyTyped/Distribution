package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalFlowOptions extends StObject {
  
  var apiEndpoint: js.UndefOr[String] = js.undefined
  
  var signalflowEndpoint: js.UndefOr[String] = js.undefined
  
  var webSocketErrorCallback: js.UndefOr[js.Function1[/* err */ Any, js.UndefOr[Unit]]] = js.undefined
}
object SignalFlowOptions {
  
  inline def apply(): SignalFlowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalFlowOptions]
  }
  
  extension [Self <: SignalFlowOptions](x: Self) {
    
    inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
    
    inline def setSignalflowEndpoint(value: String): Self = StObject.set(x, "signalflowEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSignalflowEndpointUndefined: Self = StObject.set(x, "signalflowEndpoint", js.undefined)
    
    inline def setWebSocketErrorCallback(value: /* err */ Any => js.UndefOr[Unit]): Self = StObject.set(x, "webSocketErrorCallback", js.Any.fromFunction1(value))
    
    inline def setWebSocketErrorCallbackUndefined: Self = StObject.set(x, "webSocketErrorCallback", js.undefined)
  }
}
