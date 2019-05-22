package typings
package atPulumiAwsLib.cloudwatchEventRuleMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/eventRuleMixins", "EventRuleEventSubscription")
@js.native
class EventRuleEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, eventRuleOrSchedule: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule, handler: EventRuleEventHandler) = this()
  def this(name: java.lang.String, eventRuleOrSchedule: java.lang.String, handler: EventRuleEventHandler) = this()
  def this(name: java.lang.String, eventRuleOrSchedule: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs) = this()
  def this(name: java.lang.String, eventRuleOrSchedule: java.lang.String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs) = this()
  def this(name: java.lang.String, eventRuleOrSchedule: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  def this(name: java.lang.String, eventRuleOrSchedule: java.lang.String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  val eventRule: atPulumiAwsLib.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule = js.native
  val target: atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
}

