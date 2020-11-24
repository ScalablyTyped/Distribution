package typings.sqsConsumer.consumerMod

import typings.events.mod.EventEmitter
import typings.sqsConsumer.sqsConsumerStrings.empty
import typings.sqsConsumer.sqsConsumerStrings.error
import typings.sqsConsumer.sqsConsumerStrings.message_processed
import typings.sqsConsumer.sqsConsumerStrings.message_received
import typings.sqsConsumer.sqsConsumerStrings.processing_error
import typings.sqsConsumer.sqsConsumerStrings.response_processed
import typings.sqsConsumer.sqsConsumerStrings.stopped
import typings.sqsConsumer.sqsConsumerStrings.timeout_error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sqs-consumer/dist/consumer", "Consumer")
@js.native
class Consumer protected () extends EventEmitter {
  def this(options: ConsumerOptions) = this()
  
  var attributeNames: js.Any = js.native
  
  var authenticationErrorTimeout: js.Any = js.native
  
  var batchSize: js.Any = js.native
  
  var changeVisabilityTimeout: js.Any = js.native
  
  var changeVisabilityTimeoutBatch: js.Any = js.native
  
  var deleteMessage: js.Any = js.native
  
  var deleteMessageBatch: js.Any = js.native
  
  var emitError: js.Any = js.native
  
  @JSName("emit")
  def emit_empty(
    event: empty,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[js.Any]
  ): Boolean = js.native
  @JSName("emit")
  def emit_error(
    event: error,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Tuple2[Error, Unit | SQSMessage | js.Array[SQSMessage]]
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
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Tuple2[Error, SQSMessage]
  ): Boolean = js.native
  @JSName("emit")
  def emit_responseprocessed(
    event: response_processed,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[js.Any]
  ): Boolean = js.native
  @JSName("emit")
  def emit_stopped(
    event: stopped,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Array[js.Any]
  ): Boolean = js.native
  @JSName("emit")
  def emit_timeouterror(
    event: timeout_error,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Events[T] is not an array type */ args: js.Tuple2[Error, SQSMessage]
  ): Boolean = js.native
  
  var executeBatchHandler: js.Any = js.native
  
  var executeHandler: js.Any = js.native
  
  var handleMessage: js.Any = js.native
  
  var handleMessageBatch: js.Any = js.native
  
  var handleMessageTimeout: js.Any = js.native
  
  var handleSqsResponse: js.Any = js.native
  
  var heartbeatInterval: js.Any = js.native
  
  def isRunning: Boolean = js.native
  
  var messageAttributeNames: js.Any = js.native
  
  @JSName("on")
  def on_empty(event: empty, listener: js.Function1[/* args */ js.Array[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: error,
    listener: js.Function1[/* args */ js.Tuple2[Error, Unit | SQSMessage | js.Array[SQSMessage]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_messageprocessed(event: message_processed, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
  @JSName("on")
  def on_messagereceived(event: message_received, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
  @JSName("on")
  def on_processingerror(event: processing_error, listener: js.Function1[/* args */ js.Tuple2[Error, SQSMessage], Unit]): this.type = js.native
  @JSName("on")
  def on_responseprocessed(event: response_processed, listener: js.Function1[/* args */ js.Array[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_stopped(event: stopped, listener: js.Function1[/* args */ js.Array[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_timeouterror(event: timeout_error, listener: js.Function1[/* args */ js.Tuple2[Error, SQSMessage], Unit]): this.type = js.native
  
  @JSName("once")
  def once_empty(event: empty, listener: js.Function1[/* args */ js.Array[js.Any], Unit]): this.type = js.native
  @JSName("once")
  def once_error(
    event: error,
    listener: js.Function1[/* args */ js.Tuple2[Error, Unit | SQSMessage | js.Array[SQSMessage]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_messageprocessed(event: message_processed, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
  @JSName("once")
  def once_messagereceived(event: message_received, listener: js.Function1[/* args */ js.Array[SQSMessage], Unit]): this.type = js.native
  @JSName("once")
  def once_processingerror(event: processing_error, listener: js.Function1[/* args */ js.Tuple2[Error, SQSMessage], Unit]): this.type = js.native
  @JSName("once")
  def once_responseprocessed(event: response_processed, listener: js.Function1[/* args */ js.Array[js.Any], Unit]): this.type = js.native
  @JSName("once")
  def once_stopped(event: stopped, listener: js.Function1[/* args */ js.Array[js.Any], Unit]): this.type = js.native
  @JSName("once")
  def once_timeouterror(event: timeout_error, listener: js.Function1[/* args */ js.Tuple2[Error, SQSMessage], Unit]): this.type = js.native
  
  var poll: js.Any = js.native
  
  var pollingWaitTimeMs: js.Any = js.native
  
  var processMessage: js.Any = js.native
  
  var processMessageBatch: js.Any = js.native
  
  var queueUrl: js.Any = js.native
  
  var receiveMessage: js.Any = js.native
  
  var sqs: js.Any = js.native
  
  def start(): Unit = js.native
  
  var startHeartbeat: js.Any = js.native
  
  def stop(): Unit = js.native
  
  var stopped: js.Any = js.native
  
  var terminateVisibilityTimeout: js.Any = js.native
  
  var visibilityTimeout: js.Any = js.native
  
  var waitTimeSeconds: js.Any = js.native
}
/* static members */
@JSImport("sqs-consumer/dist/consumer", "Consumer")
@js.native
object Consumer extends js.Object {
  
  def create(options: ConsumerOptions): Consumer = js.native
}
