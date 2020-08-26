package typings.pulumiAws.eventSourceMappingMod

import typings.pulumiAws.outputMod.lambda.EventSourceMappingDestinationConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("@pulumi/aws/lambda/eventSourceMapping", "EventSourceMapping")
@js.native
object EventSourceMapping extends js.Object {
  /**
    * Get an existing EventSourceMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: EventSourceMappingState): EventSourceMapping = js.native
  def get(name: String, id: Input[ID], state: EventSourceMappingState, opts: CustomResourceOptions): EventSourceMapping = js.native
  /**
    * Returns true if the given object is an instance of EventSourceMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/eventSourceMapping.EventSourceMapping */ Boolean = js.native
}

