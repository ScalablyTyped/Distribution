package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  var running: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Interval {
  @scala.inline
  def apply(
    interval: scala.Int | scala.Double = null,
    running: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null
  ): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Interval]
  }
}

