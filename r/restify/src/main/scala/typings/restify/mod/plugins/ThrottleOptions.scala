package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  var burst: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[Boolean] = js.undefined
  var maxKeys: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[js.Any] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var setHeaders: js.UndefOr[Boolean] = js.undefined
  var tokensTable: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[Boolean] = js.undefined
  var xff: js.UndefOr[Boolean] = js.undefined
}

object ThrottleOptions {
  @scala.inline
  def apply(
    burst: Int | Double = null,
    ip: js.UndefOr[Boolean] = js.undefined,
    maxKeys: Int | Double = null,
    overrides: js.Any = null,
    rate: Int | Double = null,
    setHeaders: js.UndefOr[Boolean] = js.undefined,
    tokensTable: js.Any = null,
    username: js.UndefOr[Boolean] = js.undefined,
    xff: js.UndefOr[Boolean] = js.undefined
  ): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (burst != null) __obj.updateDynamic("burst")(burst.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(setHeaders)) __obj.updateDynamic("setHeaders")(setHeaders.asInstanceOf[js.Any])
    if (tokensTable != null) __obj.updateDynamic("tokensTable")(tokensTable.asInstanceOf[js.Any])
    if (!js.isUndefined(username)) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(xff)) __obj.updateDynamic("xff")(xff.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
}

