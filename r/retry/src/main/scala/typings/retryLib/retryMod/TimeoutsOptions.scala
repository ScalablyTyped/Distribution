package typings
package retryLib.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutsOptions extends CreateTimeoutOptions {
  /**
    * The maximum amount of times to retry the operation.
    * @default 10
    */
  var retries: js.UndefOr[scala.Double] = js.undefined
}

object TimeoutsOptions {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    maxTimeout: scala.Int | scala.Double = null,
    minTimeout: scala.Int | scala.Double = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null
  ): TimeoutsOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutsOptions]
  }
}

