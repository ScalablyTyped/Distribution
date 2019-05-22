package typings
package atPulumiAwsLib.snsSnsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns/snsMixins", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: TopicEventHandler) = this()
  def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: TopicEventHandler, args: TopicEventSubscriptionArgs) = this()
  def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: TopicEventHandler, args: TopicEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  /**
    * The underlying sns object created for the subscription.
    */
  val subscription: atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscription = js.native
  val topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
}

