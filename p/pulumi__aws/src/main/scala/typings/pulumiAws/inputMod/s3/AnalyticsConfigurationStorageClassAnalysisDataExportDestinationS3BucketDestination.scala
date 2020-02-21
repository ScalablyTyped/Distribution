package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends js.Object {
  var bucketAccountId: js.UndefOr[Input[String]] = js.native
  var bucketArn: Input[String] = js.native
  var format: js.UndefOr[Input[String]] = js.native
  var prefix: js.UndefOr[Input[String]] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
  @scala.inline
  def apply(
    bucketArn: Input[String],
    bucketAccountId: Input[String] = null,
    format: Input[String] = null,
    prefix: Input[String] = null
  ): AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any])
    if (bucketAccountId != null) __obj.updateDynamic("bucketAccountId")(bucketAccountId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination]
  }
}

