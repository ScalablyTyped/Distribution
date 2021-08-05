package typings.pulumiAws

import typings.pulumiAws.anon.KinesisSchemaVersion
import typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiAws.lambdaMod.EventSourceMapping
import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.pulumiAwsStrings.AT_TIMESTAMP
import typings.pulumiAws.pulumiAwsStrings.LATEST
import typings.pulumiAws.pulumiAwsStrings.TRIM_HORIZON
import typings.pulumiAws.pulumiAwsStrings.awsColonkinesis
import typings.pulumiAws.pulumiAwsStrings.awsColonkinesisColonrecord
import typings.pulumiAws.streamMod.Stream
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kinesisMixinsMod {
  
  @JSImport("@pulumi/aws/kinesis/kinesisMixins", "StreamEventSubscription")
  @js.native
  class StreamEventSubscription protected () extends EventSubscription {
    def this(name: String, stream: Stream, handler: StreamEventHandler, args: StreamEventSubscriptionArgs) = this()
    def this(
      name: String,
      stream: Stream,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
    
    val eventSourceMapping: EventSourceMapping = js.native
    
    val stream: Stream = js.native
  }
  
  trait StreamEvent extends StObject {
    
    var Records: js.Array[StreamEventRecord]
  }
  object StreamEvent {
    
    inline def apply(Records: js.Array[StreamEventRecord]): StreamEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamEvent]
    }
    
    extension [Self <: StreamEvent](x: Self) {
      
      inline def setRecords(value: js.Array[StreamEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: StreamEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type StreamEventHandler = EventHandler[StreamEvent, Unit]
  
  trait StreamEventRecord extends StObject {
    
    var awsRegion: String
    
    var eventID: String
    
    var eventName: awsColonkinesisColonrecord
    
    var eventSource: awsColonkinesis
    
    var eventSourceARN: String
    
    var eventVersion: String
    
    var invokeIdentityArn: String
    
    var kinesis: KinesisSchemaVersion
  }
  object StreamEventRecord {
    
    inline def apply(
      awsRegion: String,
      eventID: String,
      eventSourceARN: String,
      eventVersion: String,
      invokeIdentityArn: String,
      kinesis: KinesisSchemaVersion
    ): StreamEventRecord = {
      val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = "aws:kinesis:record", eventSource = "aws:kinesis", eventSourceARN = eventSourceARN.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], invokeIdentityArn = invokeIdentityArn.asInstanceOf[js.Any], kinesis = kinesis.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamEventRecord]
    }
    
    extension [Self <: StreamEventRecord](x: Self) {
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: awsColonkinesisColonrecord): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: awsColonkinesis): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setInvokeIdentityArn(value: String): Self = StObject.set(x, "invokeIdentityArn", value.asInstanceOf[js.Any])
      
      inline def setKinesis(value: KinesisSchemaVersion): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamEventSubscriptionArgs extends StObject {
    
    /**
      * The largest number of records that Lambda will retrieve from your event source at the time of
      * invocation. Defaults to `100` for Kinesis.
      */
    val batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * If the function returns an error, split the batch in two and retry. Defaults to `false`.
      */
    val bisectBatchOnFunctionError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An Amazon SQS queue or Amazon SNS topic destination for failed records.
      */
    val destinationConfig: js.UndefOr[Input[EventSourceMappingDestinationConfig]] = js.undefined
    
    /**
      * The maximum amount of time to gather records before invoking the function, in seconds. Records will continue to buffer
      * until either maximum_batching_window_in_seconds expires or batch_size has been met. Defaults to as soon as records
      * are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
      */
    val maximumBatchingWindowInSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum age of a record that Lambda sends to a function for processing. Minimum of `60`, maximum and default of `604800`
      */
    val maximumRecordAgeInSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of times to retry when the function returns an error. Minimum of `0`, maximum and default of `10000`.
      */
    val maximumRetryAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of batches to process from each shard concurrently. Minimum and default of `1`, maximum of `10`
      */
    val parallelizationFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * The position in the stream where AWS Lambda should start reading. Must be one of either
      * `TRIM_HORIZON`, `LATEST` or `AT_TIMESTAMP`.  If `AT_TIMESTAMP` is provided,
      * [startingPositionTimestamp] must be provided as well.
      */
    val startingPosition: TRIM_HORIZON | LATEST | AT_TIMESTAMP
    
    /**
      * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the
      * data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`.
      * If a record with this exact timestamp does not exist, the next later record is chosen.
      * If the timestamp is older than the current trim horizon, the oldest available record is
      * chosen.
      */
    val startingPositionTimestamp: js.UndefOr[String] = js.undefined
  }
  object StreamEventSubscriptionArgs {
    
    inline def apply(startingPosition: TRIM_HORIZON | LATEST | AT_TIMESTAMP): StreamEventSubscriptionArgs = {
      val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamEventSubscriptionArgs]
    }
    
    extension [Self <: StreamEventSubscriptionArgs](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setBisectBatchOnFunctionError(value: Boolean): Self = StObject.set(x, "bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
      
      inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "bisectBatchOnFunctionError", js.undefined)
      
      inline def setDestinationConfig(value: Input[EventSourceMappingDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      inline def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      inline def setMaximumBatchingWindowInSeconds(value: Double): Self = StObject.set(x, "maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "maximumBatchingWindowInSeconds", js.undefined)
      
      inline def setMaximumRecordAgeInSeconds(value: Double): Self = StObject.set(x, "maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "maximumRecordAgeInSeconds", js.undefined)
      
      inline def setMaximumRetryAttempts(value: Double): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      inline def setParallelizationFactor(value: Double): Self = StObject.set(x, "parallelizationFactor", value.asInstanceOf[js.Any])
      
      inline def setParallelizationFactorUndefined: Self = StObject.set(x, "parallelizationFactor", js.undefined)
      
      inline def setStartingPosition(value: TRIM_HORIZON | LATEST | AT_TIMESTAMP): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
      
      inline def setStartingPositionTimestamp(value: String): Self = StObject.set(x, "startingPositionTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartingPositionTimestampUndefined: Self = StObject.set(x, "startingPositionTimestamp", js.undefined)
    }
  }
  
  /* augmented module */
  object pulumiAwsKinesisStreamAugmentingMod {
    
    @js.native
    trait Stream extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Stream to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): StreamEventSubscription = js.native
      def onEvent(
        name: String,
        handler: StreamEventHandler,
        args: StreamEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): StreamEventSubscription = js.native
    }
  }
}
