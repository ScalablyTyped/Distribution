package typings.pulumiAws.mod.sqs

import typings.pulumiAws.sqsMixinsMod.QueueEventHandler
import typings.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/sqs/queue", JSImport.Namespace)
@js.native
object pulumiAwsSqsQueueAugmentingMod extends js.Object {
  @js.native
  trait Queue extends js.Object {
    /**
      * Creates a new subscription to events fired from this Queue to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: QueueEventHandler): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
    def onEvent(
      name: String,
      handler: QueueEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
    def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
    def onEvent(
      name: String,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.sqsMixinsMod.QueueEventSubscription = js.native
  }
  
}

