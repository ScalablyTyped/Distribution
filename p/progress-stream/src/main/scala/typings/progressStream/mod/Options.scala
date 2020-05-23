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
    length: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined,
    transferred: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drain)) __obj.updateDynamic("drain")(drain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transferred)) __obj.updateDynamic("transferred")(transferred.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

