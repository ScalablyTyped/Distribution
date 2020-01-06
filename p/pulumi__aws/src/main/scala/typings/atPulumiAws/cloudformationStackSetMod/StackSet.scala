package typings.atPulumiAws.cloudformationStackSetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet")
@js.native
class StackSet protected () extends CustomResource {
  /**
    * Create a StackSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: StackSetArgs) = this()
  def this(name: String, args: StackSetArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Number (ARN) of the IAM Role in the administrator account.
    */
  val administrationRoleArn: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the Stack Set.
    */
  val arn: Output[String] = js.native
  /**
    * A list of capabilities. Valid values: `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_AUTO_EXPAND`.
    */
  val capabilities: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Description of the Stack Set.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the IAM Role in all target accounts for Stack Set operations. Defaults to `AWSCloudFormationStackSetExecutionRole`.
    */
  val executionRoleName: Output[js.UndefOr[String]] = js.native
  /**
    * Name of the Stack Set. The name must be unique in the region where you create your Stack Set. The name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters.
    */
  val name: Output[String] = js.native
  /**
    * Key-value map of input parameters for the Stack Set template. All template parameters, including those with a `Default`, must be configured or ignored with `lifecycle` configuration block `ignoreChanges` argument. All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
    */
  val parameters: Output[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * Unique identifier of the Stack Set.
    */
  val stackSetId: Output[String] = js.native
  /**
    * Key-value map of tags to associate with this Stack Set and the Stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the Stacks. A maximum number of 50 tags can be specified.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * String containing the CloudFormation template body. Maximum size: 51,200 bytes. Conflicts with `templateUrl`.
    */
  val templateBody: Output[String] = js.native
  /**
    * String containing the location of a file containing the CloudFormation template body. The URL must point to a template that is located in an Amazon S3 bucket. Maximum location file size: 460,800 bytes. Conflicts with `templateBody`.
    */
  val templateUrl: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudformation/stackSet", "StackSet")
@js.native
object StackSet extends js.Object {
  /**
    * Get an existing StackSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): StackSet = js.native
  def get(name: String, id: Input[ID], state: StackSetState): StackSet = js.native
  def get(name: String, id: Input[ID], state: StackSetState, opts: CustomResourceOptions): StackSet = js.native
  /**
    * Returns true if the given object is an instance of StackSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudformation/stackSet.StackSet */ Boolean = js.native
}

