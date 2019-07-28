package typings.atPulumiAws.cloudwatchEventRuleMixinsMod

import typings.atPulumiAws.cloudwatchEventRuleMixinsMod.cloudwatchEventRuleMod.EventRule
import typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget
import typings.atPulumiAws.lambdaMod.EventSubscription
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/eventRuleMixins", "EventRuleEventSubscription")
@js.native
class EventRuleEventSubscription protected () extends EventSubscription {
  def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
  def this(name: String, eventRuleOrSchedule: EventRule, handler: EventRuleEventHandler) = this()
  def this(
    name: String,
    eventRuleOrSchedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val eventRule: EventRule = js.native
  val target: EventTarget = js.native
}

