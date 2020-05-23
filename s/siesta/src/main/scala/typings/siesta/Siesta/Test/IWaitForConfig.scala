package typings.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWaitForConfig extends js.Object {
  var callback: js.Function
  var interval: js.UndefOr[Double] = js.undefined
  var method: js.Function
  var scope: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IWaitForConfig {
  @scala.inline
  def apply(
    callback: js.Function,
    method: js.Function,
    interval: js.UndefOr[Double] = js.undefined,
    scope: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): IWaitForConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForConfig]
  }
}

