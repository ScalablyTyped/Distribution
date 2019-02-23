package typings
package atPulumiAwsLib.lambdaEventSourceMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/eventSourceMapping", "EventSourceMapping")
@js.native
class EventSourceMapping protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a EventSourceMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EventSourceMappingArgs) = this()
  def this(name: java.lang.String, args: EventSourceMappingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
    */
  val batchSize: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Determines if the mapping will be enabled on creation. Defaults to `true`.
    */
  val enabled: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The event source ARN - can either be a Kinesis or DynamoDB stream.
    */
  val eventSourceArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `function_name` above.)
    */
  val functionArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name or the ARN of the Lambda function that will be subscribing to events.
    */
  val functionName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  val lastProcessingResult: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
    */
  val startingPosition: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
    */
  val startingPositionTimestamp: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The state of the event source mapping.
    */
  val state: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The reason the event source mapping is in its current state.
    */
  val stateTransitionReason: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The UUID of the created event source mapping.
    */
  val uuid: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingState
  ): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMappingState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lambdaEventSourceMappingMod.EventSourceMapping = js.native
}

