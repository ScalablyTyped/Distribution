package typings.pulumiAws.mod.kinesis

import typings.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typings.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/kinesis/stream", JSImport.Namespace)
@js.native
object pulumiAwsKinesisStreamAugmentingMod extends js.Object {
  @js.native
  trait Stream extends js.Object {
    /**
      * Creates a new subscription to events fired from this Stream to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): typings.pulumiAws.kinesisMixinsMod.StreamEventSubscription = js.native
    def onEvent(
      name: String,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.kinesisMixinsMod.StreamEventSubscription = js.native
  }
  
}

