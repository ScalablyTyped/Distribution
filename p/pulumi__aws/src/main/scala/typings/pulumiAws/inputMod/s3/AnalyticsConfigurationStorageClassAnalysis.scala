package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysis extends StObject {
  
  /**
    * Data export configuration (documented below).
    */
  var dataExport: Input[AnalyticsConfigurationStorageClassAnalysisDataExport]
}
object AnalyticsConfigurationStorageClassAnalysis {
  
  @scala.inline
  def apply(dataExport: Input[AnalyticsConfigurationStorageClassAnalysisDataExport]): AnalyticsConfigurationStorageClassAnalysis = {
    val __obj = js.Dynamic.literal(dataExport = dataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysis]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisMutableBuilder[Self <: AnalyticsConfigurationStorageClassAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExport(value: Input[AnalyticsConfigurationStorageClassAnalysisDataExport]): Self = StObject.set(x, "dataExport", value.asInstanceOf[js.Any])
  }
}
