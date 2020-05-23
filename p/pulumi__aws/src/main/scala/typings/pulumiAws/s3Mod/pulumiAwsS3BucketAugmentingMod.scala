package typings.pulumiAws.s3Mod

import typings.pulumiAws.s3MixinsMod.BucketEventHandler
import typings.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typings.pulumiAws.s3MixinsMod.ObjectCreatedSubscriptionArgs
import typings.pulumiAws.s3MixinsMod.ObjectRemovedSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/s3", "@pulumi/aws/s3/bucket")
@js.native
object pulumiAwsS3BucketAugmentingMod extends js.Object {
  @js.native
  trait Bucket extends js.Object {
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
    def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
    def onObjectRemoved(
      name: String,
      handler: BucketEventHandler,
      args: ObjectRemovedSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.s3MixinsMod.BucketEventSubscription = js.native
  }
  
}

