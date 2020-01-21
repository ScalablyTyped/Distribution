package typings.qlikVisualizationextensions.RootAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionAppConfig extends js.Object {
  /**
    * Optional Qlik host.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * Optional. Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: String
  /**
    * Optional. Use SSL.
    */
  var isSecure: Boolean
  /**
    * Optional. Open app without loading data.
    */
  var openWithoutData: Boolean
  /**
    * Port number.
    */
  var port: String | Double
  /**
    * Optional. Qlik virtual proxy. "/" if no proxy.
    */
  var prefix: String
}

object ISessionAppConfig {
  @scala.inline
  def apply(
    identity: String,
    isSecure: Boolean,
    openWithoutData: Boolean,
    port: String | Double,
    prefix: String,
    host: String = null
  ): ISessionAppConfig = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], openWithoutData = openWithoutData.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionAppConfig]
  }
}

