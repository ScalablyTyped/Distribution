package typings.atPulumiAws.curReportDefinitionMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
@js.native
class ReportDefinition protected () extends CustomResource {
  /**
    * Create a ReportDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReportDefinitionArgs) = this()
  def this(name: String, args: ReportDefinitionArgs, opts: CustomResourceOptions) = this()
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: Output[js.Array[String]] = js.native
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: Output[String] = js.native
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: Output[String] = js.native
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: Output[String] = js.native
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: Output[String] = js.native
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: Output[js.UndefOr[String]] = js.native
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: Output[String] = js.native
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): ReportDefinition = js.native
  def get(name: String, id: Input[ID], state: ReportDefinitionState): ReportDefinition = js.native
  def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): ReportDefinition = js.native
  /**
    * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = js.native
}

