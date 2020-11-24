package typings.pulumiAws.remediationConfigurationMod

import typings.pulumiAws.outputMod.cfg.RemediationConfigurationParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration")
@js.native
class RemediationConfiguration protected () extends CustomResource {
  /**
    * Create a RemediationConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RemediationConfigurationArgs) = this()
  def this(name: String, args: RemediationConfigurationArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  /**
    * The name of the AWS Config rule
    */
  val configRuleName: Output_[String] = js.native
  
  /**
    * Can be specified multiple times for each
    * parameter. Each parameter block supports fields documented below.
    */
  val parameters: Output_[js.UndefOr[js.Array[RemediationConfigurationParameter]]] = js.native
  
  /**
    * The type of a resource
    */
  val resourceType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Target ID is the name of the public document
    */
  val targetId: Output_[String] = js.native
  
  /**
    * The type of the target. Target executes remediation. For example, SSM document
    */
  val targetType: Output_[String] = js.native
  
  /**
    * Version of the target. For example, version of the SSM document
    */
  val targetVersion: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration")
@js.native
object RemediationConfiguration extends js.Object {
  
  /**
    * Get an existing RemediationConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RemediationConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RemediationConfiguration = js.native
  def get(name: String, id: Input[ID], state: RemediationConfigurationState): RemediationConfiguration = js.native
  def get(name: String, id: Input[ID], state: RemediationConfigurationState, opts: CustomResourceOptions): RemediationConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of RemediationConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/remediationConfiguration.RemediationConfiguration */ Boolean = js.native
}
