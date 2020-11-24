package typings.pulumiAws.kinesisMixinsMod

import typings.pulumiAws.lambdaMod.EventSourceMapping
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.streamMod.Stream
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/kinesis/kinesisMixins", "StreamEventSubscription")
@js.native
class StreamEventSubscription protected () extends EventSubscription {
  def this(name: String, stream: Stream, handler: StreamEventHandler, args: StreamEventSubscriptionArgs) = this()
  def this(
    name: String,
    stream: Stream,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  
  val eventSourceMapping: EventSourceMapping = js.native
  
  val stream: Stream = js.native
}
