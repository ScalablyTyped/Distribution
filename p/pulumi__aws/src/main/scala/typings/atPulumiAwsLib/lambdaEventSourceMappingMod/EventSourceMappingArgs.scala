package typings
package atPulumiAwsLib.lambdaEventSourceMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceMappingArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
    */
  val batchSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Determines if the mapping will be enabled on creation. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The event source ARN - can either be a Kinesis or DynamoDB stream.
    */
  val eventSourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name or the ARN of the Lambda function that will be subscribing to events.
    */
  val functionName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
    */
  val startingPosition: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
    */
  val startingPositionTimestamp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EventSourceMappingArgs {
  @scala.inline
  def apply(
    eventSourceArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    functionName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    batchSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    startingPosition: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    startingPositionTimestamp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): EventSourceMappingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventSourceArn")(eventSourceArn.asInstanceOf[js.Any])
    __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    if (startingPositionTimestamp != null) __obj.updateDynamic("startingPositionTimestamp")(startingPositionTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingArgs]
  }
}

