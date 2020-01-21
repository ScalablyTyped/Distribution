package typings.pulumiAws.mod.cloudwatch

import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.onSchedule")
@js.native
object onSchedule extends js.Object {
  def apply(name: String, schedule: String, handler: EventRuleEventHandler): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
}

