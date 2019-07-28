package typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod

import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription
import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRule extends js.Object {
  /**
    * Creates a new subscription to events fired from this EventRule to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
  def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): EventRuleEventSubscription = js.native
  def onEvent(
    name: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = js.native
}

