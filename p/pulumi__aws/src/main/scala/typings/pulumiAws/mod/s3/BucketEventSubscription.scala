package typings.pulumiAws.mod.s3

import typings.pulumiAws.s3MixinsMod.BucketEventHandler
import typings.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.BucketEventSubscription")
@js.native
class BucketEventSubscription protected ()
  extends typings.pulumiAws.s3Mod.BucketEventSubscription {
  def this(
    name: String,
    bucket: typings.pulumiAws.bucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    bucket: typings.pulumiAws.bucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

