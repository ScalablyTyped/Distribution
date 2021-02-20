package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends StObject {
  
  /**
    * The account ID that owns the destination bucket.
    */
  var bucketAccountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the destination bucket.
    */
  var bucketArn: Input[String] = js.native
  
  /**
    * The output format of exported analytics data. Allowed values: `CSV`. Default value: `CSV`.
    */
  var format: js.UndefOr[Input[String]] = js.native
  
  /**
    * Object prefix for filtering.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
}
object AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
  
  @scala.inline
  def apply(bucketArn: Input[String]): AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination]
  }
  
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationMutableBuilder[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketAccountId(value: Input[String]): Self = StObject.set(x, "bucketAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketAccountIdUndefined: Self = StObject.set(x, "bucketAccountId", js.undefined)
    
    @scala.inline
    def setBucketArn(value: Input[String]): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Input[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
