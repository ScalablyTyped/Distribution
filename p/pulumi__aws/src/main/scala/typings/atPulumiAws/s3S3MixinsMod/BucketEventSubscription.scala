package typings.atPulumiAws.s3S3MixinsMod

import typings.atPulumiAws.lambdaMod.EventSubscription
import typings.atPulumiAws.s3S3MixinsMod.s3BucketMod.Bucket
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/s3Mixins", "BucketEventSubscription")
@js.native
class BucketEventSubscription protected () extends EventSubscription {
  def this(name: String, bucket: Bucket, handler: BucketEventHandler, args: BucketEventSubscriptionArgs) = this()
  def this(
    name: String,
    bucket: Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val bucket: Bucket = js.native
}

