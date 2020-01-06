package typings.atPulumiAws.dlmLifecyclePolicyMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.dlm.LifecyclePolicyPolicyDetails
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val arn: Output[String] = js.native
  /**
    * A description for the DLM lifecycle policy.
    */
  val description: Output[String] = js.native
  /**
    * The ARN of an IAM role that is able to be assumed by the DLM service.
    */
  val executionRoleArn: Output[String] = js.native
  /**
    * See the `policyDetails` configuration block. Max of 1.
    */
  val policyDetails: Output[LifecyclePolicyPolicyDetails] = js.native
  /**
    * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
    */
  val state: Output[js.UndefOr[String]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): LifecyclePolicy = js.native
  def get(name: String, id: Input[ID], state: LifecyclePolicyState): LifecyclePolicy = js.native
  def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): LifecyclePolicy = js.native
  /**
    * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dlm/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
}

