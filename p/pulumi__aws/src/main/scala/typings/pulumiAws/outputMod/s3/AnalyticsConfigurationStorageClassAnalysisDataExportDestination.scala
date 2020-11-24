package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestination extends js.Object {
  
  /**
    * Analytics data export currently only supports an S3 bucket destination (documented below).
    */
  var s3BucketDestination: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = js.native
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
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationOps[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestination] (val x: Self) extends AnyVal {
    
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
    def setS3BucketDestination(value: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination): Self = this.set("s3BucketDestination", value.asInstanceOf[js.Any])
  }
}
