package typings.pulumiAws.reportDefinitionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportDefinitionArgs extends js.Object {
  
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT, ATHENA. When ATHENA exists within additional_artifacts, no other artifact type can be declared and reportVersioning must be OVERWRITE_REPORT.
    */
  val additionalArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: Input[js.Array[Input[String]]] = js.native
  
  /**
    * Compression format for report. Valid values are: GZIP, ZIP, Parquet. If Parquet is used, then format must also be Parquet.
    */
  val compression: Input[String] = js.native
  
  /**
    * Format for report. Valid values are: textORcsv, Parquet. If Parquet is used, then Compression must also be Parquet.
    */
  val format: Input[String] = js.native
  
  /**
    * Set to true to update your reports after they have been finalized if AWS detects charges related to previous months.
    */
  val refreshClosedReports: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: Input[String] = js.native
  
  /**
    * Overwrite the previous version of each report or to deliver the report in addition to the previous versions. Valid values are: CREATE_NEW_REPORT, OVERWRITE_REPORT
    */
  val reportVersioning: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: Input[String] = js.native
  
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: Input[String] = js.native
  
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: Input[String] = js.native
}
object ReportDefinitionArgs {
  
  @scala.inline
  def apply(
    additionalSchemaElements: Input[js.Array[Input[String]]],
    compression: Input[String],
    format: Input[String],
    reportName: Input[String],
    s3Bucket: Input[String],
    s3Region: Input[String],
    timeUnit: Input[String]
  ): ReportDefinitionArgs = {
    val __obj = js.Dynamic.literal(additionalSchemaElements = additionalSchemaElements.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], reportName = reportName.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinitionArgs]
  }
  
  @scala.inline
  implicit class ReportDefinitionArgsOps[Self <: ReportDefinitionArgs] (val x: Self) extends AnyVal {
    
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
    def setAdditionalSchemaElementsVarargs(value: Input[String]*): Self = this.set("additionalSchemaElements", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSchemaElements(value: Input[js.Array[Input[String]]]): Self = this.set("additionalSchemaElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: Input[String]): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Input[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportName(value: Input[String]): Self = this.set("reportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Bucket(value: Input[String]): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Region(value: Input[String]): Self = this.set("s3Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnit(value: Input[String]): Self = this.set("timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalArtifactsVarargs(value: Input[String]*): Self = this.set("additionalArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalArtifacts(value: Input[js.Array[Input[String]]]): Self = this.set("additionalArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalArtifacts: Self = this.set("additionalArtifacts", js.undefined)
    
    @scala.inline
    def setRefreshClosedReports(value: Input[Boolean]): Self = this.set("refreshClosedReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshClosedReports: Self = this.set("refreshClosedReports", js.undefined)
    
    @scala.inline
    def setReportVersioning(value: Input[String]): Self = this.set("reportVersioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportVersioning: Self = this.set("reportVersioning", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: Input[String]): Self = this.set("s3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Prefix: Self = this.set("s3Prefix", js.undefined)
  }
}
