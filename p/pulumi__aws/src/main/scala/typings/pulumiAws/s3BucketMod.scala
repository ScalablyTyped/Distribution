package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.enumsS3Mod.CannedAcl
import typings.pulumiAws.outputMod.s3.BucketCorsRule
import typings.pulumiAws.outputMod.s3.BucketGrant
import typings.pulumiAws.outputMod.s3.BucketLifecycleRule
import typings.pulumiAws.outputMod.s3.BucketLogging
import typings.pulumiAws.outputMod.s3.BucketObjectLockConfiguration
import typings.pulumiAws.outputMod.s3.BucketReplicationConfiguration
import typings.pulumiAws.outputMod.s3.BucketServerSideEncryptionConfiguration
import typings.pulumiAws.outputMod.s3.BucketVersioning
import typings.pulumiAws.outputMod.s3.BucketWebsite
import typings.pulumiAws.s3MixinsMod.BucketEventHandler
import typings.pulumiAws.s3MixinsMod.BucketEventSubscription
import typings.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typings.pulumiAws.s3MixinsMod.ObjectCreatedSubscriptionArgs
import typings.pulumiAws.s3MixinsMod.ObjectRemovedSubscriptionArgs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3BucketMod {
  
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
      */
    val accelerationStatus: Output_[String] = js.native
    
    /**
      * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
      */
    val acl: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be less than or equal to 63 characters in length.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
      */
    val bucketDomainName: Output_[String] = js.native
    
    /**
      * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be less than or equal to 37 characters in length.
      */
    val bucketPrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
      */
    val bucketRegionalDomainName: Output_[String] = js.native
    
    /**
      * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
      */
    val corsRules: Output_[js.UndefOr[js.Array[BucketCorsRule]]] = js.native
    
    /**
      * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
      */
    val grants: Output_[js.UndefOr[js.Array[BucketGrant]]] = js.native
    
    /**
      * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
      */
    val hostedZoneId: Output_[String] = js.native
    
    /**
      * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
      */
    val lifecycleRules: Output_[js.UndefOr[js.Array[BucketLifecycleRule]]] = js.native
    
    /**
      * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
      */
    val loggings: Output_[js.UndefOr[js.Array[BucketLogging]]] = js.native
    
    /**
      * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
      */
    val objectLockConfiguration: Output_[js.UndefOr[BucketObjectLockConfiguration]] = js.native
    
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
    def onObjectCreated(name: String, handler: BucketEventHandler, args: Unit, opts: ComponentResourceOptions): BucketEventSubscription = js.native
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
    def onObjectRemoved(name: String, handler: BucketEventHandler, args: Unit, opts: ComponentResourceOptions): BucketEventSubscription = js.native
    def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): BucketEventSubscription = js.native
    def onObjectRemoved(
      name: String,
      handler: BucketEventHandler,
      args: ObjectRemovedSubscriptionArgs,
      opts: ComponentResourceOptions
    ): BucketEventSubscription = js.native
    
    /**
      * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
      */
    val policy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The AWS region this bucket resides in.
      */
    val region: Output_[String] = js.native
    
    /**
      * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
      */
    val replicationConfiguration: Output_[js.UndefOr[BucketReplicationConfiguration]] = js.native
    
    /**
      * Specifies who should bear the cost of Amazon S3 data transfer.
      * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
      * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
      * developer guide for more information.
      */
    val requestPayer: Output_[String] = js.native
    
    /**
      * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
      */
    val serverSideEncryptionConfiguration: Output_[js.UndefOr[BucketServerSideEncryptionConfiguration]] = js.native
    
    /**
      * A mapping of tags to assign to the bucket.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
      */
    val versioning: Output_[BucketVersioning] = js.native
    
    /**
      * A website object (documented below).
      */
    val website: Output_[js.UndefOr[BucketWebsite]] = js.native
    
    /**
      * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
      */
    val websiteDomain: Output_[String] = js.native
    
    /**
      * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
      */
    val websiteEndpoint: Output_[String] = js.native
  }
  /* static members */
  object Bucket {
    
    @JSImport("@pulumi/aws/s3/bucket", "Bucket")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    inline def get(name: String, id: Input[ID], state: BucketState): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    inline def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Bucket]
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean]
  }
  
  trait BucketArgs extends StObject {
    
    /**
      * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
      */
    val accelerationStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
      */
    val acl: js.UndefOr[Input[String | CannedAcl]] = js.undefined
    
    /**
      * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be less than or equal to 63 characters in length.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be less than or equal to 37 characters in length.
      */
    val bucketPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
      */
    val corsRules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketCorsRule]]]] = js.undefined
    
    /**
      * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
      */
    val grants: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketGrant]]]] = js.undefined
    
    /**
      * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
      */
    val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
      */
    val lifecycleRules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLifecycleRule]]]] = js.undefined
    
    /**
      * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
      */
    val loggings: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLogging]]]] = js.undefined
    
    /**
      * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
      */
    val objectLockConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketObjectLockConfiguration]] = js.undefined
    
    /**
      * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
      */
    val replicationConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketReplicationConfiguration]] = js.undefined
    
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
    val serverSideEncryptionConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketServerSideEncryptionConfiguration]] = js.undefined
    
    /**
      * A mapping of tags to assign to the bucket.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
      */
    val versioning: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketVersioning]] = js.undefined
    
    /**
      * A website object (documented below).
      */
    val website: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketWebsite]] = js.undefined
    
    /**
      * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
      */
    val websiteDomain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
      */
    val websiteEndpoint: js.UndefOr[Input[String]] = js.undefined
  }
  object BucketArgs {
    
    inline def apply(): BucketArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketArgs]
    }
    
    extension [Self <: BucketArgs](x: Self) {
      
      inline def setAccelerationStatus(value: Input[String]): Self = StObject.set(x, "accelerationStatus", value.asInstanceOf[js.Any])
      
      inline def setAccelerationStatusUndefined: Self = StObject.set(x, "accelerationStatus", js.undefined)
      
      inline def setAcl(value: Input[String | CannedAcl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefix(value: Input[String]): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCorsRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketCorsRule]]]): Self = StObject.set(x, "corsRules", value.asInstanceOf[js.Any])
      
      inline def setCorsRulesUndefined: Self = StObject.set(x, "corsRules", js.undefined)
      
      inline def setCorsRulesVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketCorsRule]*): Self = StObject.set(x, "corsRules", js.Array(value :_*))
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setGrants(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketGrant]]]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
      
      inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
      
      inline def setGrantsVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketGrant]*): Self = StObject.set(x, "grants", js.Array(value :_*))
      
      inline def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      inline def setLifecycleRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLifecycleRule]]]): Self = StObject.set(x, "lifecycleRules", value.asInstanceOf[js.Any])
      
      inline def setLifecycleRulesUndefined: Self = StObject.set(x, "lifecycleRules", js.undefined)
      
      inline def setLifecycleRulesVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketLifecycleRule]*): Self = StObject.set(x, "lifecycleRules", js.Array(value :_*))
      
      inline def setLoggings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLogging]]]): Self = StObject.set(x, "loggings", value.asInstanceOf[js.Any])
      
      inline def setLoggingsUndefined: Self = StObject.set(x, "loggings", js.undefined)
      
      inline def setLoggingsVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketLogging]*): Self = StObject.set(x, "loggings", js.Array(value :_*))
      
      inline def setObjectLockConfiguration(value: Input[typings.pulumiAws.inputMod.s3.BucketObjectLockConfiguration]): Self = StObject.set(x, "objectLockConfiguration", value.asInstanceOf[js.Any])
      
      inline def setObjectLockConfigurationUndefined: Self = StObject.set(x, "objectLockConfiguration", js.undefined)
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setReplicationConfiguration(value: Input[typings.pulumiAws.inputMod.s3.BucketReplicationConfiguration]): Self = StObject.set(x, "replicationConfiguration", value.asInstanceOf[js.Any])
      
      inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "replicationConfiguration", js.undefined)
      
      inline def setRequestPayer(value: Input[String]): Self = StObject.set(x, "requestPayer", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerUndefined: Self = StObject.set(x, "requestPayer", js.undefined)
      
      inline def setServerSideEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.s3.BucketServerSideEncryptionConfiguration]): Self = StObject.set(x, "serverSideEncryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "serverSideEncryptionConfiguration", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVersioning(value: Input[typings.pulumiAws.inputMod.s3.BucketVersioning]): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
      
      inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
      
      inline def setWebsite(value: Input[typings.pulumiAws.inputMod.s3.BucketWebsite]): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteDomain(value: Input[String]): Self = StObject.set(x, "websiteDomain", value.asInstanceOf[js.Any])
      
      inline def setWebsiteDomainUndefined: Self = StObject.set(x, "websiteDomain", js.undefined)
      
      inline def setWebsiteEndpoint(value: Input[String]): Self = StObject.set(x, "websiteEndpoint", value.asInstanceOf[js.Any])
      
      inline def setWebsiteEndpointUndefined: Self = StObject.set(x, "websiteEndpoint", js.undefined)
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  trait BucketState extends StObject {
    
    /**
      * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
      */
    val accelerationStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
      */
    val acl: js.UndefOr[Input[String | CannedAcl]] = js.undefined
    
    /**
      * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be less than or equal to 63 characters in length.
      */
    val bucket: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
      */
    val bucketDomainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be less than or equal to 37 characters in length.
      */
    val bucketPrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
      */
    val bucketRegionalDomainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
      */
    val corsRules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketCorsRule]]]] = js.undefined
    
    /**
      * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
      */
    val grants: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketGrant]]]] = js.undefined
    
    /**
      * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
      */
    val hostedZoneId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
      */
    val lifecycleRules: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLifecycleRule]]]] = js.undefined
    
    /**
      * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
      */
    val loggings: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLogging]]]] = js.undefined
    
    /**
      * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
      */
    val objectLockConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketObjectLockConfiguration]] = js.undefined
    
    /**
      * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * The AWS region this bucket resides in.
      */
    val region: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
      */
    val replicationConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketReplicationConfiguration]] = js.undefined
    
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
    val serverSideEncryptionConfiguration: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketServerSideEncryptionConfiguration]] = js.undefined
    
    /**
      * A mapping of tags to assign to the bucket.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
      */
    val versioning: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketVersioning]] = js.undefined
    
    /**
      * A website object (documented below).
      */
    val website: js.UndefOr[Input[typings.pulumiAws.inputMod.s3.BucketWebsite]] = js.undefined
    
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
    
    inline def apply(): BucketState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketState]
    }
    
    extension [Self <: BucketState](x: Self) {
      
      inline def setAccelerationStatus(value: Input[String]): Self = StObject.set(x, "accelerationStatus", value.asInstanceOf[js.Any])
      
      inline def setAccelerationStatusUndefined: Self = StObject.set(x, "accelerationStatus", js.undefined)
      
      inline def setAcl(value: Input[String | CannedAcl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketDomainName(value: Input[String]): Self = StObject.set(x, "bucketDomainName", value.asInstanceOf[js.Any])
      
      inline def setBucketDomainNameUndefined: Self = StObject.set(x, "bucketDomainName", js.undefined)
      
      inline def setBucketPrefix(value: Input[String]): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
      
      inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
      
      inline def setBucketRegionalDomainName(value: Input[String]): Self = StObject.set(x, "bucketRegionalDomainName", value.asInstanceOf[js.Any])
      
      inline def setBucketRegionalDomainNameUndefined: Self = StObject.set(x, "bucketRegionalDomainName", js.undefined)
      
      inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      inline def setCorsRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketCorsRule]]]): Self = StObject.set(x, "corsRules", value.asInstanceOf[js.Any])
      
      inline def setCorsRulesUndefined: Self = StObject.set(x, "corsRules", js.undefined)
      
      inline def setCorsRulesVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketCorsRule]*): Self = StObject.set(x, "corsRules", js.Array(value :_*))
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setGrants(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketGrant]]]): Self = StObject.set(x, "grants", value.asInstanceOf[js.Any])
      
      inline def setGrantsUndefined: Self = StObject.set(x, "grants", js.undefined)
      
      inline def setGrantsVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketGrant]*): Self = StObject.set(x, "grants", js.Array(value :_*))
      
      inline def setHostedZoneId(value: Input[String]): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      inline def setHostedZoneIdUndefined: Self = StObject.set(x, "hostedZoneId", js.undefined)
      
      inline def setLifecycleRules(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLifecycleRule]]]): Self = StObject.set(x, "lifecycleRules", value.asInstanceOf[js.Any])
      
      inline def setLifecycleRulesUndefined: Self = StObject.set(x, "lifecycleRules", js.undefined)
      
      inline def setLifecycleRulesVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketLifecycleRule]*): Self = StObject.set(x, "lifecycleRules", js.Array(value :_*))
      
      inline def setLoggings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.s3.BucketLogging]]]): Self = StObject.set(x, "loggings", value.asInstanceOf[js.Any])
      
      inline def setLoggingsUndefined: Self = StObject.set(x, "loggings", js.undefined)
      
      inline def setLoggingsVarargs(value: Input[typings.pulumiAws.inputMod.s3.BucketLogging]*): Self = StObject.set(x, "loggings", js.Array(value :_*))
      
      inline def setObjectLockConfiguration(value: Input[typings.pulumiAws.inputMod.s3.BucketObjectLockConfiguration]): Self = StObject.set(x, "objectLockConfiguration", value.asInstanceOf[js.Any])
      
      inline def setObjectLockConfigurationUndefined: Self = StObject.set(x, "objectLockConfiguration", js.undefined)
      
      inline def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setReplicationConfiguration(value: Input[typings.pulumiAws.inputMod.s3.BucketReplicationConfiguration]): Self = StObject.set(x, "replicationConfiguration", value.asInstanceOf[js.Any])
      
      inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "replicationConfiguration", js.undefined)
      
      inline def setRequestPayer(value: Input[String]): Self = StObject.set(x, "requestPayer", value.asInstanceOf[js.Any])
      
      inline def setRequestPayerUndefined: Self = StObject.set(x, "requestPayer", js.undefined)
      
      inline def setServerSideEncryptionConfiguration(value: Input[typings.pulumiAws.inputMod.s3.BucketServerSideEncryptionConfiguration]): Self = StObject.set(x, "serverSideEncryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "serverSideEncryptionConfiguration", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVersioning(value: Input[typings.pulumiAws.inputMod.s3.BucketVersioning]): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
      
      inline def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
      
      inline def setWebsite(value: Input[typings.pulumiAws.inputMod.s3.BucketWebsite]): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteDomain(value: Input[String]): Self = StObject.set(x, "websiteDomain", value.asInstanceOf[js.Any])
      
      inline def setWebsiteDomainUndefined: Self = StObject.set(x, "websiteDomain", js.undefined)
      
      inline def setWebsiteEndpoint(value: Input[String]): Self = StObject.set(x, "websiteEndpoint", value.asInstanceOf[js.Any])
      
      inline def setWebsiteEndpointUndefined: Self = StObject.set(x, "websiteEndpoint", js.undefined)
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
}
