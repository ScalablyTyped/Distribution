package typings.retry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions extends TimeoutsOptions {
  /**
    * Whether to retry forever.
    * @default false
    */
  var forever: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum time (in milliseconds) that the retried operation is allowed to run.
    * @default Infinity
    */
  var maxRetryTime: js.UndefOr[Double] = js.undefined
  /**
    * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
    * @default false
    */
  var unref: js.UndefOr[Boolean] = js.undefined
}

object OperationOptions {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    forever: js.UndefOr[Boolean] = js.undefined,
    maxRetryTime: js.UndefOr[Double] = js.undefined,
    maxTimeout: js.UndefOr[Double] = js.undefined,
    minTimeout: js.UndefOr[Double] = js.undefined,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    unref: js.UndefOr[Boolean] = js.undefined
  ): OperationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetryTime)) __obj.updateDynamic("maxRetryTime")(maxRetryTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeout)) __obj.updateDynamic("maxTimeout")(maxTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTimeout)) __obj.updateDynamic("minTimeout")(minTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOptions]
  }
}

