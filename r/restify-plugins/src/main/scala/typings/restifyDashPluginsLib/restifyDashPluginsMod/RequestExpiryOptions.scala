package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestExpiryOptions extends js.Object {
  /**
    * Header name of the absolute time for request expiration
    */
  var absoluteHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Header name for the start time of the request
    */
  var startHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The header name for the time in milliseconds that should ellapse before the request is considered expired.
    */
  var timeoutHeader: js.UndefOr[java.lang.String] = js.undefined
}

object RequestExpiryOptions {
  @scala.inline
  def apply(
    absoluteHeader: java.lang.String = null,
    startHeader: java.lang.String = null,
    timeoutHeader: java.lang.String = null
  ): RequestExpiryOptions = {
    val __obj = js.Dynamic.literal()
    if (absoluteHeader != null) __obj.updateDynamic("absoluteHeader")(absoluteHeader)
    if (startHeader != null) __obj.updateDynamic("startHeader")(startHeader)
    if (timeoutHeader != null) __obj.updateDynamic("timeoutHeader")(timeoutHeader)
    __obj.asInstanceOf[RequestExpiryOptions]
  }
}

