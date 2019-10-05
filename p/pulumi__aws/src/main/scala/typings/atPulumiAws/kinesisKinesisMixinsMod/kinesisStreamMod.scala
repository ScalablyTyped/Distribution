package typings.atPulumiAws.kinesisKinesisMixinsMod

import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/kinesis/stream", JSImport.Namespace)
@js.native
object kinesisStreamMod extends js.Object {
  @js.native
  trait Stream extends js.Object {
    /**
      * Creates a new subscription to events fired from this Stream to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): StreamEventSubscription = js.native
    def onEvent(
      name: String,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): StreamEventSubscription = js.native
  }
  
}

