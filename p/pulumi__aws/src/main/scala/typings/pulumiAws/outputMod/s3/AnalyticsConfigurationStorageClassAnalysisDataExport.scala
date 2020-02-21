package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExport extends js.Object {
  var destination: AnalyticsConfigurationStorageClassAnalysisDataExportDestination = js.native
  var outputSchemaVersion: js.UndefOr[String] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExport {
  @scala.inline
  def apply(
    destination: AnalyticsConfigurationStorageClassAnalysisDataExportDestination,
    outputSchemaVersion: String = null
  ): AnalyticsConfigurationStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (outputSchemaVersion != null) __obj.updateDynamic("outputSchemaVersion")(outputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExport]
  }
}

