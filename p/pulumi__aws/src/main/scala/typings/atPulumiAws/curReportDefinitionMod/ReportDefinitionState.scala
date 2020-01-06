package typings.atPulumiAws.curReportDefinitionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportDefinitionState extends js.Object {
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: js.UndefOr[Input[String]] = js.native
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: js.UndefOr[Input[String]] = js.native
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: js.UndefOr[Input[String]] = js.native
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: js.UndefOr[Input[String]] = js.native
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: js.UndefOr[Input[String]] = js.native
}

object ReportDefinitionState {
  @scala.inline
  def apply(
    additionalArtifacts: Input[js.Array[Input[String]]] = null,
    additionalSchemaElements: Input[js.Array[Input[String]]] = null,
    compression: Input[String] = null,
    format: Input[String] = null,
    reportName: Input[String] = null,
    s3Bucket: Input[String] = null,
    s3Prefix: Input[String] = null,
    s3Region: Input[String] = null,
    timeUnit: Input[String] = null
  ): ReportDefinitionState = {
    val __obj = js.Dynamic.literal()
    if (additionalArtifacts != null) __obj.updateDynamic("additionalArtifacts")(additionalArtifacts.asInstanceOf[js.Any])
    if (additionalSchemaElements != null) __obj.updateDynamic("additionalSchemaElements")(additionalSchemaElements.asInstanceOf[js.Any])
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (reportName != null) __obj.updateDynamic("reportName")(reportName.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Prefix != null) __obj.updateDynamic("s3Prefix")(s3Prefix.asInstanceOf[js.Any])
    if (s3Region != null) __obj.updateDynamic("s3Region")(s3Region.asInstanceOf[js.Any])
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinitionState]
  }
}

