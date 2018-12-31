package typings
package atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRule extends js.Object {
  /**
    * Creates a new subscription to events fired from this EventRule to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: java.lang.String, handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler,
    args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler,
    args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
}

