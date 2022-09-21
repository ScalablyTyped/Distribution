package typings.qiniuJs

import typings.qiniuJs.qiniuJsStrings.`jssdk-h5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportV3Mod {
  
  @JSImport("qiniu-js/esm/logger/report-v3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reportV3(token: String, data: V3LogInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportV3")(token.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportV3(token: String, data: V3LogInfo, retry: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportV3")(token.asInstanceOf[js.Any], data.asInstanceOf[js.Any], retry.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait V3LogInfo extends StObject {
    
    var bytesSent: Double
    
    var code: Double
    
    var duration: Double
    
    var host: String
    
    var port: String
    
    var remoteIp: String
    
    var reqId: String
    
    var size: Double
    
    var time: Double
    
    var upType: `jssdk-h5`
  }
  object V3LogInfo {
    
    inline def apply(
      bytesSent: Double,
      code: Double,
      duration: Double,
      host: String,
      port: String,
      remoteIp: String,
      reqId: String,
      size: Double,
      time: Double
    ): V3LogInfo = {
      val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], remoteIp = remoteIp.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], upType = "jssdk-h5")
      __obj.asInstanceOf[V3LogInfo]
    }
    
    extension [Self <: V3LogInfo](x: Self) {
      
      inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
      
      inline def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUpType(value: `jssdk-h5`): Self = StObject.set(x, "upType", value.asInstanceOf[js.Any])
    }
  }
}
