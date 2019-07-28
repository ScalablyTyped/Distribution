package typings.atPulumiAws.cloudwatchMod

import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.atPulumiAws.cloudwatchGetLogGroupMod.GetLogGroupArgs
import typings.atPulumiAws.cloudwatchGetLogGroupMod.GetLogGroupResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLogGroup(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] with GetLogGroupResult = js.native
  def getLogGroup(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] with GetLogGroupResult = js.native
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typings.atPulumiAws.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
}

