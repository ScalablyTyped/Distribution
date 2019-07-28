package typings.retry.retryMod

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
    factor: Int | Double = null,
    forever: js.UndefOr[Boolean] = js.undefined,
    maxRetryTime: Int | Double = null,
    maxTimeout: Int | Double = null,
    minTimeout: Int | Double = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null,
    unref: js.UndefOr[Boolean] = js.undefined
  ): OperationOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever)
    if (maxRetryTime != null) __obj.updateDynamic("maxRetryTime")(maxRetryTime.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref)
    __obj.asInstanceOf[OperationOptions]
  }
}

