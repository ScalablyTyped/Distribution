package typings.pulumiAws

import typings.pulumiAws.anon.ApproximateFirstReceiveTimestamp
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSourceMapping
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.sqsQueueMod.Queue
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsMixinsMod {
  
  @JSImport("@pulumi/aws/sqs/sqsMixins", "QueueEventSubscription")
  @js.native
  class QueueEventSubscription protected () extends EventSubscription {
    def this(name: String, queue: Queue, handler: QueueEventHandler) = this()
    def this(name: String, queue: Queue, handler: QueueEventHandler, args: QueueEventSubscriptionArgs) = this()
    def this(name: String, queue: Queue, handler: QueueEventHandler, args: Unit, opts: ComponentResourceOptions) = this()
    def this(
      name: String,
      queue: Queue,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    
    /**
      * The underlying sns object created for the subscription.
      */
    val eventSourceMapping: EventSourceMapping = js.native
    
    val queue: Queue = js.native
  }
  
  trait QueueEvent extends StObject {
    
    var Records: js.Array[QueueRecord]
  }
  object QueueEvent {
    
    @scala.inline
    def apply(Records: js.Array[QueueRecord]): QueueEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueEvent]
    }
    
    @scala.inline
    implicit class QueueEventMutableBuilder[Self <: QueueEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[QueueRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: QueueRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type QueueEventHandler = EventHandler[QueueEvent, Unit]
  
  trait QueueEventSubscriptionArgs extends StObject {
    
    /**
      * The largest number of records that AWS Lambda will retrieve. The maximum batch size supported
      * by Amazon Simple Queue Service is up to 10 queue messages per batch. The default setting is
      * 10.
      *
      * See https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html for more details.
      */
    var batchSize: js.UndefOr[Double] = js.undefined
  }
  object QueueEventSubscriptionArgs {
    
    @scala.inline
    def apply(): QueueEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueEventSubscriptionArgs]
    }
    
    @scala.inline
    implicit class QueueEventSubscriptionArgsMutableBuilder[Self <: QueueEventSubscriptionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    }
  }
  
  trait QueueRecord extends StObject {
    
    var attributes: ApproximateFirstReceiveTimestamp
    
    var awsRegion: String
    
    var body: String
    
    var eventSource: String
    
    var eventSourceARN: String
    
    var md5OfBody: String
    
    var messageAttributes: Record[String, js.Any]
    
    var messageId: String
    
    var receiptHandle: String
  }
  object QueueRecord {
    
    @scala.inline
    def apply(
      attributes: ApproximateFirstReceiveTimestamp,
      awsRegion: String,
      body: String,
      eventSource: String,
      eventSourceARN: String,
      md5OfBody: String,
      messageAttributes: Record[String, js.Any],
      messageId: String,
      receiptHandle: String
    ): QueueRecord = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], awsRegion = awsRegion.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], md5OfBody = md5OfBody.asInstanceOf[js.Any], messageAttributes = messageAttributes.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], receiptHandle = receiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueRecord]
    }
    
    @scala.inline
    implicit class QueueRecordMutableBuilder[Self <: QueueRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: ApproximateFirstReceiveTimestamp): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5OfBody(value: String): Self = StObject.set(x, "md5OfBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributes(value: Record[String, js.Any]): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptHandle(value: String): Self = StObject.set(x, "receiptHandle", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object pulumiAwsSqsQueueAugmentingMod {
    
    @js.native
    trait Queue extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Queue to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: QueueEventHandler): QueueEventSubscription = js.native
      def onEvent(name: String, handler: QueueEventHandler, args: Unit, opts: ComponentResourceOptions): QueueEventSubscription = js.native
      def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): QueueEventSubscription = js.native
      def onEvent(
        name: String,
        handler: QueueEventHandler,
        args: QueueEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): QueueEventSubscription = js.native
    }
  }
}
