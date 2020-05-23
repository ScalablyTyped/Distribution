package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioTimestamp extends js.Object {
  var contextTime: js.UndefOr[Double] = js.undefined
  var performanceTime: js.UndefOr[Double] = js.undefined
}

object AudioTimestamp {
  @scala.inline
  def apply(contextTime: js.UndefOr[Double] = js.undefined, performanceTime: js.UndefOr[Double] = js.undefined): AudioTimestamp = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextTime)) __obj.updateDynamic("contextTime")(contextTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(performanceTime)) __obj.updateDynamic("performanceTime")(performanceTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTimestamp]
  }
}

