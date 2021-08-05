package typings.pulumiAws

import typings.pulumiAws.eventRuleMod.EventRule
import typings.pulumiAws.eventTargetMod.EventTarget
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventRuleMixinsMod {
  
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
      args: Unit,
      opts: ComponentResourceOptions
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
      args: Unit,
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
  
  trait EventRuleEvent extends StObject {
    
    var account: String
    
    var detail: Record[String, js.Any]
    
    var `detail-type`: String
    
    var id: String
    
    var region: String
    
    var resources: js.Array[String]
    
    var source: String
    
    var time: String
    
    var version: String
  }
  object EventRuleEvent {
    
    inline def apply(
      account: String,
      detail: Record[String, js.Any],
      `detail-type`: String,
      id: String,
      region: String,
      resources: js.Array[String],
      source: String,
      time: String,
      version: String
    ): EventRuleEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventRuleEvent]
    }
    
    extension [Self <: EventRuleEvent](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: Record[String, js.Any]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def `setDetail-type`(value: String): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type EventRuleEventHandler = EventHandler[EventRuleEvent, Unit]
  
  trait EventRuleEventSubscriptionArgs extends StObject
  
  /* augmented module */
  object pulumiAwsCloudwatchEventRuleAugmentingMod {
    
    @js.native
    trait EventRule extends StObject {
      
      /**
        * Creates a new subscription to events fired from this EventRule to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
      def onEvent(name: String, handler: EventRuleEventHandler, args: Unit, opts: ComponentResourceOptions): EventRuleEventSubscription = js.native
      def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): EventRuleEventSubscription = js.native
      def onEvent(
        name: String,
        handler: EventRuleEventHandler,
        args: EventRuleEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): EventRuleEventSubscription = js.native
    }
  }
}
