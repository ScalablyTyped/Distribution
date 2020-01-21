package typings.pulumiAws.snsMixinsMod

import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/sns/topic", JSImport.Namespace)
@js.native
object pulumiAwsSnsTopicAugmentingMod extends js.Object {
  @js.native
  trait Topic extends js.Object {
    /**
      * Creates a new subscription to events fired from this Topic to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: TopicEventHandler): TopicEventSubscription = js.native
    def onEvent(name: String, handler: TopicEventHandler, args: TopicEventSubscriptionArgs): TopicEventSubscription = js.native
    def onEvent(
      name: String,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): TopicEventSubscription = js.native
  }
  
}

