package typings.reactFns.scrollScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollConfig extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object ScrollConfig {
  @scala.inline
  def apply(throttle: Int | Double = null): ScrollConfig = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollConfig]
  }
}

