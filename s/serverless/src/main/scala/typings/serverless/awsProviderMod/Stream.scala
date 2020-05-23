package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  var arn: String
  var batchSize: js.UndefOr[Double | String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var startingPosition: js.UndefOr[Double | String] = js.undefined
}

object Stream {
  @scala.inline
  def apply(
    arn: String,
    batchSize: Double | String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    startingPosition: Double | String = null
  ): Stream = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
}

