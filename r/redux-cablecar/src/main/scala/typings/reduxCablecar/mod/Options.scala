package typings.reduxCablecar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var optimisticOnFail: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    connected: () => Unit = null,
    disconnected: () => Unit = null,
    optimisticOnFail: js.UndefOr[Boolean] = js.undefined,
    params: js.Object = null,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (connected != null) __obj.updateDynamic("connected")(js.Any.fromFunction0(connected))
    if (disconnected != null) __obj.updateDynamic("disconnected")(js.Any.fromFunction0(disconnected))
    if (!js.isUndefined(optimisticOnFail)) __obj.updateDynamic("optimisticOnFail")(optimisticOnFail.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

