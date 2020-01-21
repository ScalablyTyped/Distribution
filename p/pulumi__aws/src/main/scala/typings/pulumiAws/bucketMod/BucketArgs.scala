package typings.pulumiAws.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.cannedAclMod.CannedAcl
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.inputMod.s3.BucketCorsRule
import typings.pulumiAws.inputMod.s3.BucketLifecycleRule
import typings.pulumiAws.inputMod.s3.BucketLogging
import typings.pulumiAws.inputMod.s3.BucketObjectLockConfiguration
import typings.pulumiAws.inputMod.s3.BucketReplicationConfiguration
import typings.pulumiAws.inputMod.s3.BucketServerSideEncryptionConfiguration
import typings.pulumiAws.inputMod.s3.BucketVersioning
import typings.pulumiAws.inputMod.s3.BucketWebsite
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketArgs extends js.Object {
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: js.UndefOr[Input[String | CannedAcl]] = js.native
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`.
    */
  val bucketPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: js.UndefOr[Input[js.Array[Input[BucketCorsRule]]]] = js.native
  /**
    * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
    */
  val lifecycleRules: js.UndefOr[Input[js.Array[Input[BucketLifecycleRule]]]] = js.native
  /**
    * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
    */
  val loggings: js.UndefOr[Input[js.Array[Input[BucketLogging]]]] = js.native
  /**
    * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
    */
  val objectLockConfiguration: js.UndefOr[Input[BucketObjectLockConfiguration]] = js.native
  /**
    * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a deployment. In this case, please make sure you use the verbose/specific version of the policy.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * If specified, the AWS region this bucket should reside in. Otherwise, the region used by the callee.
    */
  val region: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
    */
  val replicationConfiguration: js.UndefOr[Input[BucketReplicationConfiguration]] = js.native
  /**
    * Specifies who should bear the cost of Amazon S3 data transfer.
    * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
    * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
    * developer guide for more information.
    */
  val requestPayer: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
    */
  val serverSideEncryptionConfiguration: js.UndefOr[Input[BucketServerSideEncryptionConfiguration]] = js.native
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
    */
  val versioning: js.UndefOr[Input[BucketVersioning]] = js.native
  /**
    * A website object (documented below).
    */
  val website: js.UndefOr[Input[BucketWebsite]] = js.native
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: js.UndefOr[Input[String]] = js.native
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: js.UndefOr[Input[String]] = js.native
}

object BucketArgs {
  @scala.inline
  def apply(
    accelerationStatus: Input[String] = null,
    acl: Input[String | CannedAcl] = null,
    arn: Input[String] = null,
    bucket: Input[String] = null,
    bucketPrefix: Input[String] = null,
    corsRules: Input[js.Array[Input[BucketCorsRule]]] = null,
    forceDestroy: Input[Boolean] = null,
    hostedZoneId: Input[String] = null,
    lifecycleRules: Input[js.Array[Input[BucketLifecycleRule]]] = null,
    loggings: Input[js.Array[Input[BucketLogging]]] = null,
    objectLockConfiguration: Input[BucketObjectLockConfiguration] = null,
    policy: Input[String | PolicyDocument] = null,
    region: Input[String] = null,
    replicationConfiguration: Input[BucketReplicationConfiguration] = null,
    requestPayer: Input[String] = null,
    serverSideEncryptionConfiguration: Input[BucketServerSideEncryptionConfiguration] = null,
    tags: Input[StringDictionary[_]] = null,
    versioning: Input[BucketVersioning] = null,
    website: Input[BucketWebsite] = null,
    websiteDomain: Input[String] = null,
    websiteEndpoint: Input[String] = null
  ): BucketArgs = {
    val __obj = js.Dynamic.literal()
    if (accelerationStatus != null) __obj.updateDynamic("accelerationStatus")(accelerationStatus.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (corsRules != null) __obj.updateDynamic("corsRules")(corsRules.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (hostedZoneId != null) __obj.updateDynamic("hostedZoneId")(hostedZoneId.asInstanceOf[js.Any])
    if (lifecycleRules != null) __obj.updateDynamic("lifecycleRules")(lifecycleRules.asInstanceOf[js.Any])
    if (loggings != null) __obj.updateDynamic("loggings")(loggings.asInstanceOf[js.Any])
    if (objectLockConfiguration != null) __obj.updateDynamic("objectLockConfiguration")(objectLockConfiguration.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (replicationConfiguration != null) __obj.updateDynamic("replicationConfiguration")(replicationConfiguration.asInstanceOf[js.Any])
    if (requestPayer != null) __obj.updateDynamic("requestPayer")(requestPayer.asInstanceOf[js.Any])
    if (serverSideEncryptionConfiguration != null) __obj.updateDynamic("serverSideEncryptionConfiguration")(serverSideEncryptionConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    if (websiteDomain != null) __obj.updateDynamic("websiteDomain")(websiteDomain.asInstanceOf[js.Any])
    if (websiteEndpoint != null) __obj.updateDynamic("websiteEndpoint")(websiteEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketArgs]
  }
}

