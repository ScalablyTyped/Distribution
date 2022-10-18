package typings.sqsConsumer

import typings.awsSdk.clientsSqsMod.Message
import typings.awsSdk.clientsSqsMod.^
import typings.events.mod.EventEmitter
import typings.sqsConsumer.sqsConsumerStrings.empty
import typings.sqsConsumer.sqsConsumerStrings.error
import typings.sqsConsumer.sqsConsumerStrings.message_processed
import typings.sqsConsumer.sqsConsumerStrings.message_received
import typings.sqsConsumer.sqsConsumerStrings.processing_error
import typings.sqsConsumer.sqsConsumerStrings.response_processed
import typings.sqsConsumer.sqsConsumerStrings.stopped
import typings.sqsConsumer.sqsConsumerStrings.timeout_error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumerMod {
  
  @JSImport("sqs-consumer/dist/consumer", "Consumer")
  @js.native
  open class Consumer protected () extends EventEmitter {
    def this(options: ConsumerOptions) = this()
    
    /* private */ var attributeNames: Any = js.native
    
    /* private */ var authenticationErrorTimeout: Any = js.native
    
    /* private */ var batchSize: Any = js.native
    
    /* private */ var changeVisabilityTimeoutBatch: Any = js.native
    
    /* private */ var changeVisibilityTimeout: Any = js.native
    
    /* private */ var deleteMessage: Any = js.native
    
    /* private */ var deleteMessageBatch: Any = js.native
    
    /* private */ var emitError: Any = js.native
    
    @JSName("emit")
    def emit_empty(
      event: empty,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_error(
      event: error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Tuple2[js.Error, Unit | SQSMessage | js.Array[SQSMessage]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_messageprocessed(
      event: message_processed,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[SQSMessage]
    ): Boolean = js.native
    @JSName("emit")
    def emit_messagereceived(
      event: message_received,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[SQSMessage]
    ): Boolean = js.native
    @JSName("emit")
    def emit_processingerror(
      event: processing_error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Tuple2[js.Error, SQSMessage]
    ): Boolean = js.native
    @JSName("emit")
    def emit_responseprocessed(
      event: response_processed,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_stopped(
      event: stopped,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_timeouterror(
      event: timeout_error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Tuple2[js.Error, SQSMessage]
    ): Boolean = js.native
    
    /* private */ var executeBatchHandler: Any = js.native
    
    /* private */ var executeHandler: Any = js.native
    
    /* private */ var handleMessage: Any = js.native
    
    /* private */ var handleMessageBatch: Any = js.native
    
    /* private */ var handleMessageTimeout: Any = js.native
    
    /* private */ var handleSqsResponse: Any = js.native
    
    /* private */ var heartbeatInterval: Any = js.native
    
    def isRunning: Boolean = js.native
    
    /* private */ var messageAttributeNames: Any = js.native
    
    @JSName("on")
    def on_empty(event: empty, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_error(
      event: error,
      listener: js.Function1[/* args */ js.Tuple2[js.Error, Unit | SQSMessage | js.Array[SQSMessage]], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_messageprocessed(event: message_processed, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
    @JSName("on")
    def on_messagereceived(event: message_received, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
    @JSName("on")
    def on_processingerror(event: processing_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, SQSMessage], Unit]): this.type = js.native
    @JSName("on")
    def on_responseprocessed(event: response_processed, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_timeouterror(event: timeout_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, SQSMessage], Unit]): this.type = js.native
    
    @JSName("once")
    def once_empty(event: empty, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_error(
      event: error,
      listener: js.Function1[/* args */ js.Tuple2[js.Error, Unit | SQSMessage | js.Array[SQSMessage]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_messageprocessed(event: message_processed, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
    @JSName("once")
    def once_messagereceived(event: message_received, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
    @JSName("once")
    def once_processingerror(event: processing_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, SQSMessage], Unit]): this.type = js.native
    @JSName("once")
    def once_responseprocessed(event: response_processed, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_stopped(event: stopped, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_timeouterror(event: timeout_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, SQSMessage], Unit]): this.type = js.native
    
    /* private */ var poll: Any = js.native
    
    /* private */ var pollingWaitTimeMs: Any = js.native
    
    /* private */ var processMessage: Any = js.native
    
    /* private */ var processMessageBatch: Any = js.native
    
    /* private */ var queueUrl: Any = js.native
    
    /* private */ var receiveMessage: Any = js.native
    
    /* private */ var shouldDeleteMessages: Any = js.native
    
    /* private */ var sqs: Any = js.native
    
    def start(): Unit = js.native
    
    /* private */ var startHeartbeat: Any = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var stopped: Any = js.native
    
    /* private */ var terminateVisibilityTimeout: Any = js.native
    
    /* private */ var visibilityTimeout: Any = js.native
    
    /* private */ var waitTimeSeconds: Any = js.native
  }
  /* static members */
  object Consumer {
    
    @JSImport("sqs-consumer/dist/consumer", "Consumer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ConsumerOptions): Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Consumer]
  }
  
  trait ConsumerOptions extends StObject {
    
    var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var authenticationErrorTimeout: js.UndefOr[Double] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var handleMessage: js.UndefOr[js.Function1[/* message */ SQSMessage, js.Promise[Unit]]] = js.undefined
    
    var handleMessageBatch: js.UndefOr[js.Function1[/* messages */ js.Array[SQSMessage], js.Promise[Unit]]] = js.undefined
    
    var handleMessageTimeout: js.UndefOr[Double] = js.undefined
    
    var heartbeatInterval: js.UndefOr[Double] = js.undefined
    
    var messageAttributeNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var pollingWaitTimeMs: js.UndefOr[Double] = js.undefined
    
    var queueUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var shouldDeleteMessages: js.UndefOr[Boolean] = js.undefined
    
    var sqs: js.UndefOr[^] = js.undefined
    
    var stopped: js.UndefOr[Boolean] = js.undefined
    
    var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined
    
    var visibilityTimeout: js.UndefOr[Double] = js.undefined
    
    var waitTimeSeconds: js.UndefOr[Double] = js.undefined
  }
  object ConsumerOptions {
    
    inline def apply(): ConsumerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsumerOptions]
    }
    
    extension [Self <: ConsumerOptions](x: Self) {
      
      inline def setAttributeNames(value: js.Array[String]): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
      
      inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "attributeNames", js.Array(value*))
      
      inline def setAuthenticationErrorTimeout(value: Double): Self = StObject.set(x, "authenticationErrorTimeout", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationErrorTimeoutUndefined: Self = StObject.set(x, "authenticationErrorTimeout", js.undefined)
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setHandleMessage(value: /* message */ SQSMessage => js.Promise[Unit]): Self = StObject.set(x, "handleMessage", js.Any.fromFunction1(value))
      
      inline def setHandleMessageBatch(value: /* messages */ js.Array[SQSMessage] => js.Promise[Unit]): Self = StObject.set(x, "handleMessageBatch", js.Any.fromFunction1(value))
      
      inline def setHandleMessageBatchUndefined: Self = StObject.set(x, "handleMessageBatch", js.undefined)
      
      inline def setHandleMessageTimeout(value: Double): Self = StObject.set(x, "handleMessageTimeout", value.asInstanceOf[js.Any])
      
      inline def setHandleMessageTimeoutUndefined: Self = StObject.set(x, "handleMessageTimeout", js.undefined)
      
      inline def setHandleMessageUndefined: Self = StObject.set(x, "handleMessage", js.undefined)
      
      inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
      
      inline def setMessageAttributeNames(value: js.Array[String]): Self = StObject.set(x, "messageAttributeNames", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributeNamesUndefined: Self = StObject.set(x, "messageAttributeNames", js.undefined)
      
      inline def setMessageAttributeNamesVarargs(value: String*): Self = StObject.set(x, "messageAttributeNames", js.Array(value*))
      
      inline def setPollingWaitTimeMs(value: Double): Self = StObject.set(x, "pollingWaitTimeMs", value.asInstanceOf[js.Any])
      
      inline def setPollingWaitTimeMsUndefined: Self = StObject.set(x, "pollingWaitTimeMs", js.undefined)
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      inline def setQueueUrlUndefined: Self = StObject.set(x, "queueUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setShouldDeleteMessages(value: Boolean): Self = StObject.set(x, "shouldDeleteMessages", value.asInstanceOf[js.Any])
      
      inline def setShouldDeleteMessagesUndefined: Self = StObject.set(x, "shouldDeleteMessages", js.undefined)
      
      inline def setSqs(value: ^): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      inline def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
      
      inline def setTerminateVisibilityTimeout(value: Boolean): Self = StObject.set(x, "terminateVisibilityTimeout", value.asInstanceOf[js.Any])
      
      inline def setTerminateVisibilityTimeoutUndefined: Self = StObject.set(x, "terminateVisibilityTimeout", js.undefined)
      
      inline def setVisibilityTimeout(value: Double): Self = StObject.set(x, "visibilityTimeout", value.asInstanceOf[js.Any])
      
      inline def setVisibilityTimeoutUndefined: Self = StObject.set(x, "visibilityTimeout", js.undefined)
      
      inline def setWaitTimeSeconds(value: Double): Self = StObject.set(x, "waitTimeSeconds", value.asInstanceOf[js.Any])
      
      inline def setWaitTimeSecondsUndefined: Self = StObject.set(x, "waitTimeSeconds", js.undefined)
    }
  }
  
  trait Events extends StObject {
    
    var empty: js.Array[Any]
    
    var error: js.Tuple2[js.Error, Unit | SQSMessage | js.Array[SQSMessage]]
    
    var message_processed: js.Array[SQSMessage]
    
    var message_received: js.Array[SQSMessage]
    
    var processing_error: js.Tuple2[js.Error, SQSMessage]
    
    var response_processed: js.Array[Any]
    
    var stopped: js.Array[Any]
    
    var timeout_error: js.Tuple2[js.Error, SQSMessage]
  }
  object Events {
    
    inline def apply(
      empty: js.Array[Any],
      error: js.Tuple2[js.Error, Unit | SQSMessage | js.Array[SQSMessage]],
      message_processed: js.Array[SQSMessage],
      message_received: js.Array[SQSMessage],
      processing_error: js.Tuple2[js.Error, SQSMessage],
      response_processed: js.Array[Any],
      stopped: js.Array[Any],
      timeout_error: js.Tuple2[js.Error, SQSMessage]
    ): Events = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message_processed = message_processed.asInstanceOf[js.Any], message_received = message_received.asInstanceOf[js.Any], processing_error = processing_error.asInstanceOf[js.Any], response_processed = response_processed.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], timeout_error = timeout_error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setEmpty(value: js.Array[Any]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyVarargs(value: Any*): Self = StObject.set(x, "empty", js.Array(value*))
      
      inline def setError(value: js.Tuple2[js.Error, Unit | SQSMessage | js.Array[SQSMessage]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage_processed(value: js.Array[SQSMessage]): Self = StObject.set(x, "message_processed", value.asInstanceOf[js.Any])
      
      inline def setMessage_processedVarargs(value: SQSMessage*): Self = StObject.set(x, "message_processed", js.Array(value*))
      
      inline def setMessage_received(value: js.Array[SQSMessage]): Self = StObject.set(x, "message_received", value.asInstanceOf[js.Any])
      
      inline def setMessage_receivedVarargs(value: SQSMessage*): Self = StObject.set(x, "message_received", js.Array(value*))
      
      inline def setProcessing_error(value: js.Tuple2[js.Error, SQSMessage]): Self = StObject.set(x, "processing_error", value.asInstanceOf[js.Any])
      
      inline def setResponse_processed(value: js.Array[Any]): Self = StObject.set(x, "response_processed", value.asInstanceOf[js.Any])
      
      inline def setResponse_processedVarargs(value: Any*): Self = StObject.set(x, "response_processed", js.Array(value*))
      
      inline def setStopped(value: js.Array[Any]): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      inline def setStoppedVarargs(value: Any*): Self = StObject.set(x, "stopped", js.Array(value*))
      
      inline def setTimeout_error(value: js.Tuple2[js.Error, SQSMessage]): Self = StObject.set(x, "timeout_error", value.asInstanceOf[js.Any])
    }
  }
  
  type SQSMessage = Message
}
