package typings.atPulumiAws.curReportDefinitionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDefinitionArgs extends js.Object {
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: Input[js.Array[Input[String]]]
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: Input[String]
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: Input[String]
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: Input[String]
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: Input[String]
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: Input[String]
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: Input[String]
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
    timeUnit: Input[String],
    additionalArtifacts: Input[js.Array[Input[String]]] = null,
    s3Prefix: Input[String] = null
  ): ReportDefinitionArgs = {
    val __obj = js.Dynamic.literal(additionalSchemaElements = additionalSchemaElements.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], reportName = reportName.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    if (additionalArtifacts != null) __obj.updateDynamic("additionalArtifacts")(additionalArtifacts.asInstanceOf[js.Any])
    if (s3Prefix != null) __obj.updateDynamic("s3Prefix")(s3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDefinitionArgs]
  }
}

