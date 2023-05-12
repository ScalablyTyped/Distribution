package typings.sqsConsumer

import typings.sqsConsumer.distTypesMod.ConsumerOptions
import typings.sqsConsumer.distTypesMod.StopOptions
import typings.sqsConsumer.distTypesMod.TypedEventEmitter
import typings.sqsConsumer.distTypesMod.UpdatableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConsumerMod {
  
  @JSImport("sqs-consumer/dist/consumer", "Consumer")
  @js.native
  open class Consumer protected () extends TypedEventEmitter {
    def this(options: ConsumerOptions) = this()
    
    /* private */ var attributeNames: Any = js.native
    
    /* private */ var authenticationErrorTimeout: Any = js.native
    
    /* private */ var batchSize: Any = js.native
    
    /**
      * Change the visibility timeout on a message
      * @param message The message to change the value of
      * @param timeout The new timeout that should be set
      */
    /* private */ var changeVisibilityTimeout: Any = js.native
    
    /**
      * Change the visibility timeout on a batch of messages
      * @param messages The messages to change the value of
      * @param timeout The new timeout that should be set
      */
    /* private */ var changeVisibilityTimeoutBatch: Any = js.native
    
    /**
      * Delete a single message from SQS
      * @param message The message to delete from the SQS queue
      */
    /* private */ var deleteMessage: Any = js.native
    
    /**
      * Delete a batch of messages from the SQS queue.
      * @param messages The messages that should be deleted from SQS
      */
    /* private */ var deleteMessageBatch: Any = js.native
    
    /**
      * Emit one of the consumer's error events depending on the error received.
      * @param err The error object to forward on
      * @param message The message that the error occurred on
      */
    /* private */ var emitError: Any = js.native
    
    /**
      * Execute the application's message batch handler
      * @param messages The messages that should be forwarded from the SQS queue
      */
    /* private */ var executeBatchHandler: Any = js.native
    
    /**
      * Trigger the applications handleMessage function
      * @param message The message that was received from SQS
      */
    /* private */ var executeHandler: Any = js.native
    
    /* private */ var handleMessage: Any = js.native
    
    /* private */ var handleMessageBatch: Any = js.native
    
    /* private */ var handleMessageTimeout: Any = js.native
    
    /**
      * Handles the response from AWS SQS, determining if we should proceed to
      * the message handler.
      * @param response The output from AWS SQS
      */
    /* private */ var handleSqsResponse: Any = js.native
    
    /* private */ var heartbeatInterval: Any = js.native
    
    /**
      * Returns the current polling state of the consumer: `true` if it is actively polling, `false` if it is not.
      */
    def isRunning: Boolean = js.native
    
    /* private */ var messageAttributeNames: Any = js.native
    
    /**
      * Poll for new messages from SQS
      */
    /* private */ var poll: Any = js.native
    
    /* private */ var pollingTimeoutId: Any = js.native
    
    /* private */ var pollingWaitTimeMs: Any = js.native
    
    /**
      * Process a message that has been received from SQS. This will execute the message
      * handler and delete the message once complete.
      * @param message The message that was delivered from SQS
      */
    /* private */ var processMessage: Any = js.native
    
    /**
      * Process a batch of messages from the SQS queue.
      * @param messages The messages that were delivered from SQS
      */
    /* private */ var processMessageBatch: Any = js.native
    
    /* private */ var queueUrl: Any = js.native
    
    /**
      * Send a request to SQS to retrieve messages
      * @param params The required params to receive messages from SQS
      */
    /* private */ var receiveMessage: Any = js.native
    
    /* private */ var shouldDeleteMessages: Any = js.native
    
    /* private */ var sqs: Any = js.native
    
    /**
      * A reusable options object for sqs.send that's used to avoid duplication.
      */
    /* private */ var sqsSendOptions: Any = js.native
    
    /**
      * Start polling the queue for messages.
      */
    def start(): Unit = js.native
    
    /**
      * Trigger a function on a set interval
      * @param heartbeatFn The function that should be triggered
      */
    /* private */ var startHeartbeat: Any = js.native
    
    /**
      * Stop polling the queue for messages (pre existing requests will still be made until concluded).
      */
    def stop(): Unit = js.native
    def stop(options: StopOptions): Unit = js.native
    
    /* private */ var stopped: Any = js.native
    
    /* private */ var terminateVisibilityTimeout: Any = js.native
    
    /**
      * Validates and then updates the provided option to the provided value.
      * @param option The option to validate and then update
      * @param value The value to set the provided option to
      */
    def updateOption(option: UpdatableOptions): Unit = js.native
    def updateOption(option: UpdatableOptions, value: Double): Unit = js.native
    
    /* private */ var visibilityTimeout: Any = js.native
    
    /* private */ var waitTimeSeconds: Any = js.native
  }
  /* static members */
  object Consumer {
    
    @JSImport("sqs-consumer/dist/consumer", "Consumer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SQS consumer.
      */
    inline def create(options: ConsumerOptions): Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Consumer]
  }
}
