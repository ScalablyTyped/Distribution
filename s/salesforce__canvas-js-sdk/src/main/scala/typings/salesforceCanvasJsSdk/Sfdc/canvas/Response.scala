package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[T] extends StObject {
  
  val clientVersion: String
  
  val parentVersion: String
  
  val payload: T
  
  val responseHeaders: String
  
  val seq: Double
  
  val status: Double
  
  val statusText: String
  
  val targetModule: String
  
  val `type`: String
}
object Response {
  
  inline def apply[T](
    clientVersion: String,
    parentVersion: String,
    payload: T,
    responseHeaders: String,
    seq: Double,
    status: Double,
    statusText: String,
    targetModule: String,
    `type`: String
  ): Response[T] = {
    val __obj = js.Dynamic.literal(clientVersion = clientVersion.asInstanceOf[js.Any], parentVersion = parentVersion.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], targetModule = targetModule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  extension [Self <: Response[?], T](x: Self & Response[T]) {
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setParentVersion(value: String): Self = StObject.set(x, "parentVersion", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setTargetModule(value: String): Self = StObject.set(x, "targetModule", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
