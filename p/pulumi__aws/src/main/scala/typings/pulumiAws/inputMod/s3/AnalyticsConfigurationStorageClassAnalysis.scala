package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysis extends js.Object {
  var dataExport: Input[AnalyticsConfigurationStorageClassAnalysisDataExport] = js.native
}

object AnalyticsConfigurationStorageClassAnalysis {
  @scala.inline
  def apply(dataExport: Input[AnalyticsConfigurationStorageClassAnalysisDataExport]): AnalyticsConfigurationStorageClassAnalysis = {
    val __obj = js.Dynamic.literal(dataExport = dataExport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysis]
  }
}

