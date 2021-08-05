package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysis extends StObject {
  
  /**
    * Data export configuration (documented below).
    */
  var dataExport: AnalyticsConfigurationStorageClassAnalysisDataExport
}
object AnalyticsConfigurationStorageClassAnalysis {
  
  inline def apply(dataExport: AnalyticsConfigurationStorageClassAnalysisDataExport): AnalyticsConfigurationStorageClassAnalysis = {
    val __obj = js.Dynamic.literal(dataExport = dataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysis]
  }
  
  extension [Self <: AnalyticsConfigurationStorageClassAnalysis](x: Self) {
    
    inline def setDataExport(value: AnalyticsConfigurationStorageClassAnalysisDataExport): Self = StObject.set(x, "dataExport", value.asInstanceOf[js.Any])
  }
}
