package typings.atPulumiAws.kinesisKinesisMixinsMod

import typings.atPulumiAws.atPulumiAwsStrings.AT_TIMESTAMP
import typings.atPulumiAws.atPulumiAwsStrings.LATEST
import typings.atPulumiAws.atPulumiAwsStrings.TRIM_HORIZON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEventSubscriptionArgs extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of
    * invocation. Defaults to `100` for Kinesis.
    */
  val batchSize: js.UndefOr[Double] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of either
    * `TRIM_HORIZON`, `LATEST` or `AT_TIMESTAMP`.  If `AT_TIMESTAMP` is provided,
    * [startingPositionTimestamp] must be provided as well.
    */
  val startingPosition: TRIM_HORIZON | LATEST | AT_TIMESTAMP = js.native
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the
    * data record which to start reading when using `starting_position` set to `AT_TIMESTAMP`.
    * If a record with this exact timestamp does not exist, the next later record is chosen.
    * If the timestamp is older than the current trim horizon, the oldest available record is
    * chosen.
    */
  val startingPositionTimestamp: js.UndefOr[String] = js.native
}

object StreamEventSubscriptionArgs {
  @scala.inline
  def apply(
    startingPosition: TRIM_HORIZON | LATEST | AT_TIMESTAMP,
    batchSize: Int | Double = null,
    startingPositionTimestamp: String = null
  ): StreamEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (startingPositionTimestamp != null) __obj.updateDynamic("startingPositionTimestamp")(startingPositionTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEventSubscriptionArgs]
  }
}

