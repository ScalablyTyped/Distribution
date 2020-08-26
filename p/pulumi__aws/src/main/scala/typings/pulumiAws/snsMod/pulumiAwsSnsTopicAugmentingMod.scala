package typings.pulumiAws.snsMod

import typings.pulumiAws.snsMixinsMod.TopicEventHandler
import typings.pulumiAws.snsMixinsMod.TopicEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/sns", "@pulumi/aws/sns/topic")
@js.native
object pulumiAwsSnsTopicAugmentingMod extends js.Object {
  @js.native
  trait Topic extends js.Object {
    /**
      * Creates a new subscription to events fired from this Topic to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: TopicEventHandler): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
    def onEvent(
      name: String,
      handler: TopicEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
    def onEvent(name: String, handler: TopicEventHandler, args: TopicEventSubscriptionArgs): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
    def onEvent(
      name: String,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
  }
  
}

