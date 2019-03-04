package typings
package qlikDashVisualizationextensionsLib.RootAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppConfig extends js.Object {
  /**
    * Optional Qlik host.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. Use SSL.
    */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Open app without loading data. Introduced in version 1.1.
    */
  var openWithoutData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Port number.
    */
  var port: java.lang.String | scala.Double
  /**
    * Optional. Qlik virtual proxy. "/" if no proxy.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object IAppConfig {
  @scala.inline
  def apply(
    port: java.lang.String | scala.Double,
    host: java.lang.String = null,
    identity: java.lang.String = null,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    openWithoutData: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null
  ): IAppConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (!js.isUndefined(openWithoutData)) __obj.updateDynamic("openWithoutData")(openWithoutData)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[IAppConfig]
  }
}

