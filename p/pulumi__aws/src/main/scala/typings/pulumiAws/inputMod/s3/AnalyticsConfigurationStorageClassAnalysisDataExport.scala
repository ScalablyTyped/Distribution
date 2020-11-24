package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExport extends js.Object {
  
  /**
    * Specifies the destination for the exported analytics data (documented below).
    */
  var destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination] = js.native
  
  /**
    * The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
    */
  var outputSchemaVersion: js.UndefOr[Input[String]] = js.native
}
object AnalyticsConfigurationStorageClassAnalysisDataExport {
  
  @scala.inline
  def apply(destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]): AnalyticsConfigurationStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExport]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportOps[Self <: AnalyticsConfigurationStorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSchemaVersion(value: Input[String]): Self = this.set("outputSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSchemaVersion: Self = this.set("outputSchemaVersion", js.undefined)
  }
}
