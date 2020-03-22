package typings.pulumiAws.eventSourceMappingMod

import typings.pulumiAws.inputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingArgs extends js.Object {
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
  val eventSourceArn: Input[String] = js.native
  /**
    * The name or the ARN of the Lambda function that will be subscribing to events.
    */
  val functionName: Input[String] = js.native
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
}

object EventSourceMappingArgs {
  @scala.inline
  def apply(
    eventSourceArn: Input[String],
    functionName: Input[String],
    batchSize: Input[Double] = null,
    bisectBatchOnFunctionError: Input[Boolean] = null,
    destinationConfig: Input[EventSourceMappingDestinationConfig] = null,
    enabled: Input[Boolean] = null,
    maximumBatchingWindowInSeconds: Input[Double] = null,
    maximumRecordAgeInSeconds: Input[Double] = null,
    maximumRetryAttempts: Input[Double] = null,
    parallelizationFactor: Input[Double] = null,
    startingPosition: Input[String] = null,
    startingPositionTimestamp: Input[String] = null
  ): EventSourceMappingArgs = {
    val __obj = js.Dynamic.literal(eventSourceArn = eventSourceArn.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (bisectBatchOnFunctionError != null) __obj.updateDynamic("bisectBatchOnFunctionError")(bisectBatchOnFunctionError.asInstanceOf[js.Any])
    if (destinationConfig != null) __obj.updateDynamic("destinationConfig")(destinationConfig.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maximumBatchingWindowInSeconds != null) __obj.updateDynamic("maximumBatchingWindowInSeconds")(maximumBatchingWindowInSeconds.asInstanceOf[js.Any])
    if (maximumRecordAgeInSeconds != null) __obj.updateDynamic("maximumRecordAgeInSeconds")(maximumRecordAgeInSeconds.asInstanceOf[js.Any])
    if (maximumRetryAttempts != null) __obj.updateDynamic("maximumRetryAttempts")(maximumRetryAttempts.asInstanceOf[js.Any])
    if (parallelizationFactor != null) __obj.updateDynamic("parallelizationFactor")(parallelizationFactor.asInstanceOf[js.Any])
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    if (startingPositionTimestamp != null) __obj.updateDynamic("startingPositionTimestamp")(startingPositionTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingArgs]
  }
}

