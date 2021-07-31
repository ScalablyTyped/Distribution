package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysisDataExportDestination extends StObject {
  
  /**
    * Analytics data export currently only supports an S3 bucket destination (documented below).
    */
  var s3BucketDestination: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
}
object AnalyticsConfigurationStorageClassAnalysisDataExportDestination {
  
  @scala.inline
  def apply(
    s3BucketDestination: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination
  ): AnalyticsConfigurationStorageClassAnalysisDataExportDestination = {
    val __obj = js.Dynamic.literal(s3BucketDestination = s3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestination]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationMutableBuilder[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketDestination(value: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination): Self = StObject.set(x, "s3BucketDestination", value.asInstanceOf[js.Any])
  }
}
