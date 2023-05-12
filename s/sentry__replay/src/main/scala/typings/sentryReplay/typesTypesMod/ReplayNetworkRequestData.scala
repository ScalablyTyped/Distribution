package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplayNetworkRequestData extends StObject {
  
  var endTimestamp: Double
  
  var method: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[ReplayNetworkRequestOrResponse] = js.undefined
  
  var response: js.UndefOr[ReplayNetworkRequestOrResponse] = js.undefined
  
  var startTimestamp: Double
  
  var statusCode: Double
  
  var url: String
}
object ReplayNetworkRequestData {
  
  inline def apply(endTimestamp: Double, startTimestamp: Double, statusCode: Double, url: String): ReplayNetworkRequestData = {
    val __obj = js.Dynamic.literal(endTimestamp = endTimestamp.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayNetworkRequestData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayNetworkRequestData] (val x: Self) extends AnyVal {
    
    inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRequest(value: ReplayNetworkRequestOrResponse): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: ReplayNetworkRequestOrResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
