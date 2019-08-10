package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockArgs
import typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState
import typings.atPulumiAws.s3BucketMetricMod.BucketMetricArgs
import typings.atPulumiAws.s3BucketMetricMod.BucketMetricState
import typings.atPulumiAws.s3BucketMod.BucketArgs
import typings.atPulumiAws.s3BucketMod.BucketState
import typings.atPulumiAws.s3BucketNotificationMod.BucketNotificationArgs
import typings.atPulumiAws.s3BucketNotificationMod.BucketNotificationState
import typings.atPulumiAws.s3BucketObjectMod.BucketObjectArgs
import typings.atPulumiAws.s3BucketObjectMod.BucketObjectState
import typings.atPulumiAws.s3BucketPolicyMod.BucketPolicyArgs
import typings.atPulumiAws.s3BucketPolicyMod.BucketPolicyState
import typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockArgs
import typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockState
import typings.atPulumiAws.s3CannedAclMod.CannedAcl
import typings.atPulumiAws.s3GetBucketMod.GetBucketArgs
import typings.atPulumiAws.s3GetBucketMod.GetBucketResult
import typings.atPulumiAws.s3GetBucketObjectMod.GetBucketObjectArgs
import typings.atPulumiAws.s3GetBucketObjectMod.GetBucketObjectResult
import typings.atPulumiAws.s3GetBucketObjectsMod.GetBucketObjectsArgs
import typings.atPulumiAws.s3GetBucketObjectsMod.GetBucketObjectsResult
import typings.atPulumiAws.s3InventoryMod.InventoryArgs
import typings.atPulumiAws.s3InventoryMod.InventoryState
import typings.atPulumiAws.s3S3MixinsMod.BucketEventHandler
import typings.atPulumiAws.s3S3MixinsMod.BucketEventSubscriptionArgs
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3")
@js.native
object s3Ns extends js.Object {
  @js.native
  class AccountPublicAccessBlock protected ()
    extends typings.atPulumiAws.s3Mod.AccountPublicAccessBlock {
    /**
      * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs) = this()
    def this(name: String, args: AccountPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Bucket protected ()
    extends typings.atPulumiAws.s3Mod.Bucket {
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
  }
  
  @js.native
  class BucketEventSubscription protected ()
    extends typings.atPulumiAws.s3Mod.BucketEventSubscription {
    def this(
      name: String,
      bucket: typings.atPulumiAws.s3S3MixinsMod.s3BucketMod.Bucket,
      handler: BucketEventHandler,
      args: BucketEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      bucket: typings.atPulumiAws.s3S3MixinsMod.s3BucketMod.Bucket,
      handler: BucketEventHandler,
      args: BucketEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @js.native
  class BucketMetric protected ()
    extends typings.atPulumiAws.s3Mod.BucketMetric {
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
  
  @js.native
  class BucketNotification protected ()
    extends typings.atPulumiAws.s3Mod.BucketNotification {
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
  
  @js.native
  class BucketObject protected ()
    extends typings.atPulumiAws.s3Mod.BucketObject {
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
  
  @js.native
  class BucketPolicy protected ()
    extends typings.atPulumiAws.s3Mod.BucketPolicy {
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
  
  @js.native
  class BucketPublicAccessBlock protected ()
    extends typings.atPulumiAws.s3Mod.BucketPublicAccessBlock {
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
  
  @js.native
  class Inventory protected ()
    extends typings.atPulumiAws.s3Mod.Inventory {
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
  
  var AuthenticatedReadAcl: CannedAcl = js.native
  var AwsExecReadAcl: CannedAcl = js.native
  var BucketOwnerFullControlAcl: CannedAcl = js.native
  var BucketOwnerReadAcl: CannedAcl = js.native
  var LogDeliveryWriteAcl: CannedAcl = js.native
  var PrivateAcl: CannedAcl = js.native
  var PublicReadAcl: CannedAcl = js.native
  var PublicReadWriteAcl: CannedAcl = js.native
  def getBucket(args: GetBucketArgs): js.Promise[GetBucketResult] with GetBucketResult = js.native
  def getBucket(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] with GetBucketResult = js.native
  def getBucketObject(args: GetBucketObjectArgs): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
  def getBucketObject(args: GetBucketObjectArgs, opts: InvokeOptions): js.Promise[GetBucketObjectResult] with GetBucketObjectResult = js.native
  def getBucketObjects(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
  def getBucketObjects(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] with GetBucketObjectsResult = js.native
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState): typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState, opts: CustomResourceOptions): typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    /**
      * Returns true if the given object is an instance of AccountPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accountPublicAccessBlock.AccountPublicAccessBlock */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3S3MixinsMod.s3BucketMod.Bucket = js.native
    def get(name: String, id: Input[ID], state: BucketState): typings.atPulumiAws.s3S3MixinsMod.s3BucketMod.Bucket = js.native
    def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typings.atPulumiAws.s3S3MixinsMod.s3BucketMod.Bucket = js.native
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/s3Mixins.@pulumi/aws/s3/bucket.Bucket */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BucketMetric extends js.Object {
    /**
      * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3BucketMetricMod.BucketMetric = js.native
    def get(name: String, id: Input[ID], state: BucketMetricState): typings.atPulumiAws.s3BucketMetricMod.BucketMetric = js.native
    def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): typings.atPulumiAws.s3BucketMetricMod.BucketMetric = js.native
    /**
      * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BucketNotification extends js.Object {
    /**
      * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3BucketNotificationMod.BucketNotification = js.native
    def get(name: String, id: Input[ID], state: BucketNotificationState): typings.atPulumiAws.s3BucketNotificationMod.BucketNotification = js.native
    def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): typings.atPulumiAws.s3BucketNotificationMod.BucketNotification = js.native
    /**
      * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BucketObject extends js.Object {
    /**
      * Get an existing BucketObject resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3BucketObjectMod.BucketObject = js.native
    def get(name: String, id: Input[ID], state: BucketObjectState): typings.atPulumiAws.s3BucketObjectMod.BucketObject = js.native
    def get(name: String, id: Input[ID], state: BucketObjectState, opts: CustomResourceOptions): typings.atPulumiAws.s3BucketObjectMod.BucketObject = js.native
    /**
      * Returns true if the given object is an instance of BucketObject.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketObject.BucketObject */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BucketPolicy extends js.Object {
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState): typings.atPulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.s3BucketPolicyMod.BucketPolicy = js.native
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object BucketPublicAccessBlock extends js.Object {
    /**
      * Get an existing BucketPublicAccessBlock resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState): typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState, opts: CustomResourceOptions): typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    /**
      * Returns true if the given object is an instance of BucketPublicAccessBlock.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Inventory extends js.Object {
    /**
      * Get an existing Inventory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.s3InventoryMod.Inventory = js.native
    def get(name: String, id: Input[ID], state: InventoryState): typings.atPulumiAws.s3InventoryMod.Inventory = js.native
    def get(name: String, id: Input[ID], state: InventoryState, opts: CustomResourceOptions): typings.atPulumiAws.s3InventoryMod.Inventory = js.native
    /**
      * Returns true if the given object is an instance of Inventory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/inventory.Inventory */ Boolean = js.native
  }
  
}

