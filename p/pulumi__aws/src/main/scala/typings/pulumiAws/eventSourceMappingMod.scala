package typings.pulumiAws

import typings.pulumiAws.outputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventSourceMappingMod {
  
  @JSImport("@pulumi/aws/lambda/eventSourceMapping", "EventSourceMapping")
  @js.native
  class EventSourceMapping protected () extends CustomResource {
    /**
      * Create a EventSourceMapping resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventSourceMappingArgs) = this()
    def this(name: String, args: EventSourceMappingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
      */
    val batchSize: Output_[js.UndefOr[Double]] = js.native
    
    val bisectBatchOnFunctionError: Output_[js.UndefOr[Boolean]] = js.native
    
    val destinationConfig: Output_[js.UndefOr[EventSourceMappingDestinationConfig]] = js.native
    
    /**
      * Determines if the mapping will be enabled on creation. Defaults to `true`.
      */
    val enabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
      */
    val eventSourceArn: Output_[String] = js.native
    
    /**
      * The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `functionName` above.)
      */
    val functionArn: Output_[String] = js.native
    
    /**
      * The name or the ARN of the Lambda function that will be subscribing to events.
      */
    val functionName: Output_[String] = js.native
    
    /**
      * The date this resource was last modified.
      */
    val lastModified: Output_[String] = js.native
    
    /**
      * The result of the last AWS Lambda invocation of your Lambda function.
      */
    val lastProcessingResult: Output_[String] = js.native
    
    /**
      * The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximumBatchingWindowInSeconds` expires or `batchSize` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
      */
    val maximumBatchingWindowInSeconds: Output_[js.UndefOr[Double]] = js.native
    
    val maximumRecordAgeInSeconds: Output_[Double] = js.native
    
    val maximumRetryAttempts: Output_[Double] = js.native
    
    val parallelizationFactor: Output_[Double] = js.native
    
    /**
      * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
      */
    val startingPosition: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `startingPosition` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
      * * `parallelizationFactor`: - (Optional) The number of batches to process from each shard concurrently. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of 1, maximum of 10.
      * * `maximumRetryAttempts`: - (Optional) The maximum number of times to retry when the function returns an error. Only available for stream sources (DynamoDB and Kinesis). Minimum of 0, maximum and default of 10000.
      * * `maximumRecordAgeInSeconds`: - (Optional) The maximum age of a record that Lambda sends to a function for processing. Only available for stream sources (DynamoDB and Kinesis). Minimum of 60, maximum and default of 604800.
      * * `bisectBatchOnFunctionError`: - (Optional) If the function returns an error, split the batch in two and retry. Only available for stream sources (DynamoDB and Kinesis). Defaults to `false`.
      * * `destinationConfig`: - (Optional) An Amazon SQS queue or Amazon SNS topic destination for failed records. Only available for stream sources (DynamoDB and Kinesis). Detailed below.
      */
    val startingPositionTimestamp: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The state of the event source mapping.
      */
    val state: Output_[String] = js.native
    
    /**
      * The reason the event source mapping is in its current state.
      */
    val stateTransitionReason: Output_[String] = js.native
    
    /**
      * The UUID of the created event source mapping.
      */
    val uuid: Output_[String] = js.native
  }
  /* static members */
  object EventSourceMapping {
    
    @JSImport("@pulumi/aws/lambda/eventSourceMapping", "EventSourceMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EventSourceMapping]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventSourceMapping]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventSourceMappingState): EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EventSourceMapping]
    @scala.inline
    def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): EventSourceMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventSourceMapping]
    
    /**
      * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean]
  }
  
  trait EventSourceMappingArgs extends StObject {
    
    /**
      * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
      */
    val batchSize: js.UndefOr[Input[Double]] = js.undefined
    
    val bisectBatchOnFunctionError: js.UndefOr[Input[Boolean]] = js.undefined
    
    val destinationConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig]] = js.undefined
    
    /**
      * Determines if the mapping will be enabled on creation. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
      */
    val eventSourceArn: Input[String]
    
    /**
      * The name or the ARN of the Lambda function that will be subscribing to events.
      */
    val functionName: Input[String]
    
    /**
      * The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximumBatchingWindowInSeconds` expires or `batchSize` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
      */
    val maximumBatchingWindowInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    val maximumRecordAgeInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.undefined
    
    val parallelizationFactor: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
      */
    val startingPosition: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `startingPosition` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
      * * `parallelizationFactor`: - (Optional) The number of batches to process from each shard concurrently. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of 1, maximum of 10.
      * * `maximumRetryAttempts`: - (Optional) The maximum number of times to retry when the function returns an error. Only available for stream sources (DynamoDB and Kinesis). Minimum of 0, maximum and default of 10000.
      * * `maximumRecordAgeInSeconds`: - (Optional) The maximum age of a record that Lambda sends to a function for processing. Only available for stream sources (DynamoDB and Kinesis). Minimum of 60, maximum and default of 604800.
      * * `bisectBatchOnFunctionError`: - (Optional) If the function returns an error, split the batch in two and retry. Only available for stream sources (DynamoDB and Kinesis). Defaults to `false`.
      * * `destinationConfig`: - (Optional) An Amazon SQS queue or Amazon SNS topic destination for failed records. Only available for stream sources (DynamoDB and Kinesis). Detailed below.
      */
    val startingPositionTimestamp: js.UndefOr[Input[String]] = js.undefined
  }
  object EventSourceMappingArgs {
    
    @scala.inline
    def apply(eventSourceArn: Input[String], functionName: Input[String]): EventSourceMappingArgs = {
      val __obj = js.Dynamic.literal(eventSourceArn = eventSourceArn.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSourceMappingArgs]
    }
    
    @scala.inline
    implicit class EventSourceMappingArgsMutableBuilder[Self <: EventSourceMappingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Input[Double]): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBisectBatchOnFunctionError(value: Input[Boolean]): Self = StObject.set(x, "bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "bisectBatchOnFunctionError", js.undefined)
      
      @scala.inline
      def setDestinationConfig(value: Input[typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEventSourceArn(value: Input[String]): Self = StObject.set(x, "eventSourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumBatchingWindowInSeconds(value: Input[Double]): Self = StObject.set(x, "maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "maximumBatchingWindowInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRecordAgeInSeconds(value: Input[Double]): Self = StObject.set(x, "maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "maximumRecordAgeInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRetryAttempts(value: Input[Double]): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      @scala.inline
      def setParallelizationFactor(value: Input[Double]): Self = StObject.set(x, "parallelizationFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelizationFactorUndefined: Self = StObject.set(x, "parallelizationFactor", js.undefined)
      
      @scala.inline
      def setStartingPosition(value: Input[String]): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingPositionTimestamp(value: Input[String]): Self = StObject.set(x, "startingPositionTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingPositionTimestampUndefined: Self = StObject.set(x, "startingPositionTimestamp", js.undefined)
      
      @scala.inline
      def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
    }
  }
  
  trait EventSourceMappingState extends StObject {
    
    /**
      * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
      */
    val batchSize: js.UndefOr[Input[Double]] = js.undefined
    
    val bisectBatchOnFunctionError: js.UndefOr[Input[Boolean]] = js.undefined
    
    val destinationConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig]] = js.undefined
    
    /**
      * Determines if the mapping will be enabled on creation. Defaults to `true`.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
      */
    val eventSourceArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `functionName` above.)
      */
    val functionArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name or the ARN of the Lambda function that will be subscribing to events.
      */
    val functionName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The date this resource was last modified.
      */
    val lastModified: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The result of the last AWS Lambda invocation of your Lambda function.
      */
    val lastProcessingResult: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximumBatchingWindowInSeconds` expires or `batchSize` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
      */
    val maximumBatchingWindowInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    val maximumRecordAgeInSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.undefined
    
    val parallelizationFactor: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
      */
    val startingPosition: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `startingPosition` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
      * * `parallelizationFactor`: - (Optional) The number of batches to process from each shard concurrently. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of 1, maximum of 10.
      * * `maximumRetryAttempts`: - (Optional) The maximum number of times to retry when the function returns an error. Only available for stream sources (DynamoDB and Kinesis). Minimum of 0, maximum and default of 10000.
      * * `maximumRecordAgeInSeconds`: - (Optional) The maximum age of a record that Lambda sends to a function for processing. Only available for stream sources (DynamoDB and Kinesis). Minimum of 60, maximum and default of 604800.
      * * `bisectBatchOnFunctionError`: - (Optional) If the function returns an error, split the batch in two and retry. Only available for stream sources (DynamoDB and Kinesis). Defaults to `false`.
      * * `destinationConfig`: - (Optional) An Amazon SQS queue or Amazon SNS topic destination for failed records. Only available for stream sources (DynamoDB and Kinesis). Detailed below.
      */
    val startingPositionTimestamp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The state of the event source mapping.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The reason the event source mapping is in its current state.
      */
    val stateTransitionReason: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The UUID of the created event source mapping.
      */
    val uuid: js.UndefOr[Input[String]] = js.undefined
  }
  object EventSourceMappingState {
    
    @scala.inline
    def apply(): EventSourceMappingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSourceMappingState]
    }
    
    @scala.inline
    implicit class EventSourceMappingStateMutableBuilder[Self <: EventSourceMappingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Input[Double]): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBisectBatchOnFunctionError(value: Input[Boolean]): Self = StObject.set(x, "bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "bisectBatchOnFunctionError", js.undefined)
      
      @scala.inline
      def setDestinationConfig(value: Input[typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig]): Self = StObject.set(x, "destinationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationConfigUndefined: Self = StObject.set(x, "destinationConfig", js.undefined)
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setEventSourceArn(value: Input[String]): Self = StObject.set(x, "eventSourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceArnUndefined: Self = StObject.set(x, "eventSourceArn", js.undefined)
      
      @scala.inline
      def setFunctionArn(value: Input[String]): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionArnUndefined: Self = StObject.set(x, "functionArn", js.undefined)
      
      @scala.inline
      def setFunctionName(value: Input[String]): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setLastModified(value: Input[String]): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      @scala.inline
      def setLastProcessingResult(value: Input[String]): Self = StObject.set(x, "lastProcessingResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastProcessingResultUndefined: Self = StObject.set(x, "lastProcessingResult", js.undefined)
      
      @scala.inline
      def setMaximumBatchingWindowInSeconds(value: Input[Double]): Self = StObject.set(x, "maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "maximumBatchingWindowInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRecordAgeInSeconds(value: Input[Double]): Self = StObject.set(x, "maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "maximumRecordAgeInSeconds", js.undefined)
      
      @scala.inline
      def setMaximumRetryAttempts(value: Input[Double]): Self = StObject.set(x, "maximumRetryAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "maximumRetryAttempts", js.undefined)
      
      @scala.inline
      def setParallelizationFactor(value: Input[Double]): Self = StObject.set(x, "parallelizationFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelizationFactorUndefined: Self = StObject.set(x, "parallelizationFactor", js.undefined)
      
      @scala.inline
      def setStartingPosition(value: Input[String]): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingPositionTimestamp(value: Input[String]): Self = StObject.set(x, "startingPositionTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingPositionTimestampUndefined: Self = StObject.set(x, "startingPositionTimestamp", js.undefined)
      
      @scala.inline
      def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateTransitionReason(value: Input[String]): Self = StObject.set(x, "stateTransitionReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateTransitionReasonUndefined: Self = StObject.set(x, "stateTransitionReason", js.undefined)
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setUuid(value: Input[String]): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
