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
import scala.scalajs.js.`|`
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
      args: js.UndefOr[scala.Nothing],
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
  
  @js.native
  trait DecodedLogGroupEvent extends StObject {
    
    var logEvents: js.Array[LogGroupEventRecord] = js.native
    
    var logGroup: String = js.native
    
    var logStream: String = js.native
    
    var messageType: String = js.native
    
    var owner: String = js.native
    
    var subscriptionFilters: js.Array[String] = js.native
  }
  object DecodedLogGroupEvent {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class DecodedLogGroupEventMutableBuilder[Self <: DecodedLogGroupEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogEvents(value: js.Array[LogGroupEventRecord]): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogEventsVarargs(value: LogGroupEventRecord*): Self = StObject.set(x, "logEvents", js.Array(value :_*))
      
      @scala.inline
      def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStream(value: String): Self = StObject.set(x, "logStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionFilters(value: js.Array[String]): Self = StObject.set(x, "subscriptionFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionFiltersVarargs(value: String*): Self = StObject.set(x, "subscriptionFilters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LogGroupEvent extends StObject {
    
    var awslogs: Data = js.native
  }
  object LogGroupEvent {
    
    @scala.inline
    def apply(awslogs: Data): LogGroupEvent = {
      val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogGroupEvent]
    }
    
    @scala.inline
    implicit class LogGroupEventMutableBuilder[Self <: LogGroupEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwslogs(value: Data): Self = StObject.set(x, "awslogs", value.asInstanceOf[js.Any])
    }
  }
  
  type LogGroupEventHandler = EventHandler[LogGroupEvent, Unit]
  
  @js.native
  trait LogGroupEventRecord extends StObject {
    
    var id: String = js.native
    
    var message: String = js.native
    
    var timestamp: Double = js.native
  }
  object LogGroupEventRecord {
    
    @scala.inline
    def apply(id: String, message: String, timestamp: Double): LogGroupEventRecord = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogGroupEventRecord]
    }
    
    @scala.inline
    implicit class LogGroupEventRecordMutableBuilder[Self <: LogGroupEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogGroupEventSubscriptionArgs extends StObject {
    
    /**
      * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. If
      * not provided, the empty-string pattern will be used.
      */
    var filterPattern: js.UndefOr[String] = js.native
  }
  object LogGroupEventSubscriptionArgs {
    
    @scala.inline
    def apply(): LogGroupEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogGroupEventSubscriptionArgs]
    }
    
    @scala.inline
    implicit class LogGroupEventSubscriptionArgsMutableBuilder[Self <: LogGroupEventSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterPattern(value: String): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
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
        args: js.UndefOr[scala.Nothing],
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
      def onEvent(
        name: String,
        handler: LogGroupEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): LogGroupEventSubscription = js.native
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
