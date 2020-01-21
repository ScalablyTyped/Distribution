package typings.serialport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVmin extends js.Object {
  var vmin: js.UndefOr[Double] = js.undefined
  var vtime: js.UndefOr[Double] = js.undefined
}

object AnonVmin {
  @scala.inline
  def apply(vmin: Int | Double = null, vtime: Int | Double = null): AnonVmin = {
    val __obj = js.Dynamic.literal()
    if (vmin != null) __obj.updateDynamic("vmin")(vmin.asInstanceOf[js.Any])
    if (vtime != null) __obj.updateDynamic("vtime")(vtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVmin]
  }
}

