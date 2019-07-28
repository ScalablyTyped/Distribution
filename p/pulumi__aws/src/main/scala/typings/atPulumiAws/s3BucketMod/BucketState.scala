package typings.atPulumiAws.s3BucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AbortIncompleteMultipartUploadDaysEnabled
import typings.atPulumiAws.Anon_AllowedHeadersAllowedMethods
import typings.atPulumiAws.Anon_EnabledMfaDeleteBoolean
import typings.atPulumiAws.Anon_ErrorDocumentIndexDocument
import typings.atPulumiAws.Anon_ObjectLockEnabledRule
import typings.atPulumiAws.Anon_RoleRules
import typings.atPulumiAws.Anon_RuleAnonApplyServerSideEncryptionByDefaultAnonKmsMasterKeyIdSseAlgorithm
import typings.atPulumiAws.Anon_TargetBucketTargetPrefix
import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiAws.s3CannedAclMod.CannedAcl
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketState extends js.Object {
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: js.UndefOr[Input[String]] = js.undefined
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".
    */
  val acl: js.UndefOr[Input[String | CannedAcl]] = js.undefined
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  val bucket: js.UndefOr[Input[String]] = js.undefined
  /**
    * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
    */
  val bucketDomainName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`.
    */
  val bucketPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
    */
  val bucketRegionalDomainName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: js.UndefOr[Input[js.Array[Input[Anon_AllowedHeadersAllowedMethods]]]] = js.undefined
  /**
    * A boolean that indicates all objects should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
    */
  val lifecycleRules: js.UndefOr[Input[js.Array[Input[Anon_AbortIncompleteMultipartUploadDaysEnabled]]]] = js.undefined
  /**
    * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
    */
  val loggings: js.UndefOr[Input[js.Array[Input[Anon_TargetBucketTargetPrefix]]]] = js.undefined
  /**
    * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
    */
  val objectLockConfiguration: js.UndefOr[Input[Anon_ObjectLockEnabledRule]] = js.undefined
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
  /**
    * If specified, the AWS region this bucket should reside in. Otherwise, the region used by the callee.
    */
  val region: js.UndefOr[Input[String]] = js.undefined
  /**
    * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
    */
  val replicationConfiguration: js.UndefOr[Input[Anon_RoleRules]] = js.undefined
  /**
    * Specifies who should bear the cost of Amazon S3 data transfer.
    * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
    * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
    * developer guide for more information.
    */
  val requestPayer: js.UndefOr[Input[String]] = js.undefined
  /**
    * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
    */
  val serverSideEncryptionConfiguration: js.UndefOr[
    Input[Anon_RuleAnonApplyServerSideEncryptionByDefaultAnonKmsMasterKeyIdSseAlgorithm]
  ] = js.undefined
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
    */
  val versioning: js.UndefOr[Input[Anon_EnabledMfaDeleteBoolean]] = js.undefined
  /**
    * A website object (documented below).
    */
  val website: js.UndefOr[Input[Anon_ErrorDocumentIndexDocument]] = js.undefined
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: js.UndefOr[Input[String]] = js.undefined
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: js.UndefOr[Input[String]] = js.undefined
}

object BucketState {
  @scala.inline
  def apply(
    accelerationStatus: Input[String] = null,
    acl: Input[String | CannedAcl] = null,
    arn: Input[String] = null,
    bucket: Input[String] = null,
    bucketDomainName: Input[String] = null,
    bucketPrefix: Input[String] = null,
    bucketRegionalDomainName: Input[String] = null,
    corsRules: Input[js.Array[Input[Anon_AllowedHeadersAllowedMethods]]] = null,
    forceDestroy: Input[Boolean] = null,
    hostedZoneId: Input[String] = null,
    lifecycleRules: Input[js.Array[Input[Anon_AbortIncompleteMultipartUploadDaysEnabled]]] = null,
    loggings: Input[js.Array[Input[Anon_TargetBucketTargetPrefix]]] = null,
    objectLockConfiguration: Input[Anon_ObjectLockEnabledRule] = null,
    policy: Input[String | PolicyDocument] = null,
    region: Input[String] = null,
    replicationConfiguration: Input[Anon_RoleRules] = null,
    requestPayer: Input[String] = null,
    serverSideEncryptionConfiguration: Input[Anon_RuleAnonApplyServerSideEncryptionByDefaultAnonKmsMasterKeyIdSseAlgorithm] = null,
    tags: Input[StringDictionary[_]] = null,
    versioning: Input[Anon_EnabledMfaDeleteBoolean] = null,
    website: Input[Anon_ErrorDocumentIndexDocument] = null,
    websiteDomain: Input[String] = null,
    websiteEndpoint: Input[String] = null
  ): BucketState = {
    val __obj = js.Dynamic.literal()
    if (accelerationStatus != null) __obj.updateDynamic("accelerationStatus")(accelerationStatus.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (bucketDomainName != null) __obj.updateDynamic("bucketDomainName")(bucketDomainName.asInstanceOf[js.Any])
    if (bucketPrefix != null) __obj.updateDynamic("bucketPrefix")(bucketPrefix.asInstanceOf[js.Any])
    if (bucketRegionalDomainName != null) __obj.updateDynamic("bucketRegionalDomainName")(bucketRegionalDomainName.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[BucketState]
  }
}

