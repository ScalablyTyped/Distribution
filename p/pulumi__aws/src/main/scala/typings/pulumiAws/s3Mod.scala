package typings.pulumiAws

import typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlockArgs
import typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlockState
import typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfigurationArgs
import typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfigurationState
import typings.pulumiAws.bucketMetricMod.BucketMetricArgs
import typings.pulumiAws.bucketMetricMod.BucketMetricState
import typings.pulumiAws.bucketNotificationMod.BucketNotificationArgs
import typings.pulumiAws.bucketNotificationMod.BucketNotificationState
import typings.pulumiAws.bucketObjectMod.BucketObjectArgs
import typings.pulumiAws.bucketObjectMod.BucketObjectState
import typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControlsArgs
import typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControlsState
import typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlockArgs
import typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlockState
import typings.pulumiAws.enumsS3Mod.CannedAcl
import typings.pulumiAws.getBucketMod.GetBucketArgs
import typings.pulumiAws.getBucketMod.GetBucketResult
import typings.pulumiAws.getBucketObjectMod.GetBucketObjectArgs
import typings.pulumiAws.getBucketObjectMod.GetBucketObjectResult
import typings.pulumiAws.getBucketObjectsMod.GetBucketObjectsArgs
import typings.pulumiAws.getBucketObjectsMod.GetBucketObjectsResult
import typings.pulumiAws.inventoryMod.InventoryArgs
import typings.pulumiAws.inventoryMod.InventoryState
import typings.pulumiAws.pulumiAwsStrings.`authenticated-read`
import typings.pulumiAws.pulumiAwsStrings.`aws-exec-read`
import typings.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
import typings.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
import typings.pulumiAws.pulumiAwsStrings.`log-delivery-write`
import typings.pulumiAws.pulumiAwsStrings.`private`
import typings.pulumiAws.pulumiAwsStrings.`public-read-write`
import typings.pulumiAws.pulumiAwsStrings.`public-read`
import typings.pulumiAws.s3AccessPointMod.AccessPointArgs
import typings.pulumiAws.s3AccessPointMod.AccessPointState
import typings.pulumiAws.s3BucketMod.BucketArgs
import typings.pulumiAws.s3BucketMod.BucketState
import typings.pulumiAws.s3BucketPolicyMod.BucketPolicyArgs
import typings.pulumiAws.s3BucketPolicyMod.BucketPolicyState
import typings.pulumiAws.s3MixinsMod.BucketEventHandler
import typings.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typings.pulumiAws.s3MixinsMod.ObjectCreatedSubscriptionArgs
import typings.pulumiAws.s3MixinsMod.ObjectRemovedSubscriptionArgs
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3Mod {
  
  @JSImport("@pulumi/aws/s3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/s3", "AccessPoint")
  @js.native
  class AccessPoint protected ()
    extends typings.pulumiAws.s3AccessPointMod.AccessPoint {
    /**
      * Create a AccessPoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccessPointArgs) = this()
    def this(name: String, args: AccessPointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AccessPoint {
    
    @JSImport("@pulumi/aws/s3", "AccessPoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.s3AccessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3AccessPointMod.AccessPoint]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.s3AccessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3AccessPointMod.AccessPoint]
    inline def get(name: String, id: Input[ID], state: AccessPointState): typings.pulumiAws.s3AccessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3AccessPointMod.AccessPoint]
    inline def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): typings.pulumiAws.s3AccessPointMod.AccessPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3AccessPointMod.AccessPoint]
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accessPoint.AccessPoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/accessPoint.AccessPoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "AccountPublicAccessBlock")
  @js.native
  class AccountPublicAccessBlock protected ()
    extends typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock {
    /**
      * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AccountPublicAccessBlock {
    
    @JSImport("@pulumi/aws/s3", "AccountPublicAccessBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AccountPublicAccessBlock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock]
    inline def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock]
    inline def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState, opts: CustomResourceOptions): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock]
    
    /**
      * Returns true if the given object is an instance of AccountPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accountPublicAccessBlock.AccountPublicAccessBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/accountPublicAccessBlock.AccountPublicAccessBlock */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "AnalyticsConfiguration")
  @js.native
  class AnalyticsConfiguration protected ()
    extends typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration {
    /**
      * Create a AnalyticsConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AnalyticsConfigurationArgs) = this()
    def this(name: String, args: AnalyticsConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AnalyticsConfiguration {
    
    @JSImport("@pulumi/aws/s3", "AnalyticsConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AnalyticsConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration]
    inline def get(name: String, id: Input[ID], state: AnalyticsConfigurationState): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration]
    inline def get(name: String, id: Input[ID], state: AnalyticsConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration]
    
    /**
      * Returns true if the given object is an instance of AnalyticsConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/analyticsConfiguration.AnalyticsConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/analyticsConfiguration.AnalyticsConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "AuthenticatedReadAcl")
  @js.native
  def AuthenticatedReadAcl: CannedAcl = js.native
  inline def AuthenticatedReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthenticatedReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "AwsExecReadAcl")
  @js.native
  def AwsExecReadAcl: CannedAcl = js.native
  inline def AwsExecReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AwsExecReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "Bucket")
  @js.native
  class Bucket protected ()
    extends typings.pulumiAws.s3BucketMod.Bucket {
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
  }
  /* static members */
  object Bucket {
    
    @JSImport("@pulumi/aws/s3", "Bucket")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.s3BucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketMod.Bucket]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.s3BucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketMod.Bucket]
    inline def get(name: String, id: Input[ID], state: BucketState): typings.pulumiAws.s3BucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketMod.Bucket]
    inline def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typings.pulumiAws.s3BucketMod.Bucket = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketMod.Bucket]
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "BucketEventSubscription")
  @js.native
  class BucketEventSubscription protected ()
    extends typings.pulumiAws.s3MixinsMod.BucketEventSubscription {
    def this(
      name: String,
      bucket: typings.pulumiAws.s3BucketMod.Bucket,
      handler: BucketEventHandler,
      args: BucketEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      bucket: typings.pulumiAws.s3BucketMod.Bucket,
      handler: BucketEventHandler,
      args: BucketEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws/s3", "BucketMetric")
  @js.native
  class BucketMetric protected ()
    extends typings.pulumiAws.bucketMetricMod.BucketMetric {
    /**
      * Create a BucketMetric resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketMetricArgs) = this()
    def this(name: String, args: BucketMetricArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketMetric {
    
    @JSImport("@pulumi/aws/s3", "BucketMetric")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.bucketMetricMod.BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMetricMod.BucketMetric]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketMetricMod.BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMetricMod.BucketMetric]
    inline def get(name: String, id: Input[ID], state: BucketMetricState): typings.pulumiAws.bucketMetricMod.BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMetricMod.BucketMetric]
    inline def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): typings.pulumiAws.bucketMetricMod.BucketMetric = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketMetricMod.BucketMetric]
    
    /**
      * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "BucketNotification")
  @js.native
  class BucketNotification protected ()
    extends typings.pulumiAws.bucketNotificationMod.BucketNotification {
    /**
      * Create a BucketNotification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketNotificationArgs) = this()
    def this(name: String, args: BucketNotificationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketNotification {
    
    @JSImport("@pulumi/aws/s3", "BucketNotification")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.bucketNotificationMod.BucketNotification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketNotificationMod.BucketNotification]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketNotificationMod.BucketNotification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketNotificationMod.BucketNotification]
    inline def get(name: String, id: Input[ID], state: BucketNotificationState): typings.pulumiAws.bucketNotificationMod.BucketNotification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketNotificationMod.BucketNotification]
    inline def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): typings.pulumiAws.bucketNotificationMod.BucketNotification = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketNotificationMod.BucketNotification]
    
    /**
      * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "BucketObject")
  @js.native
  class BucketObject protected ()
    extends typings.pulumiAws.bucketObjectMod.BucketObject {
    /**
      * Create a BucketObject resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketObjectArgs) = this()
    def this(name: String, args: BucketObjectArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketObject {
    
    @JSImport("@pulumi/aws/s3", "BucketObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketObject resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.bucketObjectMod.BucketObject = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketObjectMod.BucketObject]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketObjectMod.BucketObject = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketObjectMod.BucketObject]
    inline def get(name: String, id: Input[ID], state: BucketObjectState): typings.pulumiAws.bucketObjectMod.BucketObject = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketObjectMod.BucketObject]
    inline def get(name: String, id: Input[ID], state: BucketObjectState, opts: CustomResourceOptions): typings.pulumiAws.bucketObjectMod.BucketObject = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketObjectMod.BucketObject]
    
    /**
      * Returns true if the given object is an instance of BucketObject.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "BucketOwnerFullControlAcl")
  @js.native
  def BucketOwnerFullControlAcl: CannedAcl = js.native
  inline def BucketOwnerFullControlAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BucketOwnerFullControlAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "BucketOwnerReadAcl")
  @js.native
  def BucketOwnerReadAcl: CannedAcl = js.native
  inline def BucketOwnerReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BucketOwnerReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "BucketOwnershipControls")
  @js.native
  class BucketOwnershipControls protected ()
    extends typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls {
    /**
      * Create a BucketOwnershipControls resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketOwnershipControlsArgs) = this()
    def this(name: String, args: BucketOwnershipControlsArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketOwnershipControls {
    
    @JSImport("@pulumi/aws/s3", "BucketOwnershipControls")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketOwnershipControls resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls]
    inline def get(name: String, id: Input[ID], state: BucketOwnershipControlsState): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls]
    inline def get(name: String, id: Input[ID], state: BucketOwnershipControlsState, opts: CustomResourceOptions): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls]
    
    /**
      * Returns true if the given object is an instance of BucketOwnershipControls.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "BucketPolicy")
  @js.native
  class BucketPolicy protected ()
    extends typings.pulumiAws.s3BucketPolicyMod.BucketPolicy {
    /**
      * Create a BucketPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketPolicyArgs) = this()
    def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketPolicy {
    
    @JSImport("@pulumi/aws/s3", "BucketPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketPolicyMod.BucketPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketPolicyMod.BucketPolicy]
    inline def get(name: String, id: Input[ID], state: BucketPolicyState): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketPolicyMod.BucketPolicy]
    inline def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.s3BucketPolicyMod.BucketPolicy]
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "BucketPublicAccessBlock")
  @js.native
  class BucketPublicAccessBlock protected ()
    extends typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock {
    /**
      * Create a BucketPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketPublicAccessBlockArgs) = this()
    def this(name: String, args: BucketPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BucketPublicAccessBlock {
    
    @JSImport("@pulumi/aws/s3", "BucketPublicAccessBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing BucketPublicAccessBlock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock]
    inline def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock]
    inline def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState, opts: CustomResourceOptions): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock]
    
    /**
      * Returns true if the given object is an instance of BucketPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean]
  }
  
  object CannedAcl {
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.AuthenticatedRead")
    @js.native
    val AuthenticatedRead: `authenticated-read` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.AwsExecRead")
    @js.native
    val AwsExecRead: `aws-exec-read` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.BucketOwnerFullControl")
    @js.native
    val BucketOwnerFullControl: `bucket-owner-full-control` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.BucketOwnerRead")
    @js.native
    val BucketOwnerRead: `bucket-owner-read` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.LogDeliveryWrite")
    @js.native
    val LogDeliveryWrite: `log-delivery-write` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.Private")
    @js.native
    val Private: `private` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.PublicRead")
    @js.native
    val PublicRead: `public-read` = js.native
    
    @JSImport("@pulumi/aws/s3", "CannedAcl.PublicReadWrite")
    @js.native
    val PublicReadWrite: `public-read-write` = js.native
  }
  
  @JSImport("@pulumi/aws/s3", "Inventory")
  @js.native
  class Inventory protected ()
    extends typings.pulumiAws.inventoryMod.Inventory {
    /**
      * Create a Inventory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InventoryArgs) = this()
    def this(name: String, args: InventoryArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Inventory {
    
    @JSImport("@pulumi/aws/s3", "Inventory")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Inventory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.inventoryMod.Inventory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.inventoryMod.Inventory]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.inventoryMod.Inventory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.inventoryMod.Inventory]
    inline def get(name: String, id: Input[ID], state: InventoryState): typings.pulumiAws.inventoryMod.Inventory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.inventoryMod.Inventory]
    inline def get(name: String, id: Input[ID], state: InventoryState, opts: CustomResourceOptions): typings.pulumiAws.inventoryMod.Inventory = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.inventoryMod.Inventory]
    
    /**
      * Returns true if the given object is an instance of Inventory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/inventory.Inventory */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/s3/inventory.Inventory */ Boolean]
  }
  
  @JSImport("@pulumi/aws/s3", "LogDeliveryWriteAcl")
  @js.native
  def LogDeliveryWriteAcl: CannedAcl = js.native
  inline def LogDeliveryWriteAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogDeliveryWriteAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "PrivateAcl")
  @js.native
  def PrivateAcl: CannedAcl = js.native
  inline def PrivateAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrivateAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "PublicReadAcl")
  @js.native
  def PublicReadAcl: CannedAcl = js.native
  inline def PublicReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PublicReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws/s3", "PublicReadWriteAcl")
  @js.native
  def PublicReadWriteAcl: CannedAcl = js.native
  inline def PublicReadWriteAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PublicReadWriteAcl")(x.asInstanceOf[js.Any])
  
  inline def getBucket(args: GetBucketArgs): js.Promise[GetBucketResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucket")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBucketResult]]
  inline def getBucket(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBucket")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBucketResult]]
  
  inline def getBucketObject(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObject")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBucketObjectResult]]
  inline def getBucketObject(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObject")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBucketObjectResult]]
  
  inline def getBucketObjects(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObjects")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBucketObjectsResult]]
  inline def getBucketObjects(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBucketObjects")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetBucketObjectsResult]]
  
  /* augmented module */
  object pulumiAwsS3BucketAugmentingMod {
    
    @js.native
    trait Bucket extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Bucket to the handler provided,
        * along with options to control the behavior of the subscription.  This function should be
        * used when full control over the subscription is wanted, and other helpers (like
        * onObjectCreated/onObjectRemoved) are not sufficient.
        */
      def onEvent(name: String, handler: BucketEventHandler, args: BucketEventSubscriptionArgs): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onEvent(
        name: String,
        handler: BucketEventHandler,
        args: BucketEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this Bucket to the handler provided,
        * along with options to control the behavior of the subscription.  The handler will be
        * called whenever a matching [s3.Object] is created.
        */
      def onObjectCreated(name: String, handler: BucketEventHandler): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onObjectCreated(name: String, handler: BucketEventHandler, args: Unit, opts: ComponentResourceOptions): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onObjectCreated(name: String, handler: BucketEventHandler, args: ObjectCreatedSubscriptionArgs): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onObjectCreated(
        name: String,
        handler: BucketEventHandler,
        args: ObjectCreatedSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this Bucket to the handler provided,
        * along with options to control the behavior of the subscription.  The handler will be
        * called whenever an matching [s3.Object] is removed.
        */
      def onObjectRemoved(name: String, handler: BucketEventHandler): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onObjectRemoved(name: String, handler: BucketEventHandler, args: Unit, opts: ComponentResourceOptions): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
      def onObjectRemoved(
        name: String,
        handler: BucketEventHandler,
        args: ObjectRemovedSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    }
  }
}
