package typings.atPulumiAws.iamPolicyMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam/policy", "Policy")
@js.native
class Policy protected () extends CustomResource {
  /**
    * Create a Policy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PolicyArgs) = this()
  def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN assigned by AWS to this policy.
    */
  val arn: Output[String] = js.native
  /**
    * Description of the IAM policy.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the policy. If omitted, this provider will assign a random, unique name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * Path in which to create the policy.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: Output[js.UndefOr[String]] = js.native
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iam/policy", "Policy")
@js.native
object Policy extends js.Object {
  /**
    * Get an existing Policy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState): Policy = js.native
  def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): Policy = js.native
  /**
    * Returns true if the given object is an instance of Policy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/policy.Policy */ Boolean = js.native
}

