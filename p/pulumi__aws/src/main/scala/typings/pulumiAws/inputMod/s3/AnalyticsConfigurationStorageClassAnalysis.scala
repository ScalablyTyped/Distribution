package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysis extends js.Object {
  /**
    * Data export configuration (documented below).
    */
  var dataExport: Input[AnalyticsConfigurationStorageClassAnalysisDataExport] = js.native
}

object AnalyticsConfigurationStorageClassAnalysis {
  @scala.inline
  def apply(dataExport: Input[AnalyticsConfigurationStorageClassAnalysisDataExport]): AnalyticsConfigurationStorageClassAnalysis = {
    val __obj = js.Dynamic.literal(dataExport = dataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysis]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisOps[Self <: AnalyticsConfigurationStorageClassAnalysis] (val x: Self) extends AnyVal {
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
    def setDataExport(value: Input[AnalyticsConfigurationStorageClassAnalysisDataExport]): Self = this.set("dataExport", value.asInstanceOf[js.Any])
  }
  
}

