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
    interval: Int | Double = null,
    scope: js.Any = null,
    timeout: Int | Double = null
  ): IWaitForConfig = {
    val __obj = js.Dynamic.literal(callback = callback, method = method)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWaitForConfig]
  }
}

