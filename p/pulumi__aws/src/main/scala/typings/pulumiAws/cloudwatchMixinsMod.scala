package typings.pulumiAws

import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudwatchMixinsMod {
  
  @JSImport("@pulumi/aws/cloudwatch/cloudwatchMixins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): EventRuleEventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("onSchedule")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventRuleEventSubscription]
  inline def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: Unit,
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("onSchedule")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventRuleEventSubscription]
  inline def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): EventRuleEventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("onSchedule")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[EventRuleEventSubscription]
  inline def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("onSchedule")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventRuleEventSubscription]
}
