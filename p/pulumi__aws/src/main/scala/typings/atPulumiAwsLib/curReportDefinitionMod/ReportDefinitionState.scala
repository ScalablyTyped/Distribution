package typings
package atPulumiAwsLib.curReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDefinitionState extends js.Object {
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

