package typings
package atPulumiAwsLib.kinesisKinesisMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of
    * invocation. Defaults to `100` for Kinesis.
    */
  val batchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either
    * `TRIM_HORIZON`, `LATEST` or `AT_TIMESTAMP`.  If `AT_TIMESTAMP` is provided,
    * [startingPositionTimestamp] must be provided as well.
    */
  val startingPosition: atPulumiAwsLib.atPulumiAwsLibStrings.TRIM_HORIZON | atPulumiAwsLib.atPulumiAwsLibStrings.LATEST | atPulumiAwsLib.atPulumiAwsLibStrings.AT_TIMESTAMP
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the
    * data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`.
    * If a record with this exact timestamp does not exist, the next later record is chosen.
    * If the timestamp is older than the current trim horizon, the oldest available record is
    * chosen.
    */
  val startingPositionTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

object StreamEventSubscriptionArgs {
  @scala.inline
  def apply(
    startingPosition: atPulumiAwsLib.atPulumiAwsLibStrings.TRIM_HORIZON | atPulumiAwsLib.atPulumiAwsLibStrings.LATEST | atPulumiAwsLib.atPulumiAwsLibStrings.AT_TIMESTAMP,
    batchSize: scala.Int | scala.Double = null,
    startingPositionTimestamp: java.lang.String = null
  ): StreamEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (startingPositionTimestamp != null) __obj.updateDynamic("startingPositionTimestamp")(startingPositionTimestamp)
    __obj.asInstanceOf[StreamEventSubscriptionArgs]
  }
}

