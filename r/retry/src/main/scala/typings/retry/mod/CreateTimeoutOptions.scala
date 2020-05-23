package typings.retry.mod

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
    factor: js.UndefOr[Double] = js.undefined,
    maxTimeout: js.UndefOr[Double] = js.undefined,
    minTimeout: js.UndefOr[Double] = js.undefined,
    randomize: js.UndefOr[Boolean] = js.undefined
  ): CreateTimeoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeout)) __obj.updateDynamic("maxTimeout")(maxTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTimeout)) __obj.updateDynamic("minTimeout")(minTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTimeoutOptions]
  }
}

