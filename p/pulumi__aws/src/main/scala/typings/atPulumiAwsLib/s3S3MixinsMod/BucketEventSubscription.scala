package typings
package atPulumiAwsLib.s3S3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/s3Mixins", "BucketEventSubscription")
@js.native
class BucketEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, bucket: atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket, handler: BucketEventHandler, args: BucketEventSubscriptionArgs) = this()
  def this(name: java.lang.String, bucket: atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket, handler: BucketEventHandler, args: BucketEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  val bucket: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.s3S3MixinsMod.s3BucketMod.Bucket] = js.native
}

