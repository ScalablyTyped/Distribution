package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionLoggingConfig extends StObject {
  
  /**
    * The Amazon S3 bucket to store the access logs in, for
    * example, `myawslogbucket.s3.amazonaws.com`.
    */
  var bucket: String
  
  /**
    * Specifies whether you want CloudFront to
    * include cookies in access logs (default: `false`).
    */
  var includeCookies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional string that you want CloudFront to prefix
    * to the access log filenames for this distribution, for example, `myprefix/`.
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object DistributionLoggingConfig {
  
  @scala.inline
  def apply(bucket: String): DistributionLoggingConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionLoggingConfig]
  }
  
  @scala.inline
  implicit class DistributionLoggingConfigMutableBuilder[Self <: DistributionLoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCookies(value: Boolean): Self = StObject.set(x, "includeCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCookiesUndefined: Self = StObject.set(x, "includeCookies", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
