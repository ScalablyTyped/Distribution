package typings.qlik.mod

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
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openWithoutData)) __obj.updateDynamic("openWithoutData")(openWithoutData.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppConfig]
  }
}

