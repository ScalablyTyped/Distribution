package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppConfig extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var identity: js.UndefOr[String] = js.undefined
  var isSecure: js.UndefOr[Boolean] = js.undefined
  var openWithoutData: js.UndefOr[Boolean] = js.undefined
  var port: String | Double
  var prefix: js.UndefOr[String] = js.undefined
}

object GetAppConfig {
  @scala.inline
  def apply(
    port: String | Double,
    host: String = null,
    identity: String = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    openWithoutData: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null
  ): GetAppConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (!js.isUndefined(openWithoutData)) __obj.updateDynamic("openWithoutData")(openWithoutData)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[GetAppConfig]
  }
}

