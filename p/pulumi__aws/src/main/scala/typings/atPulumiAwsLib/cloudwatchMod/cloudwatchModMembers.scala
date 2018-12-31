package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", JSImport.Namespace)
@js.native
object cloudwatchModMembers extends js.Object {
  def getLogGroup(args: atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupArgs): js.Promise[atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupResult] = js.native
  def getLogGroup(
    args: atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cloudwatchGetLogGroupMod.GetLogGroupResult] = js.native
  def onSchedule(
    name: java.lang.String,
    schedule: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: java.lang.String,
    schedule: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler,
    args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
  def onSchedule(
    name: java.lang.String,
    schedule: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventHandler,
    args: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchEventRuleMixinsMod.EventRuleEventSubscription = js.native
}

