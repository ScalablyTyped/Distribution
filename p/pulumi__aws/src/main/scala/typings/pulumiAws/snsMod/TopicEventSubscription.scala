package typings.pulumiAws.snsMod

import typings.pulumiAws.snsMixinsMod.TopicEventHandler
import typings.pulumiAws.snsMixinsMod.TopicEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends typings.pulumiAws.snsMixinsMod.TopicEventSubscription {
  def this(name: String, topic: typings.pulumiAws.topicMod.Topic, handler: TopicEventHandler) = this()
  def this(
    name: String,
    topic: typings.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    topic: typings.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    topic: typings.pulumiAws.topicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

