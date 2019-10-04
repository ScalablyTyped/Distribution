package typings.atPulumiAws.kmsGrantMod

import typings.atPulumiAws.typesOutputMod.kmsNs.GrantConstraint
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms/grant", "Grant")
@js.native
class Grant protected () extends CustomResource {
  /**
    * Create a Grant resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GrantArgs) = this()
  def this(name: String, args: GrantArgs, opts: CustomResourceOptions) = this()
  /**
    * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
    */
  val constraints: Output[js.UndefOr[js.Array[GrantConstraint]]] = js.native
  /**
    * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
    * * `retireOnDelete` -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
    * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
    */
  val grantCreationTokens: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The unique identifier for the grant.
    */
  val grantId: Output[String] = js.native
  /**
    * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
    */
  val grantToken: Output[String] = js.native
  /**
    * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val granteePrincipal: Output[String] = js.native
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
    */
  val keyId: Output[String] = js.native
  /**
    * A friendly name for identifying the grant.
    */
  val name: Output[String] = js.native
  /**
    * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
    */
  val operations: Output[js.Array[String]] = js.native
  val retireOnDelete: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val retiringPrincipal: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kms/grant", "Grant")
@js.native
object Grant extends js.Object {
  /**
    * Get an existing Grant resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Grant = js.native
  def get(name: String, id: Input[ID], state: GrantState): Grant = js.native
  def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): Grant = js.native
  /**
    * Returns true if the given object is an instance of Grant.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
}

