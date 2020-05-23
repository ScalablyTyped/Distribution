package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sqs extends js.Object {
  var arn: String
  var batchSize: js.UndefOr[Double | String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var maximumRetryAttempts: js.UndefOr[Double | String] = js.undefined
}

object Sqs {
  @scala.inline
  def apply(
    arn: String,
    batchSize: Double | String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maximumRetryAttempts: Double | String = null
  ): Sqs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (maximumRetryAttempts != null) __obj.updateDynamic("maximumRetryAttempts")(maximumRetryAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sqs]
  }
}

