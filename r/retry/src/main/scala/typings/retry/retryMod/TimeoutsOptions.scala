package typings.retry.retryMod

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
    factor: Int | Double = null,
    maxTimeout: Int | Double = null,
    minTimeout: Int | Double = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null
  ): TimeoutsOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutsOptions]
  }
}

