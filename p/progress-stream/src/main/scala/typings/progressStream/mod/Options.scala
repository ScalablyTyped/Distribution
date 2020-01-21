package typings.progressStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var drain: js.UndefOr[Boolean] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
  var transferred: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    drain: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    speed: Int | Double = null,
    time: Int | Double = null,
    transferred: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drain)) __obj.updateDynamic("drain")(drain.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (transferred != null) __obj.updateDynamic("transferred")(transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

