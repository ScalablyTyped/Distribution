package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysisDataExport extends StObject {
  
  /**
    * Specifies the destination for the exported analytics data (documented below).
    */
  var destination: AnalyticsConfigurationStorageClassAnalysisDataExportDestination
  
  /**
    * The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
    */
  var outputSchemaVersion: js.UndefOr[String] = js.undefined
}
object AnalyticsConfigurationStorageClassAnalysisDataExport {
  
  inline def apply(destination: AnalyticsConfigurationStorageClassAnalysisDataExportDestination): AnalyticsConfigurationStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExport]
  }
  
  extension [Self <: AnalyticsConfigurationStorageClassAnalysisDataExport](x: Self) {
    
    inline def setDestination(value: AnalyticsConfigurationStorageClassAnalysisDataExportDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemaVersion(value: String): Self = StObject.set(x, "outputSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemaVersionUndefined: Self = StObject.set(x, "outputSchemaVersion", js.undefined)
  }
}
