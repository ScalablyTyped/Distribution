package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Running extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  // By default, does not run.
  var running: js.UndefOr[Boolean] = js.undefined
}

object Running {
  @scala.inline
  def apply(interval: js.UndefOr[Double] = js.undefined, running: js.UndefOr[Boolean] = js.undefined): Running = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Running]
  }
}

