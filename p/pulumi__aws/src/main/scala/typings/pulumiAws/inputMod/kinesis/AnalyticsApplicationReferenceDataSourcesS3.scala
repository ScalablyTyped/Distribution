package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationReferenceDataSourcesS3 extends js.Object {
  
  /**
    * The S3 Bucket ARN.
    */
  var bucketArn: Input[String] = js.native
  
  /**
    * The File Key name containing reference data.
    */
  var fileKey: Input[String] = js.native
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: Input[String] = js.native
}
object AnalyticsApplicationReferenceDataSourcesS3 {
  
  @scala.inline
  def apply(bucketArn: Input[String], fileKey: Input[String], roleArn: Input[String]): AnalyticsApplicationReferenceDataSourcesS3 = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesS3]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesS3Ops[Self <: AnalyticsApplicationReferenceDataSourcesS3] (val x: Self) extends AnyVal {
    
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
    def setBucketArn(value: Input[String]): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: Input[String]): Self = this.set("fileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
}
