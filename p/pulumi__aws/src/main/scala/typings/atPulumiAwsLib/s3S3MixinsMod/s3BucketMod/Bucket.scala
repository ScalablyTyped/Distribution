package typings
package atPulumiAwsLib.s3S3MixinsMod.s3BucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  This function should be
    * used when full control over the subscription is wanted, and other helpers (like
    * onObjectCreated/onObjectRemoved) are not sufficient.
    */
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler,
    args: atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscriptionArgs
  ): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler,
    args: atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  The handler will be
    * called whenever a matching [s3.Object] is created.
    */
  def onObjectCreated(name: java.lang.String, handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  def onObjectCreated(
    name: java.lang.String,
    handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler,
    args: atPulumiAwsLib.s3S3MixinsMod.ObjectCreatedSubscriptionArgs
  ): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  def onObjectCreated(
    name: java.lang.String,
    handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler,
    args: atPulumiAwsLib.s3S3MixinsMod.ObjectCreatedSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  The handler will be
    * called whenever an matching [s3.Object] is removed.
    */
  def onObjectRemoved(name: java.lang.String, handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  def onObjectRemoved(
    name: java.lang.String,
    handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler,
    args: atPulumiAwsLib.s3S3MixinsMod.ObjectRemovedSubscriptionArgs
  ): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
  def onObjectRemoved(
    name: java.lang.String,
    handler: atPulumiAwsLib.s3S3MixinsMod.BucketEventHandler,
    args: atPulumiAwsLib.s3S3MixinsMod.ObjectRemovedSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.s3S3MixinsMod.BucketEventSubscription = js.native
}

