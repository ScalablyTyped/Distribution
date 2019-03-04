package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppConfig extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var identity: js.UndefOr[java.lang.String] = js.undefined
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  var openWithoutData: js.UndefOr[scala.Boolean] = js.undefined
  var port: java.lang.String | scala.Double
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object GetAppConfig {
  @scala.inline
  def apply(
    port: java.lang.String | scala.Double,
    host: java.lang.String = null,
    identity: java.lang.String = null,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    openWithoutData: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null
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

