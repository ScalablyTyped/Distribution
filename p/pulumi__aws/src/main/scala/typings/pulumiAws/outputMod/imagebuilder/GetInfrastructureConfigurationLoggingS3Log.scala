package typings.pulumiAws.outputMod.imagebuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfrastructureConfigurationLoggingS3Log extends js.Object {
  
  /**
    * Name of the S3 Bucket for logging.
    */
  var s3BucketName: String = js.native
  
  /**
    * Key prefix for S3 Bucket logging.
    */
  var s3KeyPrefix: String = js.native
}
object GetInfrastructureConfigurationLoggingS3Log {
  
  @scala.inline
  def apply(s3BucketName: String, s3KeyPrefix: String): GetInfrastructureConfigurationLoggingS3Log = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationLoggingS3Log]
  }
  
  @scala.inline
  implicit class GetInfrastructureConfigurationLoggingS3LogOps[Self <: GetInfrastructureConfigurationLoggingS3Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefix(value: String): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
  }
}
