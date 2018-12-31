package typings
package atPulumiAwsLib.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "TopicEventSubscription")
@js.native
class TopicEventSubscription protected ()
  extends atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription {
  def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler, args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs) = this()
  def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler, args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
}

