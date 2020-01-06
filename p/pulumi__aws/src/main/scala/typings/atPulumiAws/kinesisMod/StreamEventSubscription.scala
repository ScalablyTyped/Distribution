package typings.atPulumiAws.kinesisMod

import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventHandler
import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "StreamEventSubscription")
@js.native
class StreamEventSubscription protected ()
  extends typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventSubscription {
  def this(
    name: String,
    stream: typings.atPulumiAws.kinesisStreamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    stream: typings.atPulumiAws.kinesisStreamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

