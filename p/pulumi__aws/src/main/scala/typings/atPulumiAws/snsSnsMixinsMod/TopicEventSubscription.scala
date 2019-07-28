package typings.atPulumiAws.snsSnsMixinsMod

import typings.atPulumiAws.lambdaMod.EventSubscription
import typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic
import typings.atPulumiAws.snsTopicSubscriptionMod.TopicSubscription
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns/snsMixins", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected () extends EventSubscription {
  def this(name: String, topic: Topic, handler: TopicEventHandler) = this()
  def this(name: String, topic: Topic, handler: TopicEventHandler, args: TopicEventSubscriptionArgs) = this()
  def this(
    name: String,
    topic: Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  /**
    * The underlying sns object created for the subscription.
    */
  val subscription: TopicSubscription = js.native
  val topic: Topic = js.native
}

