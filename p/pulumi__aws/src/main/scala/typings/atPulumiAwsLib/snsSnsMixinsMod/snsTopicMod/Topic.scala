package typings
package atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends js.Object {
  /**
    * Creates a new subscription to events fired from this Topic to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: java.lang.String, handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler): atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler,
    args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs
  ): atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler,
    args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscription = js.native
}

