package typings
package atPulumiAwsLib.curReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDefinitionArgs extends js.Object {
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

