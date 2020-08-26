package typings.pulumiAws.lifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.dlm.LifecyclePolicyPolicyDetails
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy")
@js.native
class LifecyclePolicy protected () extends CustomResource {
  /**
    * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LifecyclePolicyArgs) = this()
  def this(name: String, args: LifecyclePolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
    */
  val arn: Output_[String] = js.native
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: Output_[String] = js.native
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: Output_[String] = js.native
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: Output_[LifecyclePolicyPolicyDetails] = js.native
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy")
@js.native
object LifecyclePolicy extends js.Object {
  /**
    * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LifecyclePolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LifecyclePolicy = js.native
  def get(name: String, id: Input[ID], state: LifecyclePolicyState): LifecyclePolicy = js.native
  def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): LifecyclePolicy = js.native
  /**
    * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dlm/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
}

