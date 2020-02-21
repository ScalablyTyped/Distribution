package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestination extends js.Object {
  var s3BucketDestination: Input[
    AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
  ] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExportDestination {
  @scala.inline
  def apply(
    s3BucketDestination: Input[
      AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
    ]
  ): AnalyticsConfigurationStorageClassAnalysisDataExportDestination = {
    val __obj = js.Dynamic.literal(s3BucketDestination = s3BucketDestination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]
  }
}

