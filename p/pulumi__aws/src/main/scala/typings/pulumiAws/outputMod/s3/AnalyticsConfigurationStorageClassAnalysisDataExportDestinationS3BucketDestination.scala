package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends StObject {
  
  /**
    * The account ID that owns the destination bucket.
    */
  var bucketAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the destination bucket.
    */
  var bucketArn: String
  
  /**
    * The output format of exported analytics data. Allowed values: `CSV`. Default value: `CSV`.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Object prefix for filtering.
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
  
  @scala.inline
  def apply(bucketArn: String): AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationMutableBuilder[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketAccountId(value: String): Self = StObject.set(x, "bucketAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketAccountIdUndefined: Self = StObject.set(x, "bucketAccountId", js.undefined)
    
    @scala.inline
    def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
