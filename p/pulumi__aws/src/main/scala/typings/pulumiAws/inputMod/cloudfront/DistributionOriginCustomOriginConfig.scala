package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginCustomOriginConfig extends StObject {
  
  /**
    * The HTTP port the custom origin listens on.
    */
  var httpPort: Input[Double]
  
  /**
    * The HTTPS port the custom origin listens on.
    */
  var httpsPort: Input[Double]
  
  /**
    * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originKeepaliveTimeout: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The origin protocol policy to apply to
    * your origin. One of `http-only`, `https-only`, or `match-viewer`.
    */
  var originProtocolPolicy: Input[String]
  
  /**
    * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
    */
  var originReadTimeout: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The SSL/TLS protocols that you want
    * CloudFront to use when communicating with your origin over HTTPS. A list of
    * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
    */
  var originSslProtocols: Input[js.Array[Input[String]]]
}
object DistributionOriginCustomOriginConfig {
  
  inline def apply(
    httpPort: Input[Double],
    httpsPort: Input[Double],
    originProtocolPolicy: Input[String],
    originSslProtocols: Input[js.Array[Input[String]]]
  ): DistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal(httpPort = httpPort.asInstanceOf[js.Any], httpsPort = httpsPort.asInstanceOf[js.Any], originProtocolPolicy = originProtocolPolicy.asInstanceOf[js.Any], originSslProtocols = originSslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginCustomOriginConfig]
  }
  
  extension [Self <: DistributionOriginCustomOriginConfig](x: Self) {
    
    inline def setHttpPort(value: Input[Double]): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
    
    inline def setHttpsPort(value: Input[Double]): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeout(value: Input[Double]): Self = StObject.set(x, "originKeepaliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeoutUndefined: Self = StObject.set(x, "originKeepaliveTimeout", js.undefined)
    
    inline def setOriginProtocolPolicy(value: Input[String]): Self = StObject.set(x, "originProtocolPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeout(value: Input[Double]): Self = StObject.set(x, "originReadTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeoutUndefined: Self = StObject.set(x, "originReadTimeout", js.undefined)
    
    inline def setOriginSslProtocols(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "originSslProtocols", value.asInstanceOf[js.Any])
    
    inline def setOriginSslProtocolsVarargs(value: Input[String]*): Self = StObject.set(x, "originSslProtocols", js.Array(value :_*))
  }
}
