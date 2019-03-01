package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntervalRunning extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  // By default, does not run.
  var running: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IntervalRunning {
  @scala.inline
  def apply(interval: scala.Int | scala.Double = null, running: js.UndefOr[scala.Boolean] = js.undefined): Anon_IntervalRunning = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running)
    __obj.asInstanceOf[Anon_IntervalRunning]
  }
}

