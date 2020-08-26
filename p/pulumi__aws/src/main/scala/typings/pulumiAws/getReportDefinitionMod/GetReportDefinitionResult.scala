package typings.pulumiAws.getReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReportDefinitionResult extends js.Object {
  /**
    * A list of additional artifacts.
    */
  val additionalArtifacts: js.Array[String] = js.native
  /**
    * A list of schema elements.
    */
  val additionalSchemaElements: js.Array[String] = js.native
  /**
    * Preferred format for report.
    */
  val compression: String = js.native
  /**
    * Preferred compression format for report.
    */
  val format: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val reportName: String = js.native
  /**
    * Name of customer S3 bucket.
    */
  val s3Bucket: String = js.native
  /**
    * Preferred report path prefix.
    */
  val s3Prefix: String = js.native
  /**
    * Region of customer S3 bucket.
    */
  val s3Region: String = js.native
  /**
    * The frequency on which report data are measured and displayed.
    */
  val timeUnit: String = js.native
}

object GetReportDefinitionResult {
  @scala.inline
  def apply(
    additionalArtifacts: js.Array[String],
    additionalSchemaElements: js.Array[String],
    compression: String,
    format: String,
    id: String,
    reportName: String,
    s3Bucket: String,
    s3Prefix: String,
    s3Region: String,
    timeUnit: String
  ): GetReportDefinitionResult = {
    val __obj = js.Dynamic.literal(additionalArtifacts = additionalArtifacts.asInstanceOf[js.Any], additionalSchemaElements = additionalSchemaElements.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reportName = reportName.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Prefix = s3Prefix.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportDefinitionResult]
  }
  @scala.inline
  implicit class GetReportDefinitionResultOps[Self <: GetReportDefinitionResult] (val x: Self) extends AnyVal {
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
    def setAdditionalArtifactsVarargs(value: String*): Self = this.set("additionalArtifacts", js.Array(value :_*))
    @scala.inline
    def setAdditionalArtifacts(value: js.Array[String]): Self = this.set("additionalArtifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalSchemaElementsVarargs(value: String*): Self = this.set("additionalSchemaElements", js.Array(value :_*))
    @scala.inline
    def setAdditionalSchemaElements(value: js.Array[String]): Self = this.set("additionalSchemaElements", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Bucket(value: String): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Prefix(value: String): Self = this.set("s3Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Region(value: String): Self = this.set("s3Region", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeUnit(value: String): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
  }
  
}

