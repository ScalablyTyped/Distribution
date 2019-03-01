package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions extends TimeoutsOptions {
  /**
    * Whether to retry forever.
    * @default false
    */
  var forever: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum time (in milliseconds) that the retried operation is allowed to run.
    * @default Infinity
    */
  var maxRetryTime: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to [unref](https://nodejs.org/api/timers.html#timers_unref) the setTimeout's.
    * @default false
    */
  var unref: js.UndefOr[scala.Boolean] = js.undefined
}

object OperationOptions {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    forever: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetryTime: scala.Int | scala.Double = null,
    maxTimeout: scala.Int | scala.Double = null,
    minTimeout: scala.Int | scala.Double = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    unref: js.UndefOr[scala.Boolean] = js.undefined
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

