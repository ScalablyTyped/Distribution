package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFilterParameters[Params /* <: js.Object */] extends StObject {
  
  def callback(cell: js.Any, params: Params): Boolean
  
  var callbackParameters: Params
}
object CustomFilterParameters {
  
  inline def apply[Params /* <: js.Object */](callback: (js.Any, Params) => Boolean, callbackParameters: Params): CustomFilterParameters[Params] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), callbackParameters = callbackParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilterParameters[Params]]
  }
  
  extension [Self <: CustomFilterParameters[?], Params /* <: js.Object */](x: Self & CustomFilterParameters[Params]) {
    
    inline def setCallback(value: (js.Any, Params) => Boolean): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackParameters(value: Params): Self = StObject.set(x, "callbackParameters", value.asInstanceOf[js.Any])
  }
}
