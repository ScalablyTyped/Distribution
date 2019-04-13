package typings
package progressDashStreamLib.progressDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var drain: js.UndefOr[scala.Boolean] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
  var transferred: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    drain: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    time: scala.Int | scala.Double = null,
    transferred: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drain)) __obj.updateDynamic("drain")(drain)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (transferred != null) __obj.updateDynamic("transferred")(transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

