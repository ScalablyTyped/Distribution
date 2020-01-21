package typings.pulumiAws.mod.kinesis

import typings.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typings.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis.StreamEventSubscription")
@js.native
class StreamEventSubscription protected ()
  extends typings.pulumiAws.kinesisMod.StreamEventSubscription {
  def this(
    name: String,
    stream: typings.pulumiAws.streamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    stream: typings.pulumiAws.streamMod.Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

