package typings.pulumiAws

import typings.pulumiAws.anon.Data
import typings.pulumiAws.lambdaMixinsMod.Callback
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.logGroupMod.LogGroup
import typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logGroupMixinsMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logGroupMixins", "LogGroupEventSubscription")
  @js.native
  class LogGroupEventSubscription protected () extends EventSubscription {
    def this(name: String, logGroup: LogGroup, handler: LogGroupEventHandler) = this()
    def this(
      name: String,
      logGroup: LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      logGroup: LogGroup,
      handler: LogGroupEventHandler,
      args: Unit,
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      logGroup: LogGroup,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    
    val logGroup: LogGroup = js.native
    
    val logSubscriptionFilter: LogSubscriptionFilter = js.native
  }
  
  trait DecodedLogGroupEvent extends StObject {
    
    var logEvents: js.Array[LogGroupEventRecord]
    
    var logGroup: String
    
    var logStream: String
    
    var messageType: String
    
    var owner: String
    
    var subscriptionFilters: js.Array[String]
  }
  object DecodedLogGroupEvent {
    
    inline def apply(
      logEvents: js.Array[LogGroupEventRecord],
      logGroup: String,
      logStream: String,
      messageType: String,
      owner: String,
      subscriptionFilters: js.Array[String]
    ): DecodedLogGroupEvent = {
      val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any], logStream = logStream.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], subscriptionFilters = subscriptionFilters.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedLogGroupEvent]
    }
    
    extension [Self <: DecodedLogGroupEvent](x: Self) {
      
      inline def setLogEvents(value: js.Array[LogGroupEventRecord]): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
      
      inline def setLogEventsVarargs(value: LogGroupEventRecord*): Self = StObject.set(x, "logEvents", js.Array(value :_*))
      
      inline def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
      
      inline def setLogStream(value: String): Self = StObject.set(x, "logStream", value.asInstanceOf[js.Any])
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionFilters(value: js.Array[String]): Self = StObject.set(x, "subscriptionFilters", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionFiltersVarargs(value: String*): Self = StObject.set(x, "subscriptionFilters", js.Array(value :_*))
    }
  }
  
  trait LogGroupEvent extends StObject {
    
    var awslogs: Data
  }
  object LogGroupEvent {
    
    inline def apply(awslogs: Data): LogGroupEvent = {
      val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogGroupEvent]
    }
    
    extension [Self <: LogGroupEvent](x: Self) {
      
      inline def setAwslogs(value: Data): Self = StObject.set(x, "awslogs", value.asInstanceOf[js.Any])
    }
  }
  
  type LogGroupEventHandler = EventHandler[LogGroupEvent, Unit]
  
  trait LogGroupEventRecord extends StObject {
    
    var id: String
    
    var message: String
    
    var timestamp: Double
  }
  object LogGroupEventRecord {
    
    inline def apply(id: String, message: String, timestamp: Double): LogGroupEventRecord = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogGroupEventRecord]
    }
    
    extension [Self <: LogGroupEventRecord](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogGroupEventSubscriptionArgs extends StObject {
    
    /**
      * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. If
      * not provided, the empty-string pattern will be used.
      */
    var filterPattern: js.UndefOr[String] = js.undefined
  }
  object LogGroupEventSubscriptionArgs {
    
    inline def apply(): LogGroupEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogGroupEventSubscriptionArgs]
    }
    
    extension [Self <: LogGroupEventSubscriptionArgs](x: Self) {
      
      inline def setFilterPattern(value: String): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
      
      inline def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    }
  }
  
  /* augmented module */
  object pulumiAwsCloudwatchLogGroupAugmentingMod {
    
    @js.native
    trait LogGroup extends StObject {
      
      /**
        * Creates a new subscription to events fired from this LogGroup to the callback provided,
        * along with options to control the behavior of the subscription.
        *
        * The events will be provided in their decoded form.  Because this event hookup needs to
        * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
        * not a [lambda.Function] instance.
        */
      def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): LogGroupEventSubscription = js.native
      def onDecodedEvent(
        name: String,
        callback: Callback[DecodedLogGroupEvent, Unit],
        args: Unit,
        opts: ComponentResourceOptions
      ): LogGroupEventSubscription = js.native
      def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
      def onDecodedEvent(
        name: String,
        callback: Callback[DecodedLogGroupEvent, Unit],
        args: LogGroupEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): LogGroupEventSubscription = js.native
      
      /**
        * Creates a new subscription to events fired from this LogGroup to the handler provided,
        * along with options to control the behavior of the subscription.
        *
        * The events will be produced in raw (gzipped + base64 encoded) form.
        */
      def onEvent(name: String, handler: LogGroupEventHandler): LogGroupEventSubscription = js.native
      def onEvent(name: String, handler: LogGroupEventHandler, args: Unit, opts: ComponentResourceOptions): LogGroupEventSubscription = js.native
      def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
      def onEvent(
        name: String,
        handler: LogGroupEventHandler,
        args: LogGroupEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): LogGroupEventSubscription = js.native
    }
  }
}
