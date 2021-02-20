package typings.pulumiAws.mod

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3 {
  
  @JSImport("@pulumi/aws", "s3")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "s3.AccessPoint")
  @js.native
  class AccessPoint protected ()
    extends typings.pulumiAws.s3Mod.AccessPoint {
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
    
    /**
      * Get an existing AccessPoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3AccessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws", "s3.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.s3AccessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws", "s3.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState): typings.pulumiAws.s3AccessPointMod.AccessPoint = js.native
    @JSImport("@pulumi/aws", "s3.AccessPoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccessPointState, opts: CustomResourceOptions): typings.pulumiAws.s3AccessPointMod.AccessPoint = js.native
    
    /**
      * Returns true if the given object is an instance of AccessPoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.AccessPoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accessPoint.AccessPoint */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock")
  @js.native
  class AccountPublicAccessBlock protected ()
    extends typings.pulumiAws.s3Mod.AccountPublicAccessBlock {
    /**
      * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AccountPublicAccessBlock {
    
    /**
      * Get an existing AccountPublicAccessBlock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    @JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    @JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    @JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState, opts: CustomResourceOptions): typings.pulumiAws.accountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    
    /**
      * Returns true if the given object is an instance of AccountPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accountPublicAccessBlock.AccountPublicAccessBlock */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.AnalyticsConfiguration")
  @js.native
  class AnalyticsConfiguration protected ()
    extends typings.pulumiAws.s3Mod.AnalyticsConfiguration {
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
    
    /**
      * Get an existing AnalyticsConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
    @JSImport("@pulumi/aws", "s3.AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
    @JSImport("@pulumi/aws", "s3.AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsConfigurationState): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
    @JSImport("@pulumi/aws", "s3.AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.analyticsConfigurationMod.AnalyticsConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of AnalyticsConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.AnalyticsConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/analyticsConfiguration.AnalyticsConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.AuthenticatedReadAcl")
  @js.native
  def AuthenticatedReadAcl: CannedAcl = js.native
  @scala.inline
  def AuthenticatedReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AuthenticatedReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.AwsExecReadAcl")
  @js.native
  def AwsExecReadAcl: CannedAcl = js.native
  @scala.inline
  def AwsExecReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AwsExecReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.Bucket")
  @js.native
  class Bucket protected ()
    extends typings.pulumiAws.s3Mod.Bucket {
    /**
      * Create a Bucket resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: BucketArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Bucket {
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.Bucket.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3BucketMod.Bucket = js.native
    @JSImport("@pulumi/aws", "s3.Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.s3BucketMod.Bucket = js.native
    @JSImport("@pulumi/aws", "s3.Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketState): typings.pulumiAws.s3BucketMod.Bucket = js.native
    @JSImport("@pulumi/aws", "s3.Bucket.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typings.pulumiAws.s3BucketMod.Bucket = js.native
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.Bucket.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.BucketEventSubscription")
  @js.native
  class BucketEventSubscription protected ()
    extends typings.pulumiAws.s3Mod.BucketEventSubscription {
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
  
  @JSImport("@pulumi/aws", "s3.BucketMetric")
  @js.native
  class BucketMetric protected ()
    extends typings.pulumiAws.s3Mod.BucketMetric {
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
    
    /**
      * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketMetricMod.BucketMetric = js.native
    @JSImport("@pulumi/aws", "s3.BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketMetricMod.BucketMetric = js.native
    @JSImport("@pulumi/aws", "s3.BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketMetricState): typings.pulumiAws.bucketMetricMod.BucketMetric = js.native
    @JSImport("@pulumi/aws", "s3.BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): typings.pulumiAws.bucketMetricMod.BucketMetric = js.native
    
    /**
      * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.BucketMetric.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.BucketNotification")
  @js.native
  class BucketNotification protected ()
    extends typings.pulumiAws.s3Mod.BucketNotification {
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
    
    /**
      * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketNotificationMod.BucketNotification = js.native
    @JSImport("@pulumi/aws", "s3.BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketNotificationMod.BucketNotification = js.native
    @JSImport("@pulumi/aws", "s3.BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketNotificationState): typings.pulumiAws.bucketNotificationMod.BucketNotification = js.native
    @JSImport("@pulumi/aws", "s3.BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): typings.pulumiAws.bucketNotificationMod.BucketNotification = js.native
    
    /**
      * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.BucketNotification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.BucketObject")
  @js.native
  class BucketObject protected ()
    extends typings.pulumiAws.s3Mod.BucketObject {
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
    
    /**
      * Get an existing BucketObject resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketObjectMod.BucketObject = js.native
    @JSImport("@pulumi/aws", "s3.BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketObjectMod.BucketObject = js.native
    @JSImport("@pulumi/aws", "s3.BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketObjectState): typings.pulumiAws.bucketObjectMod.BucketObject = js.native
    @JSImport("@pulumi/aws", "s3.BucketObject.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketObjectState, opts: CustomResourceOptions): typings.pulumiAws.bucketObjectMod.BucketObject = js.native
    
    /**
      * Returns true if the given object is an instance of BucketObject.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.BucketObject.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.BucketOwnerFullControlAcl")
  @js.native
  def BucketOwnerFullControlAcl: CannedAcl = js.native
  @scala.inline
  def BucketOwnerFullControlAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BucketOwnerFullControlAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.BucketOwnerReadAcl")
  @js.native
  def BucketOwnerReadAcl: CannedAcl = js.native
  @scala.inline
  def BucketOwnerReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BucketOwnerReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.BucketOwnershipControls")
  @js.native
  class BucketOwnershipControls protected ()
    extends typings.pulumiAws.s3Mod.BucketOwnershipControls {
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
    
    /**
      * Get an existing BucketOwnershipControls resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = js.native
    @JSImport("@pulumi/aws", "s3.BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = js.native
    @JSImport("@pulumi/aws", "s3.BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketOwnershipControlsState): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = js.native
    @JSImport("@pulumi/aws", "s3.BucketOwnershipControls.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketOwnershipControlsState, opts: CustomResourceOptions): typings.pulumiAws.bucketOwnershipControlsMod.BucketOwnershipControls = js.native
    
    /**
      * Returns true if the given object is an instance of BucketOwnershipControls.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.BucketOwnershipControls.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.BucketPolicy")
  @js.native
  class BucketPolicy protected ()
    extends typings.pulumiAws.s3Mod.BucketPolicy {
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
    
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    @JSImport("@pulumi/aws", "s3.BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    @JSImport("@pulumi/aws", "s3.BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    @JSImport("@pulumi/aws", "s3.BucketPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typings.pulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.BucketPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.BucketPublicAccessBlock")
  @js.native
  class BucketPublicAccessBlock protected ()
    extends typings.pulumiAws.s3Mod.BucketPublicAccessBlock {
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
    
    /**
      * Get an existing BucketPublicAccessBlock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.BucketPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    @JSImport("@pulumi/aws", "s3.BucketPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    @JSImport("@pulumi/aws", "s3.BucketPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    @JSImport("@pulumi/aws", "s3.BucketPublicAccessBlock.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState, opts: CustomResourceOptions): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    
    /**
      * Returns true if the given object is an instance of BucketPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.BucketPublicAccessBlock.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean = js.native
  }
  
  object CannedAcl {
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.AuthenticatedRead")
    @js.native
    val AuthenticatedRead: `authenticated-read` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.AwsExecRead")
    @js.native
    val AwsExecRead: `aws-exec-read` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.BucketOwnerFullControl")
    @js.native
    val BucketOwnerFullControl: `bucket-owner-full-control` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.BucketOwnerRead")
    @js.native
    val BucketOwnerRead: `bucket-owner-read` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.LogDeliveryWrite")
    @js.native
    val LogDeliveryWrite: `log-delivery-write` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.Private")
    @js.native
    val Private: `private` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.PublicRead")
    @js.native
    val PublicRead: `public-read` = js.native
    
    @JSImport("@pulumi/aws", "s3.CannedAcl.PublicReadWrite")
    @js.native
    val PublicReadWrite: `public-read-write` = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.Inventory")
  @js.native
  class Inventory protected ()
    extends typings.pulumiAws.s3Mod.Inventory {
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
    
    /**
      * Get an existing Inventory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "s3.Inventory.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.inventoryMod.Inventory = js.native
    @JSImport("@pulumi/aws", "s3.Inventory.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.inventoryMod.Inventory = js.native
    @JSImport("@pulumi/aws", "s3.Inventory.get")
    @js.native
    def get(name: String, id: Input[ID], state: InventoryState): typings.pulumiAws.inventoryMod.Inventory = js.native
    @JSImport("@pulumi/aws", "s3.Inventory.get")
    @js.native
    def get(name: String, id: Input[ID], state: InventoryState, opts: CustomResourceOptions): typings.pulumiAws.inventoryMod.Inventory = js.native
    
    /**
      * Returns true if the given object is an instance of Inventory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "s3.Inventory.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/inventory.Inventory */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "s3.LogDeliveryWriteAcl")
  @js.native
  def LogDeliveryWriteAcl: CannedAcl = js.native
  @scala.inline
  def LogDeliveryWriteAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogDeliveryWriteAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.PrivateAcl")
  @js.native
  def PrivateAcl: CannedAcl = js.native
  @scala.inline
  def PrivateAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrivateAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.PublicReadAcl")
  @js.native
  def PublicReadAcl: CannedAcl = js.native
  @scala.inline
  def PublicReadAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PublicReadAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.PublicReadWriteAcl")
  @js.native
  def PublicReadWriteAcl: CannedAcl = js.native
  @scala.inline
  def PublicReadWriteAcl_=(x: CannedAcl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PublicReadWriteAcl")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/aws", "s3.getBucket")
  @js.native
  def getBucket(args: GetBucketArgs): js.Promise[GetBucketResult] = js.native
  @JSImport("@pulumi/aws", "s3.getBucket")
  @js.native
  def getBucket(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] = js.native
  
  @JSImport("@pulumi/aws", "s3.getBucketObject")
  @js.native
  def getBucketObject(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] = js.native
  @JSImport("@pulumi/aws", "s3.getBucketObject")
  @js.native
  def getBucketObject(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] = js.native
  
  @JSImport("@pulumi/aws", "s3.getBucketObjects")
  @js.native
  def getBucketObjects(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] = js.native
  @JSImport("@pulumi/aws", "s3.getBucketObjects")
  @js.native
  def getBucketObjects(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] = js.native
  
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
      def onObjectCreated(
        name: String,
        handler: BucketEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
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
      def onObjectRemoved(
        name: String,
        handler: BucketEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
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
