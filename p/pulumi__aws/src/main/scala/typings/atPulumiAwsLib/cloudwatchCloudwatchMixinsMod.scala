package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/cloudwatchMixins", JSImport.Namespace)
@js.native
object cloudwatchCloudwatchMixinsMod extends js.Object {
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

