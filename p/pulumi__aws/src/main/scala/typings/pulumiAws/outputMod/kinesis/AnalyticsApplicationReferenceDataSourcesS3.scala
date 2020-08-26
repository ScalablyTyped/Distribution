package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesS3 extends js.Object {
  /**
    * The S3 Bucket ARN.
    */
  var bucketArn: String = js.native
  /**
    * The File Key name containing reference data.
    */
  var fileKey: String = js.native
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: String = js.native
}

object AnalyticsApplicationReferenceDataSourcesS3 {
  @scala.inline
  def apply(bucketArn: String, fileKey: String, roleArn: String): AnalyticsApplicationReferenceDataSourcesS3 = {
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
    def setBucketArn(value: String): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileKey(value: String): Self = this.set("fileKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
  }
  
}

