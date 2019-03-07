package typings
package atPulumiAwsLib.curReportDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
@js.native
class ReportDefinition protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ReportDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ReportDefinitionArgs) = this()
  def this(name: java.lang.String, args: ReportDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
@js.native
object ReportDefinition extends js.Object {
  /**
    * Get an existing ReportDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.curReportDefinitionMod.ReportDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.curReportDefinitionMod.ReportDefinitionState
  ): atPulumiAwsLib.curReportDefinitionMod.ReportDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.curReportDefinitionMod.ReportDefinitionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.curReportDefinitionMod.ReportDefinition = js.native
}

