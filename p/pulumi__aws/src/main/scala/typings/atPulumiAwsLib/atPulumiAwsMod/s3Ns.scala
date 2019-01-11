package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3")
@js.native
object s3Ns extends js.Object {
  @js.native
  class AccountPublicAccessBlock protected ()
    extends atPulumiAwsLib.s3Mod.AccountPublicAccessBlock {
    /**
      * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Bucket protected ()
    extends atPulumiAwsLib.s3Mod.Bucket {
    /**
      * Create a Bucket resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketMod.BucketArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketMod.BucketArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class BucketEventSubscription protected ()
    extends atPulumiAwsLib.s3Mod.BucketEventSubscription {
    def this(name: java.lang.String, bucket: atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket, handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler, args: atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscriptionArgs) = this()
    def this(name: java.lang.String, bucket: atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket, handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler, args: atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class BucketMetric protected ()
    extends atPulumiAwsLib.s3Mod.BucketMetric {
    /**
      * Create a BucketMetric resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketMetricMod.BucketMetricArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketMetricMod.BucketMetricArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class BucketNotification protected ()
    extends atPulumiAwsLib.s3Mod.BucketNotification {
    /**
      * Create a BucketNotification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketNotificationMod.BucketNotificationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketNotificationMod.BucketNotificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class BucketObject protected ()
    extends atPulumiAwsLib.s3Mod.BucketObject {
    /**
      * Create a BucketObject resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketObjectMod.BucketObjectArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketObjectMod.BucketObjectArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class BucketPolicy protected ()
    extends atPulumiAwsLib.s3Mod.BucketPolicy {
    /**
      * Create a BucketPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class BucketPublicAccessBlock protected ()
    extends atPulumiAwsLib.s3Mod.BucketPublicAccessBlock {
    /**
      * Create a BucketPublicAccessBlock resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Inventory protected ()
    extends atPulumiAwsLib.s3Mod.Inventory {
    /**
      * Create a Inventory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.s3InventoryMod.InventoryArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.s3InventoryMod.InventoryArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  var AuthenticatedReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var AwsExecReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var BucketOwnerFullControlAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var BucketOwnerReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var LogDeliveryWriteAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var PrivateAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var PublicReadAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  var PublicReadWriteAcl: atPulumiAwsLib.s3CannedAclMod.CannedAcl = js.native
  def getBucket(args: atPulumiAwsLib.s3GetBucketMod.GetBucketArgs): js.Promise[atPulumiAwsLib.s3GetBucketMod.GetBucketResult] = js.native
  def getBucket(args: atPulumiAwsLib.s3GetBucketMod.GetBucketArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.s3GetBucketMod.GetBucketResult] = js.native
  def getBucketObject(args: atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectArgs): js.Promise[atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectResult] = js.native
  def getBucketObject(
    args: atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.s3GetBucketObjectMod.GetBucketObjectResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState
    ): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketMod.BucketState
    ): atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketMod.BucketState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketMetricMod.BucketMetric = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketMetricMod.BucketMetricState
    ): atPulumiAwsLib.s3BucketMetricMod.BucketMetric = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketMetricMod.BucketMetricState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3BucketMetricMod.BucketMetric = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketNotificationMod.BucketNotification = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketNotificationMod.BucketNotificationState
    ): atPulumiAwsLib.s3BucketNotificationMod.BucketNotification = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketNotificationMod.BucketNotificationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3BucketNotificationMod.BucketNotification = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketObjectMod.BucketObject = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketObjectMod.BucketObjectState
    ): atPulumiAwsLib.s3BucketObjectMod.BucketObject = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketObjectMod.BucketObjectState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3BucketObjectMod.BucketObject = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyState
    ): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockState
    ): atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  }
  
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3InventoryMod.Inventory = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3InventoryMod.InventoryState
    ): atPulumiAwsLib.s3InventoryMod.Inventory = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.s3InventoryMod.InventoryState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.s3InventoryMod.Inventory = js.native
  }
  
}

