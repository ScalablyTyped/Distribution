package typings.qlikDashVisualizationextensions.RootAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAppConfig extends js.Object {
  /**
    * Optional Qlik host.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Optional. Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: js.UndefOr[String] = js.undefined
  /**
    * Optional. Use SSL.
    */
  var isSecure: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. Open app without loading data. Introduced in version 1.1.
    */
  var openWithoutData: js.UndefOr[Boolean] = js.undefined
  /**
    * Port number.
    */
  var port: String | Double
  /**
    * Optional. Qlik virtual proxy. "/" if no proxy.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object IAppConfig {
  @scala.inline
  def apply(
    port: String | Double,
    host: String = null,
    identity: String = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    openWithoutData: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null
  ): IAppConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.asInstanceOf[js.Any])
    if (!js.isUndefined(openWithoutData)) __obj.updateDynamic("openWithoutData")(openWithoutData.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAppConfig]
  }
}

