package typings.qiniuJs.anon

import typings.qiniuJs.esmLoggerMod.LogLevel
import typings.qiniuJs.qiniuJsStrings.`cn-east-2`
import typings.qiniuJs.qiniuJsStrings.as0
import typings.qiniuJs.qiniuJsStrings.http
import typings.qiniuJs.qiniuJsStrings.httpColon
import typings.qiniuJs.qiniuJsStrings.https
import typings.qiniuJs.qiniuJsStrings.httpsColon
import typings.qiniuJs.qiniuJsStrings.na0
import typings.qiniuJs.qiniuJsStrings.z0
import typings.qiniuJs.qiniuJsStrings.z1
import typings.qiniuJs.qiniuJsStrings.z2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<qiniu-js.qiniu-js/esm/upload.Config> */
trait PartialConfig extends StObject {
  
  var checkByMD5: js.UndefOr[Boolean] = js.undefined
  
  var checkByServer: js.UndefOr[Boolean] = js.undefined
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var concurrentRequestLimit: js.UndefOr[Double] = js.undefined
  
  var debugLogLevel: js.UndefOr[LogLevel] = js.undefined
  
  var disableStatisticsReport: js.UndefOr[Boolean] = js.undefined
  
  var forceDirect: js.UndefOr[Boolean] = js.undefined
  
  var region: js.UndefOr[z0 | z2 | na0 | as0 | z1 | `cn-east-2`] = js.undefined
  
  var retryCount: js.UndefOr[Double] = js.undefined
  
  var uphost: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var upprotocol: js.UndefOr[https | http | httpsColon | httpColon] = js.undefined
  
  var useCdnDomain: js.UndefOr[Boolean] = js.undefined
}
object PartialConfig {
  
  inline def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  
  extension [Self <: PartialConfig](x: Self) {
    
    inline def setCheckByMD5(value: Boolean): Self = StObject.set(x, "checkByMD5", value.asInstanceOf[js.Any])
    
    inline def setCheckByMD5Undefined: Self = StObject.set(x, "checkByMD5", js.undefined)
    
    inline def setCheckByServer(value: Boolean): Self = StObject.set(x, "checkByServer", value.asInstanceOf[js.Any])
    
    inline def setCheckByServerUndefined: Self = StObject.set(x, "checkByServer", js.undefined)
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setConcurrentRequestLimit(value: Double): Self = StObject.set(x, "concurrentRequestLimit", value.asInstanceOf[js.Any])
    
    inline def setConcurrentRequestLimitUndefined: Self = StObject.set(x, "concurrentRequestLimit", js.undefined)
    
    inline def setDebugLogLevel(value: LogLevel): Self = StObject.set(x, "debugLogLevel", value.asInstanceOf[js.Any])
    
    inline def setDebugLogLevelUndefined: Self = StObject.set(x, "debugLogLevel", js.undefined)
    
    inline def setDisableStatisticsReport(value: Boolean): Self = StObject.set(x, "disableStatisticsReport", value.asInstanceOf[js.Any])
    
    inline def setDisableStatisticsReportUndefined: Self = StObject.set(x, "disableStatisticsReport", js.undefined)
    
    inline def setForceDirect(value: Boolean): Self = StObject.set(x, "forceDirect", value.asInstanceOf[js.Any])
    
    inline def setForceDirectUndefined: Self = StObject.set(x, "forceDirect", js.undefined)
    
    inline def setRegion(value: z0 | z2 | na0 | as0 | z1 | `cn-east-2`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    
    inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
    
    inline def setUphost(value: js.Array[String] | String): Self = StObject.set(x, "uphost", value.asInstanceOf[js.Any])
    
    inline def setUphostUndefined: Self = StObject.set(x, "uphost", js.undefined)
    
    inline def setUphostVarargs(value: String*): Self = StObject.set(x, "uphost", js.Array(value*))
    
    inline def setUpprotocol(value: https | http | httpsColon | httpColon): Self = StObject.set(x, "upprotocol", value.asInstanceOf[js.Any])
    
    inline def setUpprotocolUndefined: Self = StObject.set(x, "upprotocol", js.undefined)
    
    inline def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
    
    inline def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
  }
}
