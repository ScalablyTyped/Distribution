package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterLoggingInfoBrokerLogsS3 extends StObject {
  
  /**
    * Name of the S3 bucket to deliver logs to.
    */
  var bucket: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Indicates whether you want to enable or disable streaming broker logs to Cloudwatch Logs.
    */
  var enabled: Input[Boolean]
  
  /**
    * Prefix to append to the folder name.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
}
object ClusterLoggingInfoBrokerLogsS3 {
  
  @scala.inline
  def apply(enabled: Input[Boolean]): ClusterLoggingInfoBrokerLogsS3 = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterLoggingInfoBrokerLogsS3]
  }
  
  @scala.inline
  implicit class ClusterLoggingInfoBrokerLogsS3MutableBuilder[Self <: ClusterLoggingInfoBrokerLogsS3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
