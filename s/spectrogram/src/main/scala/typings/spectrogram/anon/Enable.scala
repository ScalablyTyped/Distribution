package typings.spectrogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enable extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
}

object Enable {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined): Enable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
}

