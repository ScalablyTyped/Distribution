package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  var burst: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[Boolean] = js.undefined
  var maxKeys: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[js.Any] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var tokensTable: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[Boolean] = js.undefined
  var xff: js.UndefOr[Boolean] = js.undefined
}

object ThrottleOptions {
  @scala.inline
  def apply(
    burst: js.UndefOr[Double] = js.undefined,
    ip: js.UndefOr[Boolean] = js.undefined,
    maxKeys: js.UndefOr[Double] = js.undefined,
    overrides: js.Any = null,
    rate: js.UndefOr[Double] = js.undefined,
    tokensTable: js.Any = null,
    username: js.UndefOr[Boolean] = js.undefined,
    xff: js.UndefOr[Boolean] = js.undefined
  ): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(burst)) __obj.updateDynamic("burst")(burst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxKeys)) __obj.updateDynamic("maxKeys")(maxKeys.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (tokensTable != null) __obj.updateDynamic("tokensTable")(tokensTable.asInstanceOf[js.Any])
    if (!js.isUndefined(username)) __obj.updateDynamic("username")(username.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xff)) __obj.updateDynamic("xff")(xff.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
}

