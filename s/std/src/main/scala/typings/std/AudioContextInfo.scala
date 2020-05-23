package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioContextInfo extends js.Object {
  var currentTime: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object AudioContextInfo {
  @scala.inline
  def apply(currentTime: js.UndefOr[Double] = js.undefined, sampleRate: js.UndefOr[Double] = js.undefined): AudioContextInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentTime)) __obj.updateDynamic("currentTime")(currentTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioContextInfo]
  }
}

