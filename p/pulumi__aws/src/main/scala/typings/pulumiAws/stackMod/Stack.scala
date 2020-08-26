package typings.pulumiAws.stackMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation/stack", "Stack")
@js.native
class Stack protected () extends CustomResource {
  /**
    * Create a Stack resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: StackArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: StackArgs, opts: CustomResourceOptions) = this()
  /**
    * A list of capabilities.
    * Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, or `CAPABILITY_AUTO_EXPAND`
    */
  val capabilities: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Set to true to disable rollback of the stack if stack creation failed.
    * Conflicts with `onFailure`.
    */
  val disableRollback: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  val iamRoleArn: Output_[js.UndefOr[String]] = js.native
  /**
    * Stack name.
    */
  val name: Output_[String] = js.native
  /**
    * A list of SNS topic ARNs to publish stack related events.
    */
  val notificationArns: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Action to be taken if stack creation fails. This must be
    * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disableRollback`.
    */
  val onFailure: Output_[js.UndefOr[String]] = js.native
  /**
    * A map of outputs from the stack.
    */
  val outputs: Output_[StringDictionary[String]] = js.native
  /**
    * A map of Parameter structures that specify input parameters for the stack.
    */
  val parameters: Output_[StringDictionary[String]] = js.native
  /**
    * Structure containing the stack policy body.
    * Conflicts w/ `policyUrl`.
    */
  val policyBody: Output_[String] = js.native
  /**
    * Location of a file containing the stack policy.
    * Conflicts w/ `policyBody`.
    */
  val policyUrl: Output_[js.UndefOr[String]] = js.native
  /**
    * A list of tags to associate with this stack.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Structure containing the template body (max size: 51,200 bytes).
    */
  val templateBody: Output_[String] = js.native
  /**
    * Location of a file containing the template body (max size: 460,800 bytes).
    */
  val templateUrl: Output_[js.UndefOr[String]] = js.native
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
    */
  val timeoutInMinutes: Output_[js.UndefOr[Double]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudformation/stack", "Stack")
@js.native
object Stack extends js.Object {
  /**
    * Get an existing Stack resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Stack = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Stack = js.native
  def get(name: String, id: Input[ID], state: StackState): Stack = js.native
  def get(name: String, id: Input[ID], state: StackState, opts: CustomResourceOptions): Stack = js.native
  /**
    * Returns true if the given object is an instance of Stack.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stack.Stack */ Boolean = js.native
}

