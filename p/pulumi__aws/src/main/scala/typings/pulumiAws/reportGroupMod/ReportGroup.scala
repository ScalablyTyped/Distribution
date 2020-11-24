package typings.pulumiAws.reportGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codebuild.ReportGroupExportConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup")
@js.native
class ReportGroup protected () extends CustomResource {
  /**
    * Create a ReportGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReportGroupArgs) = this()
  def this(name: String, args: ReportGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of Report Group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The date and time this Report Group was created.
    */
  val created: Output_[String] = js.native
  
  /**
    * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
    */
  val exportConfig: Output_[ReportGroupExportConfig] = js.native
  
  /**
    * The name of a Report Group.
    */
  val name: Output_[String] = js.native
  
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
    */
  val `type`: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup")
@js.native
object ReportGroup extends js.Object {
  
  /**
    * Get an existing ReportGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ReportGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReportGroup = js.native
  def get(name: String, id: Input[ID], state: ReportGroupState): ReportGroup = js.native
  def get(name: String, id: Input[ID], state: ReportGroupState, opts: CustomResourceOptions): ReportGroup = js.native
  
  /**
    * Returns true if the given object is an instance of ReportGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean = js.native
}
