package typings
package atPulumiAwsLib.cloudformationStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation/stack", "Stack")
@js.native
class Stack protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Stack resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: StackArgs) = this()
  def this(name: java.lang.String, args: StackArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * A list of capabilities.
    * Valid values: `CAPABILITY_IAM` or `CAPABILITY_NAMED_IAM`
    */
  val capabilities: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Set to true to disable rollback of the stack if stack creation failed.
    * Conflicts with `on_failure`.
    */
  val disableRollback: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The ARN of an IAM role that AWS CloudFormation assumes to create the stack. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  val iamRoleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Stack name.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of SNS topic ARNs to publish stack related events.
    */
  val notificationArns: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Action to be taken if stack creation fails. This must be
    * one of: `DO_NOTHING`, `ROLLBACK`, or `DELETE`. Conflicts with `disable_rollback`.
    */
  val onFailure: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A map of outputs from the stack.
    */
  val outputs: atPulumiPulumiLib.atPulumiPulumiMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * A map of Parameter structures that specify input parameters for the stack.
    */
  val parameters: atPulumiPulumiLib.atPulumiPulumiMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Structure containing the stack policy body.
    * Conflicts w/ `policy_url`.
    */
  val policyBody: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Location of a file containing the stack policy.
    * Conflicts w/ `policy_body`.
    */
  val policyUrl: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of tags to associate with this stack.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Structure containing the template body (max size: 51,200 bytes).
    */
  val templateBody: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Location of a file containing the template body (max size: 460,800 bytes).
    */
  val templateUrl: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`.
    */
  val timeoutInMinutes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
}

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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudformationStackMod.Stack = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudformationStackMod.StackState
  ): atPulumiAwsLib.cloudformationStackMod.Stack = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudformationStackMod.StackState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudformationStackMod.Stack = js.native
}

