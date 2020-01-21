package typings.sqsConsumer.consumerMod

import typings.events.mod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqs-consumer/dist/consumer", "Consumer")
@js.native
class Consumer protected () extends EventEmitter {
  def this(options: ConsumerOptions) = this()
  var attributeNames: js.Any = js.native
  var authenticationErrorTimeout: js.Any = js.native
  var batchSize: js.Any = js.native
  var deleteMessage: js.Any = js.native
  var deleteMessageBatch: js.Any = js.native
  var emitError: js.Any = js.native
  var executeBatchHandler: js.Any = js.native
  var executeHandler: js.Any = js.native
  var handleMessage: js.Any = js.native
  var handleMessageBatch: js.Any = js.native
  var handleMessageTimeout: js.Any = js.native
  var handleSqsResponse: js.Any = js.native
  val isRunning: Boolean = js.native
  var messageAttributeNames: js.Any = js.native
  var poll: js.Any = js.native
  var pollingWaitTimeMs: js.Any = js.native
  var processMessage: js.Any = js.native
  var processMessageBatch: js.Any = js.native
  var queueUrl: js.Any = js.native
  var receiveMessage: js.Any = js.native
  var sqs: js.Any = js.native
  var stopped: js.Any = js.native
  var terminateVisabilityTimeout: js.Any = js.native
  var terminateVisabilityTimeoutBatch: js.Any = js.native
  var terminateVisibilityTimeout: js.Any = js.native
  var visibilityTimeout: js.Any = js.native
  var waitTimeSeconds: js.Any = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

/* static members */
@JSImport("sqs-consumer/dist/consumer", "Consumer")
@js.native
object Consumer extends js.Object {
  def create(options: ConsumerOptions): Consumer = js.native
}

