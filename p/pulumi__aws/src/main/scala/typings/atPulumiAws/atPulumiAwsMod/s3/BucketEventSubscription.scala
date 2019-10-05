package typings.atPulumiAws.atPulumiAwsMod.s3

import typings.atPulumiAws.s3S3MixinsMod.BucketEventHandler
import typings.atPulumiAws.s3S3MixinsMod.BucketEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.BucketEventSubscription")
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

