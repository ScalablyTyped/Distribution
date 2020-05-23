package typings.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectOpts extends js.Object {
  var factor: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var `reconnect timeout`: js.UndefOr[Double] = js.undefined
  var retries: js.UndefOr[Double | Null] = js.undefined
}

object ReconnectOpts {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    `reconnect timeout`: js.UndefOr[Double] = js.undefined,
    retries: js.UndefOr[Null | Double] = js.undefined
  ): ReconnectOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`reconnect timeout`)) __obj.updateDynamic("reconnect timeout")(((`reconnect timeout`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconnectOpts]
  }
}

