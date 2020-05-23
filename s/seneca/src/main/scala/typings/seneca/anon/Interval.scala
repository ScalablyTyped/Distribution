package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var running: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Interval {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    running: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): Interval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
}

