package typings.atPulumiAws.s3BucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AbortIncompleteMultipartUploadDays
import typings.atPulumiAws.Anon_AllowedHeaders
import typings.atPulumiAws.Anon_EnabledMfaDelete
import typings.atPulumiAws.Anon_ErrorDocument
import typings.atPulumiAws.Anon_ObjectLockEnabled
import typings.atPulumiAws.Anon_Role
import typings.atPulumiAws.Anon_Rule
import typings.atPulumiAws.Anon_TargetBucket
import typings.atPulumiAws.s3S3MixinsMod.BucketEventHandler
import typings.atPulumiAws.s3S3MixinsMod.BucketEventSubscription
import typings.atPulumiAws.s3S3MixinsMod.BucketEventSubscriptionArgs
import typings.atPulumiAws.s3S3MixinsMod.ObjectCreatedSubscriptionArgs
import typings.atPulumiAws.s3S3MixinsMod.ObjectRemovedSubscriptionArgs
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/bucket", "Bucket")
@js.native
class Bucket protected () extends CustomResource {
  /**
    * Create a Bucket resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: BucketArgs) = this()
  def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: Output[String] = js.native
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: Output[js.UndefOr[String]] = js.native
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: Output[String] = js.native
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  val bucket: Output[String] = js.native
  /**
    * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
    */
  val bucketDomainName: Output[String] = js.native
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`.
    */
  val bucketPrefix: Output[js.UndefOr[String]] = js.native
  /**
    * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
    */
  val bucketRegionalDomainName: Output[String] = js.native
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: Output[js.UndefOr[js.Array[Anon_AllowedHeaders]]] = js.native
  /**
    * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: Output[String] = js.native
  /**
    * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
    */
  val lifecycleRules: Output[js.UndefOr[js.Array[Anon_AbortIncompleteMultipartUploadDays]]] = js.native
  /**
    * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
    */
  val loggings: Output[js.UndefOr[js.Array[Anon_TargetBucket]]] = js.native
  /**
    * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
    */
  val objectLockConfiguration: Output[js.UndefOr[Anon_ObjectLockEnabled]] = js.native
  /**
    * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a deployment. In this case, please make sure you use the verbose/specific version of the policy.
    */
  val policy: Output[js.UndefOr[String]] = js.native
  /**
    * If specified, the AWS region this bucket should reside in. Otherwise, the region used by the callee.
    */
  val region: Output[String] = js.native
  /**
    * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
    */
  val replicationConfiguration: Output[js.UndefOr[Anon_Role]] = js.native
  /**
    * Specifies who should bear the cost of Amazon S3 data transfer.
    * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
    * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
    * developer guide for more information.
    */
  val requestPayer: Output[String] = js.native
  /**
    * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
    */
  val serverSideEncryptionConfiguration: Output[js.UndefOr[Anon_Rule]] = js.native
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
    */
  val versioning: Output[Anon_EnabledMfaDelete] = js.native
  /**
    * A website object (documented below).
    */
  val website: Output[js.UndefOr[Anon_ErrorDocument]] = js.native
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: Output[String] = js.native
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: Output[String] = js.native
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  This function should be
    * used when full control over the subscription is wanted, and other helpers (like
    * onObjectCreated/onObjectRemoved) are not sufficient.
    */
  def onEvent(name: String, handler: BucketEventHandler, args: BucketEventSubscriptionArgs): BucketEventSubscription = js.native
  def onEvent(
    name: String,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  The handler will be
    * called whenever a matching [s3.Object] is created.
    */
  def onObjectCreated(name: String, handler: BucketEventHandler): BucketEventSubscription = js.native
  def onObjectCreated(name: String, handler: BucketEventHandler, args: ObjectCreatedSubscriptionArgs): BucketEventSubscription = js.native
  def onObjectCreated(
    name: String,
    handler: BucketEventHandler,
    args: ObjectCreatedSubscriptionArgs,
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  The handler will be
    * called whenever an matching [s3.Object] is removed.
    */
  def onObjectRemoved(name: String, handler: BucketEventHandler): BucketEventSubscription = js.native
  def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): BucketEventSubscription = js.native
  def onObjectRemoved(
    name: String,
    handler: BucketEventHandler,
    args: ObjectRemovedSubscriptionArgs,
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/bucket", "Bucket")
@js.native
object Bucket extends js.Object {
  /**
    * Get an existing Bucket resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Bucket = js.native
  def get(name: String, id: Input[ID], state: BucketState): Bucket = js.native
  def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): Bucket = js.native
  /**
    * Returns true if the given object is an instance of Bucket.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean = js.native
}

