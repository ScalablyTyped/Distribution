package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysisDataExportDestination extends StObject {
  
  /**
    * Analytics data export currently only supports an S3 bucket destination (documented below).
    */
  var s3BucketDestination: Input[
    AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
  ]
}
object AnalyticsConfigurationStorageClassAnalysisDataExportDestination {
  
  inline def apply(
    s3BucketDestination: Input[
      AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
    ]
  ): AnalyticsConfigurationStorageClassAnalysisDataExportDestination = {
    val __obj = js.Dynamic.literal(s3BucketDestination = s3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]
  }
  
  extension [Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestination](x: Self) {
    
    inline def setS3BucketDestination(
      value: Input[
          AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
        ]
    ): Self = StObject.set(x, "s3BucketDestination", value.asInstanceOf[js.Any])
  }
}
