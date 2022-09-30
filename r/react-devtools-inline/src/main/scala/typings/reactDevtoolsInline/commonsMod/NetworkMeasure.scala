package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkMeasure extends StObject {
  
  val depth: Double
  
  var finishTimestamp: Milliseconds
  
  var firstReceivedDataTimestamp: Milliseconds
  
  var lastReceivedDataTimestamp: Milliseconds
  
  var priority: String
  
  var receiveResponseTimestamp: Milliseconds
  
  val requestId: String
  
  var requestMethod: String
  
  var sendRequestTimestamp: Milliseconds
  
  var url: String
}
object NetworkMeasure {
  
  inline def apply(
    depth: Double,
    finishTimestamp: Milliseconds,
    firstReceivedDataTimestamp: Milliseconds,
    lastReceivedDataTimestamp: Milliseconds,
    priority: String,
    receiveResponseTimestamp: Milliseconds,
    requestId: String,
    requestMethod: String,
    sendRequestTimestamp: Milliseconds,
    url: String
  ): NetworkMeasure = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], finishTimestamp = finishTimestamp.asInstanceOf[js.Any], firstReceivedDataTimestamp = firstReceivedDataTimestamp.asInstanceOf[js.Any], lastReceivedDataTimestamp = lastReceivedDataTimestamp.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], receiveResponseTimestamp = receiveResponseTimestamp.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], sendRequestTimestamp = sendRequestTimestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkMeasure]
  }
  
  extension [Self <: NetworkMeasure](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setFinishTimestamp(value: Milliseconds): Self = StObject.set(x, "finishTimestamp", value.asInstanceOf[js.Any])
    
    inline def setFirstReceivedDataTimestamp(value: Milliseconds): Self = StObject.set(x, "firstReceivedDataTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastReceivedDataTimestamp(value: Milliseconds): Self = StObject.set(x, "lastReceivedDataTimestamp", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setReceiveResponseTimestamp(value: Milliseconds): Self = StObject.set(x, "receiveResponseTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    inline def setSendRequestTimestamp(value: Milliseconds): Self = StObject.set(x, "sendRequestTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
