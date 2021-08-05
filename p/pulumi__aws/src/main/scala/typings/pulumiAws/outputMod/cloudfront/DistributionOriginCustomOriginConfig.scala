package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginCustomOriginConfig extends StObject {
  
  /**
    * The HTTP port the custom origin listens on.
    */
  var httpPort: Double
  
  /**
    * The HTTPS port the custom origin listens on.
    */
  var httpsPort: Double
  
  /**
    * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originKeepaliveTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The origin protocol policy to apply to
    * your origin. One of `http-only`, `https-only`, or `match-viewer`.
    */
  var originProtocolPolicy: String
  
  /**
    * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originReadTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The SSL/TLS protocols that you want
    * CloudFront to use when communicating with your origin over HTTPS. A list of
    * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
    */
  var originSslProtocols: js.Array[String]
}
object DistributionOriginCustomOriginConfig {
  
  inline def apply(
    httpPort: Double,
    httpsPort: Double,
    originProtocolPolicy: String,
    originSslProtocols: js.Array[String]
  ): DistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomOriginConfig]
  }
  
  extension [Self <: DistributionOriginCustomOriginConfig](x: Self) {
    
    inline def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
    
    inline def setHttpsPort(value: Double): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeout(value: Double): Self = StObject.set(x, "originKeepaliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeoutUndefined: Self = StObject.set(x, "originKeepaliveTimeout", js.undefined)
    
    inline def setOriginProtocolPolicy(value: String): Self = StObject.set(x, "originProtocolPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeout(value: Double): Self = StObject.set(x, "originReadTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeoutUndefined: Self = StObject.set(x, "originReadTimeout", js.undefined)
    
    inline def setOriginSslProtocols(value: js.Array[String]): Self = StObject.set(x, "originSslProtocols", value.asInstanceOf[js.Any])
    
    inline def setOriginSslProtocolsVarargs(value: String*): Self = StObject.set(x, "originSslProtocols", js.Array(value :_*))
  }
}
