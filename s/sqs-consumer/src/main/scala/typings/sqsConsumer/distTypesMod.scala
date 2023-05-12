package typings.sqsConsumer

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.Message
import typings.awsSdkClientSqs.mod.SQSClient
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.sqsConsumer.anon.Attempts
import typings.sqsConsumer.anon.Throttling
import typings.sqsConsumer.sqsConsumerStrings.aborted
import typings.sqsConsumer.sqsConsumerStrings.client
import typings.sqsConsumer.sqsConsumerStrings.empty
import typings.sqsConsumer.sqsConsumerStrings.error
import typings.sqsConsumer.sqsConsumerStrings.message_processed
import typings.sqsConsumer.sqsConsumerStrings.message_received
import typings.sqsConsumer.sqsConsumerStrings.option_updated
import typings.sqsConsumer.sqsConsumerStrings.processing_error
import typings.sqsConsumer.sqsConsumerStrings.response_processed
import typings.sqsConsumer.sqsConsumerStrings.server
import typings.sqsConsumer.sqsConsumerStrings.started
import typings.sqsConsumer.sqsConsumerStrings.stopped
import typings.sqsConsumer.sqsConsumerStrings.timeout_error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("sqs-consumer/dist/types", "TypedEventEmitter")
  @js.native
  open class TypedEventEmitter () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("emit")
    def emit_aborted(
      event: aborted,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_empty(
      event: empty,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_error(
      event: error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Tuple2[js.Error, Unit | Message | js.Array[Message]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_messageprocessed(
      event: message_processed,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Message]
    ): Boolean = js.native
    @JSName("emit")
    def emit_messagereceived(
      event: message_received,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Message]
    ): Boolean = js.native
    @JSName("emit")
    def emit_optionupdated(
      event: option_updated,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Tuple2[UpdatableOptions, js.UndefOr[Double]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_processingerror(
      event: processing_error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Tuple2[js.Error, Message]
    ): Boolean = js.native
    /**
      * Emits an event with the provided arguments
      * @param event The name of the event to emit
      */
    @JSName("emit")
    def emit_responseprocessed(
      event: response_processed,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_started(
      event: started,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_stopped(
      event: stopped,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_timeouterror(
      event: timeout_error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[E] is not an array type */ args: js.Tuple2[js.Error, Message]
    ): Boolean = js.native
    
    @JSName("on")
    def on_aborted(event: aborted, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_empty(event: empty, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_error(
      event: error,
      listener: js.Function1[/* args */ js.Tuple2[js.Error, Unit | Message | js.Array[Message]], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_messageprocessed(event: message_processed, listener: js.Function1[/* args */ js.Array[Message], Unit]): this.type = js.native
    @JSName("on")
    def on_messagereceived(event: message_received, listener: js.Function1[/* args */ js.Array[Message], Unit]): this.type = js.native
    @JSName("on")
    def on_optionupdated(
      event: option_updated,
      listener: js.Function1[/* args */ js.Tuple2[UpdatableOptions, js.UndefOr[Double]], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_processingerror(event: processing_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, Message], Unit]): this.type = js.native
    /**
      * Trigger a listener on all emitted events
      * @param event The name of the event to listen to
      * @param listener A function to trigger when the event is emitted
      */
    @JSName("on")
    def on_responseprocessed(event: response_processed, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_started(event: started, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_timeouterror(event: timeout_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, Message], Unit]): this.type = js.native
    
    @JSName("once")
    def once_aborted(event: aborted, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_empty(event: empty, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_error(
      event: error,
      listener: js.Function1[/* args */ js.Tuple2[js.Error, Unit | Message | js.Array[Message]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_messageprocessed(event: message_processed, listener: js.Function1[/* args */ js.Array[Message], Unit]): this.type = js.native
    @JSName("once")
    def once_messagereceived(event: message_received, listener: js.Function1[/* args */ js.Array[Message], Unit]): this.type = js.native
    @JSName("once")
    def once_optionupdated(
      event: option_updated,
      listener: js.Function1[/* args */ js.Tuple2[UpdatableOptions, js.UndefOr[Double]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_processingerror(event: processing_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, Message], Unit]): this.type = js.native
    /**
      * Trigger a listener only once for an emitted event
      * @param event The name of the event to listen to
      * @param listener A function to trigger when the event is emitted
      */
    @JSName("once")
    def once_responseprocessed(event: response_processed, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_started(event: started, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_stopped(event: stopped, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_timeouterror(event: timeout_error, listener: js.Function1[/* args */ js.Tuple2[js.Error, Message], Unit]): this.type = js.native
  }
  
  trait AWSError extends StObject {
    
    /**
      * Whether the client or server are at fault.
      */
    @JSName("$fault")
    val $fault: js.UndefOr[client | server] = js.undefined
    
    @JSName("$metadata")
    var $metadata: js.UndefOr[Attempts] = js.undefined
    
    /**
      * Indicates that an error MAY be retried by the client.
      */
    @JSName("$retryable")
    val $retryable: js.UndefOr[Throttling] = js.undefined
    
    /**
      * The service that encountered the exception.
      */
    @JSName("$service")
    val $service: js.UndefOr[String] = js.undefined
    
    /**
      * Human-readable error response message
      */
    var message: String
    
    /**
      * Name, eg. ConditionalCheckFailedException
      */
    var name: String
    
    /**
      * Non-standard stacktrace
      */
    var stack: js.UndefOr[String] = js.undefined
  }
  object AWSError {
    
    inline def apply(message: String, name: String): AWSError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AWSError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AWSError] (val x: Self) extends AnyVal {
      
      inline def set$fault(value: client | server): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
      
      inline def set$faultUndefined: Self = StObject.set(x, "$fault", js.undefined)
      
      inline def set$metadata(value: Attempts): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def set$metadataUndefined: Self = StObject.set(x, "$metadata", js.undefined)
      
      inline def set$retryable(value: Throttling): Self = StObject.set(x, "$retryable", value.asInstanceOf[js.Any])
      
      inline def set$retryableUndefined: Self = StObject.set(x, "$retryable", js.undefined)
      
      inline def set$service(value: String): Self = StObject.set(x, "$service", value.asInstanceOf[js.Any])
      
      inline def set$serviceUndefined: Self = StObject.set(x, "$service", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  trait ConsumerOptions extends StObject {
    
    /**
      * List of queue attributes to retrieve (i.e.
      * `['All', 'ApproximateFirstReceiveTimestamp', 'ApproximateReceiveCount']`).
      * @defaultvalue `[]`
      */
    var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The duration (in milliseconds) to wait before retrying after an authentication error.
      * @defaultvalue `10000`
      */
    var authenticationErrorTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of messages to request from SQS when polling (default `1`).
      *
      * This cannot be higher than the
      * [AWS limit of 10](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html).
      * @defaultvalue `1`
      */
    var batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * An `async` function (or function that returns a `Promise`) to be called whenever
      * a message is received.
      *
      * In the case that you need to acknowledge the message, return an object containing
      * the MessageId that you'd like to acknowledge.
      */
    var handleMessage: js.UndefOr[js.Function1[/* message */ Message, js.Promise[Message | Unit]]] = js.undefined
    
    /**
      * An `async` function (or function that returns a `Promise`) to be called whenever
      * a batch of messages is received. Similar to `handleMessage` but will receive the
      * list of messages, not each message individually.
      *
      * **If both are set, `handleMessageBatch` overrides `handleMessage`**.
      *
      * In the case that you need to ack only some of the messages, return an array with
      * the successful messages only.
      */
    var handleMessageBatch: js.UndefOr[
        js.Function1[/* messages */ js.Array[Message], js.Promise[js.Array[Message] | Unit]]
      ] = js.undefined
    
    /**
      * Time in ms to wait for `handleMessage` to process a message before timing out.
      *
      * Emits `timeout_error` on timeout. By default, if `handleMessage` times out,
      * the unprocessed message returns to the end of the queue.
      */
    var handleMessageTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The interval (in seconds) between requests to extend the message visibility timeout.
      *
      * On each heartbeat the visibility is extended by adding `visibilityTimeout` to
      * the number of seconds since the start of the handler function.
      *
      * This value must less than `visibilityTimeout`.
      */
    var heartbeatInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * List of message attributes to retrieve (i.e. `['name', 'address']`).
      * @defaultvalue `[]`
      */
    var messageAttributeNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The duration (in milliseconds) to wait before repolling the queue.
      * @defaultvalue `0`
      */
    var pollingWaitTimeMs: js.UndefOr[Double] = js.undefined
    
    /**
      * The SQS queue URL.
      */
    var queueUrl: String
    
    /**
      * The AWS region.
      * @defaultValue process.env.AWS_REGION || `eu-west-1`
      */
    var region: js.UndefOr[String] = js.undefined
    
    /**
      * Default to `true`, if you don't want the package to delete messages from sqs
      * set this to `false`.
      * @defaultvalue `true`
      */
    var shouldDeleteMessages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional [SQS Client](https://docs.aws.amazon.com/AWSJavaScriptSDK/v3/latest/clients/client-sqs/classes/sqsclient.html)
      * object to use if you need to configure the client manually.
      */
    var sqs: js.UndefOr[SQSClient] = js.undefined
    
    /** @hidden */
    var stopped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, sets the message visibility timeout to 0 after a `processing_error`.
      * @defaultvalue `false`
      */
    var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The duration (in seconds) that the received messages are hidden from subsequent
      * retrieve requests after being retrieved by a ReceiveMessage request.
      */
    var visibilityTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The duration (in seconds) for which the call will wait for a message to arrive in
      * the queue before returning.
      * @defaultvalue `20`
      */
    var waitTimeSeconds: js.UndefOr[Double] = js.undefined
  }
  object ConsumerOptions {
    
    inline def apply(queueUrl: String): ConsumerOptions = {
      val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsumerOptions] (val x: Self) extends AnyVal {
      
      inline def setAttributeNames(value: js.Array[String]): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      inline def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
      
      inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "attributeNames", js.Array(value*))
      
      inline def setAuthenticationErrorTimeout(value: Double): Self = StObject.set(x, "authenticationErrorTimeout", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationErrorTimeoutUndefined: Self = StObject.set(x, "authenticationErrorTimeout", js.undefined)
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setHandleMessage(value: /* message */ Message => js.Promise[Message | Unit]): Self = StObject.set(x, "handleMessage", js.Any.fromFunction1(value))
      
      inline def setHandleMessageBatch(value: /* messages */ js.Array[Message] => js.Promise[js.Array[Message] | Unit]): Self = StObject.set(x, "handleMessageBatch", js.Any.fromFunction1(value))
      
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
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setShouldDeleteMessages(value: Boolean): Self = StObject.set(x, "shouldDeleteMessages", value.asInstanceOf[js.Any])
      
      inline def setShouldDeleteMessagesUndefined: Self = StObject.set(x, "shouldDeleteMessages", js.undefined)
      
      inline def setSqs(value: SQSClient): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
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
    
    /**
      * Fired when requests to SQS were aborted.
      */
    var aborted: js.Array[Any]
    
    /**
      * Fired when the queue is empty (All messages have been consumed).
      */
    var empty: js.Array[Any]
    
    /**
      * Fired when an error occurs interacting with the queue.
      *
      * If the error correlates to a message, that message is included in Params
      */
    var error: js.Tuple2[js.Error, Unit | Message | js.Array[Message]]
    
    /**
      * Fired when a message is successfully processed and removed from the queue.
      */
    var message_processed: js.Array[Message]
    
    /**
      * Fired when a message is received.
      */
    var message_received: js.Array[Message]
    
    /**
      * Fired when an option is updated
      */
    var option_updated: js.Tuple2[UpdatableOptions, js.UndefOr[Double]]
    
    /**
      * Fired when an error occurs processing the message.
      */
    var processing_error: js.Tuple2[js.Error, Message]
    
    /**
      * Fired after one batch of items (up to `batchSize`) has been successfully processed.
      */
    var response_processed: js.Array[Any]
    
    /**
      * Fired when the consumer starts its work..
      */
    var started: js.Array[Any]
    
    /**
      * Fired when the consumer finally stops its work.
      */
    var stopped: js.Array[Any]
    
    /**
      * Fired when `handleMessageTimeout` is supplied as an option and if
      * `handleMessage` times out.
      */
    var timeout_error: js.Tuple2[js.Error, Message]
  }
  object Events {
    
    inline def apply(
      aborted: js.Array[Any],
      empty: js.Array[Any],
      error: js.Tuple2[js.Error, Unit | Message | js.Array[Message]],
      message_processed: js.Array[Message],
      message_received: js.Array[Message],
      option_updated: js.Tuple2[UpdatableOptions, js.UndefOr[Double]],
      processing_error: js.Tuple2[js.Error, Message],
      response_processed: js.Array[Any],
      started: js.Array[Any],
      stopped: js.Array[Any],
      timeout_error: js.Tuple2[js.Error, Message]
    ): Events = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message_processed = message_processed.asInstanceOf[js.Any], message_received = message_received.asInstanceOf[js.Any], option_updated = option_updated.asInstanceOf[js.Any], processing_error = processing_error.asInstanceOf[js.Any], response_processed = response_processed.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], timeout_error = timeout_error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      inline def setAborted(value: js.Array[Any]): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAbortedVarargs(value: Any*): Self = StObject.set(x, "aborted", js.Array(value*))
      
      inline def setEmpty(value: js.Array[Any]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyVarargs(value: Any*): Self = StObject.set(x, "empty", js.Array(value*))
      
      inline def setError(value: js.Tuple2[js.Error, Unit | Message | js.Array[Message]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage_processed(value: js.Array[Message]): Self = StObject.set(x, "message_processed", value.asInstanceOf[js.Any])
      
      inline def setMessage_processedVarargs(value: Message*): Self = StObject.set(x, "message_processed", js.Array(value*))
      
      inline def setMessage_received(value: js.Array[Message]): Self = StObject.set(x, "message_received", value.asInstanceOf[js.Any])
      
      inline def setMessage_receivedVarargs(value: Message*): Self = StObject.set(x, "message_received", js.Array(value*))
      
      inline def setOption_updated(value: js.Tuple2[UpdatableOptions, js.UndefOr[Double]]): Self = StObject.set(x, "option_updated", value.asInstanceOf[js.Any])
      
      inline def setProcessing_error(value: js.Tuple2[js.Error, Message]): Self = StObject.set(x, "processing_error", value.asInstanceOf[js.Any])
      
      inline def setResponse_processed(value: js.Array[Any]): Self = StObject.set(x, "response_processed", value.asInstanceOf[js.Any])
      
      inline def setResponse_processedVarargs(value: Any*): Self = StObject.set(x, "response_processed", js.Array(value*))
      
      inline def setStarted(value: js.Array[Any]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStartedVarargs(value: Any*): Self = StObject.set(x, "started", js.Array(value*))
      
      inline def setStopped(value: js.Array[Any]): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      inline def setStoppedVarargs(value: Any*): Self = StObject.set(x, "stopped", js.Array(value*))
      
      inline def setTimeout_error(value: js.Tuple2[js.Error, Message]): Self = StObject.set(x, "timeout_error", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopOptions extends StObject {
    
    /**
      * Default to `false`, if you want the stop action to also abort requests to SQS
      * set this to `true`.
      * @defaultvalue `false`
      */
    var abort: js.UndefOr[Boolean] = js.undefined
  }
  object StopOptions {
    
    inline def apply(): StopOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StopOptions] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: Boolean): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sqsConsumer.sqsConsumerStrings.visibilityTimeout
    - typings.sqsConsumer.sqsConsumerStrings.batchSize
    - typings.sqsConsumer.sqsConsumerStrings.waitTimeSeconds
  */
  trait UpdatableOptions extends StObject
  object UpdatableOptions {
    
    inline def batchSize: typings.sqsConsumer.sqsConsumerStrings.batchSize = "batchSize".asInstanceOf[typings.sqsConsumer.sqsConsumerStrings.batchSize]
    
    inline def visibilityTimeout: typings.sqsConsumer.sqsConsumerStrings.visibilityTimeout = "visibilityTimeout".asInstanceOf[typings.sqsConsumer.sqsConsumerStrings.visibilityTimeout]
    
    inline def waitTimeSeconds: typings.sqsConsumer.sqsConsumerStrings.waitTimeSeconds = "waitTimeSeconds".asInstanceOf[typings.sqsConsumer.sqsConsumerStrings.waitTimeSeconds]
  }
}
