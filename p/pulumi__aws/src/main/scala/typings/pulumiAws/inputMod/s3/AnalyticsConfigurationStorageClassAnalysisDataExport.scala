package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExport extends js.Object {
  var destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination] = js.native
  var outputSchemaVersion: js.UndefOr[Input[String]] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExport {
  @scala.inline
  def apply(
    destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination],
    outputSchemaVersion: Input[String] = null
  ): AnalyticsConfigurationStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (outputSchemaVersion != null) __obj.updateDynamic("outputSchemaVersion")(outputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExport]
  }
}

