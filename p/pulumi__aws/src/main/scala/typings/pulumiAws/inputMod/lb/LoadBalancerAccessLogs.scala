package typings.pulumiAws.inputMod.lb

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerAccessLogs extends StObject {
  
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: Input[String]
  
  /**
    * Boolean to enable / disable `accessLogs`. Defaults to `false`, even when `bucket` is specified.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
}
object LoadBalancerAccessLogs {
  
  @scala.inline
  def apply(bucket: Input[String]): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
  
  @scala.inline
  implicit class LoadBalancerAccessLogsMutableBuilder[Self <: LoadBalancerAccessLogs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
