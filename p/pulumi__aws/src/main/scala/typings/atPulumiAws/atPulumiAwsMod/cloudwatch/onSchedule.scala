package typings.atPulumiAws.atPulumiAwsMod.cloudwatch

import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.onSchedule")
@js.native
object onSchedule extends js.Object {
  def apply(name: String, schedule: String, handler: EventRuleEventHandler): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
}

