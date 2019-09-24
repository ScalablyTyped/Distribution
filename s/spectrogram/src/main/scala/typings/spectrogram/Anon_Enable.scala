package typings.spectrogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: js.UndefOr[Boolean] = js.undefined
}

object Anon_Enable {
  @scala.inline
  def apply(enable: js.UndefOr[Boolean] = js.undefined): Anon_Enable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    __obj.asInstanceOf[Anon_Enable]
  }
}

