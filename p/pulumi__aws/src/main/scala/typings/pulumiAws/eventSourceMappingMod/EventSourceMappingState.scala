package typings.pulumiAws.eventSourceMappingMod

import typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceMappingState extends js.Object {
  
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
    */
  val batchSize: js.UndefOr[Input[Double]] = js.native
  
  val bisectBatchOnFunctionError: js.UndefOr[Input[Boolean]] = js.native
  
  val destinationConfig: js.UndefOr[Input[EventSourceMappingDestinationConfig]] = js.native
  
  /**
    * Determines if the mapping will be enabled on creation. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
    */
  val eventSourceArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `functionName` above.)
    */
  val functionArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name or the ARN of the Lambda function that will be subscribing to events.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The date this resource was last modified.
    */
  val lastModified: js.UndefOr[Input[String]] = js.native
  
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  val lastProcessingResult: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximumBatchingWindowInSeconds` expires or `batchSize` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
    */
  val maximumBatchingWindowInSeconds: js.UndefOr[Input[Double]] = js.native
  
  val maximumRecordAgeInSeconds: js.UndefOr[Input[Double]] = js.native
  
  val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.native
  
  val parallelizationFactor: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
    */
  val startingPosition: js.UndefOr[Input[String]] = js.native
  
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `startingPosition` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
    * * `parallelizationFactor`: - (Optional) The number of batches to process from each shard concurrently. Only available for stream sources (DynamoDB and Kinesis). Minimum and default of 1, maximum of 10.
    * * `maximumRetryAttempts`: - (Optional) The maximum number of times to retry when the function returns an error. Only available for stream sources (DynamoDB and Kinesis). Minimum of 0, maximum and default of 10000.
    * * `maximumRecordAgeInSeconds`: - (Optional) The maximum age of a record that Lambda sends to a function for processing. Only available for stream sources (DynamoDB and Kinesis). Minimum of 60, maximum and default of 604800.
    * * `bisectBatchOnFunctionError`: - (Optional) If the function returns an error, split the batch in two and retry. Only available for stream sources (DynamoDB and Kinesis). Defaults to `false`.
    * * `destinationConfig`: - (Optional) An Amazon SQS queue or Amazon SNS topic destination for failed records. Only available for stream sources (DynamoDB and Kinesis). Detailed below.
    */
  val startingPositionTimestamp: js.UndefOr[Input[String]] = js.native
  
  /**
    * The state of the event source mapping.
    */
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * The reason the event source mapping is in its current state.
    */
  val stateTransitionReason: js.UndefOr[Input[String]] = js.native
  
  /**
    * The UUID of the created event source mapping.
    */
  val uuid: js.UndefOr[Input[String]] = js.native
}
object EventSourceMappingState {
  
  @scala.inline
  def apply(): EventSourceMappingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingState]
  }
  
  @scala.inline
  implicit class EventSourceMappingStateOps[Self <: EventSourceMappingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchSize(value: Input[Double]): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setBisectBatchOnFunctionError(value: Input[Boolean]): Self = this.set("bisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBisectBatchOnFunctionError: Self = this.set("bisectBatchOnFunctionError", js.undefined)
    
    @scala.inline
    def setDestinationConfig(value: Input[EventSourceMappingDestinationConfig]): Self = this.set("destinationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationConfig: Self = this.set("destinationConfig", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Input[String]): Self = this.set("eventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceArn: Self = this.set("eventSourceArn", js.undefined)
    
    @scala.inline
    def setFunctionArn(value: Input[String]): Self = this.set("functionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionArn: Self = this.set("functionArn", js.undefined)
    
    @scala.inline
    def setFunctionName(value: Input[String]): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    
    @scala.inline
    def setLastModified(value: Input[String]): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLastProcessingResult(value: Input[String]): Self = this.set("lastProcessingResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastProcessingResult: Self = this.set("lastProcessingResult", js.undefined)
    
    @scala.inline
    def setMaximumBatchingWindowInSeconds(value: Input[Double]): Self = this.set("maximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBatchingWindowInSeconds: Self = this.set("maximumBatchingWindowInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRecordAgeInSeconds(value: Input[Double]): Self = this.set("maximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRecordAgeInSeconds: Self = this.set("maximumRecordAgeInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: Input[Double]): Self = this.set("maximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("maximumRetryAttempts", js.undefined)
    
    @scala.inline
    def setParallelizationFactor(value: Input[Double]): Self = this.set("parallelizationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelizationFactor: Self = this.set("parallelizationFactor", js.undefined)
    
    @scala.inline
    def setStartingPosition(value: Input[String]): Self = this.set("startingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingPosition: Self = this.set("startingPosition", js.undefined)
    
    @scala.inline
    def setStartingPositionTimestamp(value: Input[String]): Self = this.set("startingPositionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingPositionTimestamp: Self = this.set("startingPositionTimestamp", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateTransitionReason(value: Input[String]): Self = this.set("stateTransitionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateTransitionReason: Self = this.set("stateTransitionReason", js.undefined)
    
    @scala.inline
    def setUuid(value: Input[String]): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
