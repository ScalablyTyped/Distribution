package typings.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxTimeMinTime extends js.Object {
  var maxTime: js.UndefOr[Double | String] = js.undefined
  var minTime: js.UndefOr[Double | String] = js.undefined
}

object AnonMaxTimeMinTime {
  @scala.inline
  def apply(maxTime: Double | String = null, minTime: Double | String = null): AnonMaxTimeMinTime = {
    val __obj = js.Dynamic.literal()
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxTimeMinTime]
  }
}

