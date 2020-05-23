package typings.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutsOptions extends CreateTimeoutOptions {
  /**
    * The maximum amount of times to retry the operation.
    * @default 10
    */
  var retries: js.UndefOr[Double] = js.undefined
}

object TimeoutsOptions {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    maxTimeout: js.UndefOr[Double] = js.undefined,
    minTimeout: js.UndefOr[Double] = js.undefined,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined
  ): TimeoutsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeout)) __obj.updateDynamic("maxTimeout")(maxTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTimeout)) __obj.updateDynamic("minTimeout")(minTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutsOptions]
  }
}

