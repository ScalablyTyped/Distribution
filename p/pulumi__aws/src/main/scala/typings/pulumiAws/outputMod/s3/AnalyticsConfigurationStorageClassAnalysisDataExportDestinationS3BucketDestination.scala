package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends js.Object {
  var bucketAccountId: js.UndefOr[String] = js.native
  var bucketArn: String = js.native
  var format: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
  @scala.inline
  def apply(bucketArn: String, bucketAccountId: String = null, format: String = null, prefix: String = null): AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any])
    if (bucketAccountId != null) __obj.updateDynamic("bucketAccountId")(bucketAccountId.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination]
  }
}

