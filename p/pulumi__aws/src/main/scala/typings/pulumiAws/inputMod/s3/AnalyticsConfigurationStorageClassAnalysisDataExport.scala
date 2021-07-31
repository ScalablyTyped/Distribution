package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysisDataExport extends StObject {
  
  /**
    * Specifies the destination for the exported analytics data (documented below).
    */
  var destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]
  
  /**
    * The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
    */
  var outputSchemaVersion: js.UndefOr[Input[String]] = js.undefined
}
object AnalyticsConfigurationStorageClassAnalysisDataExport {
  
  @scala.inline
  def apply(destination: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]): AnalyticsConfigurationStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExport]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportMutableBuilder[Self <: AnalyticsConfigurationStorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Input[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSchemaVersion(value: Input[String]): Self = StObject.set(x, "outputSchemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSchemaVersionUndefined: Self = StObject.set(x, "outputSchemaVersion", js.undefined)
  }
}
