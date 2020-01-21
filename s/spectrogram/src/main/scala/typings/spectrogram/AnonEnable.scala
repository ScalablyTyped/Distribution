package typings.spectrogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnable extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
}

object AnonEnable {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined): AnonEnable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnable]
  }
}

