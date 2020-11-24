package typings.pulumiAws.inputMod.imagebuilder

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfrastructureConfigurationLoggingS3Logs extends js.Object {
  
  /**
    * Name of the S3 Bucket.
    */
  var s3BucketName: Input[String] = js.native
  
  /**
    * Prefix to use for S3 logs. Defaults to `/`.
    */
  var s3KeyPrefix: js.UndefOr[Input[String]] = js.native
}
object InfrastructureConfigurationLoggingS3Logs {
  
  @scala.inline
  def apply(s3BucketName: Input[String]): InfrastructureConfigurationLoggingS3Logs = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfrastructureConfigurationLoggingS3Logs]
  }
  
  @scala.inline
  implicit class InfrastructureConfigurationLoggingS3LogsOps[Self <: InfrastructureConfigurationLoggingS3Logs] (val x: Self) extends AnyVal {
    
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
    def setS3BucketName(value: Input[String]): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefix(value: Input[String]): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
  }
}
