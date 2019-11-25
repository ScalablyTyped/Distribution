package typings.retry.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTimeoutOptions extends js.Object {
  /**
    * The exponential factor to use.
    * @default 2
    */
  var factor: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of milliseconds between two retries.
    * @default Infinity
    */
  var maxTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds before starting the first retry.
    * @default 1000
    */
  var minTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Randomizes the timeouts by multiplying a factor between 1-2.
    * @default false
    */
  var randomize: js.UndefOr[Boolean] = js.undefined
}

object CreateTimeoutOptions {
  @scala.inline
  def apply(
    factor: Int | Double = null,
    maxTimeout: Int | Double = null,
    minTimeout: Int | Double = null,
    randomize: js.UndefOr[Boolean] = js.undefined
  ): CreateTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTimeoutOptions]
  }
}

