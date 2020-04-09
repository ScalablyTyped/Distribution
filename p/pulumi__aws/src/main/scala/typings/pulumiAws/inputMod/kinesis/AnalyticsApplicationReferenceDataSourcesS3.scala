package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

