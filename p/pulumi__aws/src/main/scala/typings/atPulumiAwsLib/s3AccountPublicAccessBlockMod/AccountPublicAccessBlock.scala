package typings
package atPulumiAwsLib.s3AccountPublicAccessBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock")
@js.native
class AccountPublicAccessBlock protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: AccountPublicAccessBlockArgs) = this()
  def this(name: java.lang.String, args: AccountPublicAccessBlockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * AWS account ID to configure. Defaults to automatically determined account ID of the Terraform AWS provider.
    */
  val accountId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
    * * PUT Object calls will fail if the request includes an object ACL.
    */
  val blockPublicAcls: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  val blockPublicPolicy: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore all public ACLs on buckets in this account and any objects that they contain.
    */
  val ignorePublicAcls: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access buckets with public policies.
    */
  val restrictPublicBuckets: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/accountPublicAccessBlock", "AccountPublicAccessBlock")
@js.native
object AccountPublicAccessBlock extends js.Object {
  /**
    * Get an existing AccountPublicAccessBlock resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState
  ): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
}

