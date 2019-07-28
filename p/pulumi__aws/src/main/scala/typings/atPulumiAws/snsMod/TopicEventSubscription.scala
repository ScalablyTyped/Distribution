package typings.atPulumiAws.snsMod

import typings.atPulumiAws.snsSnsMixinsMod.TopicEventHandler
import typings.atPulumiAws.snsSnsMixinsMod.TopicEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends typings.atPulumiAws.snsSnsMixinsMod.TopicEventSubscription {
  def this(
    name: String,
    topic: typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic,
    handler: TopicEventHandler
  ) = this()
  def this(
    name: String,
    topic: typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    topic: typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic,
    handler: TopicEventHandler,
    args: TopicEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

