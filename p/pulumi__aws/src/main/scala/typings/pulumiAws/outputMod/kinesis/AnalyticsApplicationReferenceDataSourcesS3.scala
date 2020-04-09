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
}

