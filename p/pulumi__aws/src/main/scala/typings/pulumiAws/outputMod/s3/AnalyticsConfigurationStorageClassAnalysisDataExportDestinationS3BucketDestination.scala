package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination extends js.Object {
  /**
    * The account ID that owns the destination bucket.
    */
  var bucketAccountId: js.UndefOr[String] = js.native
  /**
    * The ARN of the destination bucket.
    */
  var bucketArn: String = js.native
  /**
    * The output format of exported analytics data. Allowed values: `CSV`. Default value: `CSV`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Object prefix for filtering.
    */
  var prefix: js.UndefOr[String] = js.native
}

object AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination {
  @scala.inline
  def apply(bucketArn: String): AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination]
  }
  @scala.inline
  implicit class AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationOps[Self <: AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestination] (val x: Self) extends AnyVal {
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
    def setBucketArn(value: String): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketAccountId(value: String): Self = this.set("bucketAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketAccountId: Self = this.set("bucketAccountId", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

