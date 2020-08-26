package typings.pulumiAws.bucketPublicAccessBlockMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/bucketPublicAccessBlock", "BucketPublicAccessBlock")
@js.native
class BucketPublicAccessBlock protected () extends CustomResource {
  /**
    * Create a BucketPublicAccessBlock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketPublicAccessBlockArgs) = this()
  def this(name: String, args: BucketPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
  /**
    * Whether Amazon S3 should block public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
    * * PUT Object calls will fail if the request includes an object ACL.
    */
  val blockPublicAcls: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Whether Amazon S3 should block public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the existing bucket policy. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  val blockPublicPolicy: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * S3 Bucket to which this Public Access Block configuration should be applied.
    */
  val bucket: Output_[String] = js.native
  /**
    * Whether Amazon S3 should ignore public ACLs for this bucket. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore public ACLs on this bucket and any objects that it contains.
    */
  val ignorePublicAcls: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Whether Amazon S3 should restrict public bucket policies for this bucket. Defaults to `false`. Enabling this setting does not affect the previously stored bucket policy, except that public and cross-account access within the public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access this buckets if it has a public policy.
    */
  val restrictPublicBuckets: Output_[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/bucketPublicAccessBlock", "BucketPublicAccessBlock")
@js.native
object BucketPublicAccessBlock extends js.Object {
  /**
    * Get an existing BucketPublicAccessBlock resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState): BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState, opts: CustomResourceOptions): BucketPublicAccessBlock = js.native
  /**
    * Returns true if the given object is an instance of BucketPublicAccessBlock.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean = js.native
}

