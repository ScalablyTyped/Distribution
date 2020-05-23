package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollInterval extends js.Object {
  var pollInterval: js.UndefOr[Double] = js.undefined
  var stabilityThreshold: js.UndefOr[Double] = js.undefined
}

object PollInterval {
  @scala.inline
  def apply(
    pollInterval: js.UndefOr[Double] = js.undefined,
    stabilityThreshold: js.UndefOr[Double] = js.undefined
  ): PollInterval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stabilityThreshold)) __obj.updateDynamic("stabilityThreshold")(stabilityThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollInterval]
  }
}

