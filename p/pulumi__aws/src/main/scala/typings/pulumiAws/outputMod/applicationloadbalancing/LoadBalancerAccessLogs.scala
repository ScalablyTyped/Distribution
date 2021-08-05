package typings.pulumiAws.outputMod.applicationloadbalancing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerAccessLogs extends StObject {
  
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: String
  
  /**
    * Boolean to enable / disable `accessLogs`. Defaults to `false`, even when `bucket` is specified.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object LoadBalancerAccessLogs {
  
  inline def apply(bucket: String): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
  
  extension [Self <: LoadBalancerAccessLogs](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
