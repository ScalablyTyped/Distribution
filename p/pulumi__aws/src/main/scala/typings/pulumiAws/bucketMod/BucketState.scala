package typings.pulumiAws.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.cannedAclMod.CannedAcl
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.inputMod.s3.BucketCorsRule
import typings.pulumiAws.inputMod.s3.BucketGrant
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
trait BucketState extends js.Object {
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".  Conflicts with `grant`.
    */
  val acl: js.UndefOr[Input[String | CannedAcl]] = js.native
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket. If omitted, this provider will assign a random, unique name.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
    */
  val bucketDomainName: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`.
    */
  val bucketPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
    */
  val bucketRegionalDomainName: js.UndefOr[Input[String]] = js.native
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: js.UndefOr[Input[js.Array[Input[BucketCorsRule]]]] = js.native
  /**
    * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
    */
  val grants: js.UndefOr[Input[js.Array[Input[BucketGrant]]]] = js.native
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
    * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
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
    * A mapping of tags to assign to the bucket.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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

object BucketState {
  @scala.inline
  def apply(): BucketState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketState]
  }
  @scala.inline
  implicit class BucketStateOps[Self <: BucketState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccelerationStatus(value: Input[String]): Self = this.set("accelerationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerationStatus: Self = this.set("accelerationStatus", js.undefined)
    @scala.inline
    def setAcl(value: Input[String | CannedAcl]): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setBucketDomainName(value: Input[String]): Self = this.set("bucketDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketDomainName: Self = this.set("bucketDomainName", js.undefined)
    @scala.inline
    def setBucketPrefix(value: Input[String]): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
    @scala.inline
    def setBucketRegionalDomainName(value: Input[String]): Self = this.set("bucketRegionalDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketRegionalDomainName: Self = this.set("bucketRegionalDomainName", js.undefined)
    @scala.inline
    def setCorsRulesVarargs(value: Input[BucketCorsRule]*): Self = this.set("corsRules", js.Array(value :_*))
    @scala.inline
    def setCorsRules(value: Input[js.Array[Input[BucketCorsRule]]]): Self = this.set("corsRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorsRules: Self = this.set("corsRules", js.undefined)
    @scala.inline
    def setForceDestroy(value: Input[Boolean]): Self = this.set("forceDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDestroy: Self = this.set("forceDestroy", js.undefined)
    @scala.inline
    def setGrantsVarargs(value: Input[BucketGrant]*): Self = this.set("grants", js.Array(value :_*))
    @scala.inline
    def setGrants(value: Input[js.Array[Input[BucketGrant]]]): Self = this.set("grants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrants: Self = this.set("grants", js.undefined)
    @scala.inline
    def setHostedZoneId(value: Input[String]): Self = this.set("hostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedZoneId: Self = this.set("hostedZoneId", js.undefined)
    @scala.inline
    def setLifecycleRulesVarargs(value: Input[BucketLifecycleRule]*): Self = this.set("lifecycleRules", js.Array(value :_*))
    @scala.inline
    def setLifecycleRules(value: Input[js.Array[Input[BucketLifecycleRule]]]): Self = this.set("lifecycleRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleRules: Self = this.set("lifecycleRules", js.undefined)
    @scala.inline
    def setLoggingsVarargs(value: Input[BucketLogging]*): Self = this.set("loggings", js.Array(value :_*))
    @scala.inline
    def setLoggings(value: Input[js.Array[Input[BucketLogging]]]): Self = this.set("loggings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggings: Self = this.set("loggings", js.undefined)
    @scala.inline
    def setObjectLockConfiguration(value: Input[BucketObjectLockConfiguration]): Self = this.set("objectLockConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectLockConfiguration: Self = this.set("objectLockConfiguration", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String | PolicyDocument]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setReplicationConfiguration(value: Input[BucketReplicationConfiguration]): Self = this.set("replicationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationConfiguration: Self = this.set("replicationConfiguration", js.undefined)
    @scala.inline
    def setRequestPayer(value: Input[String]): Self = this.set("requestPayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPayer: Self = this.set("requestPayer", js.undefined)
    @scala.inline
    def setServerSideEncryptionConfiguration(value: Input[BucketServerSideEncryptionConfiguration]): Self = this.set("serverSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryptionConfiguration: Self = this.set("serverSideEncryptionConfiguration", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersioning(value: Input[BucketVersioning]): Self = this.set("versioning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersioning: Self = this.set("versioning", js.undefined)
    @scala.inline
    def setWebsite(value: Input[BucketWebsite]): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
    @scala.inline
    def setWebsiteDomain(value: Input[String]): Self = this.set("websiteDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteDomain: Self = this.set("websiteDomain", js.undefined)
    @scala.inline
    def setWebsiteEndpoint(value: Input[String]): Self = this.set("websiteEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteEndpoint: Self = this.set("websiteEndpoint", js.undefined)
  }
  
}

