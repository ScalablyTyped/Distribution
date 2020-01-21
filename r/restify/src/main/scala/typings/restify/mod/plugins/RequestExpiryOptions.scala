package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestExpiryOptions extends js.Object {
  /**
    * Header name of the absolute time for request expiration
    */
  var absoluteHeader: js.UndefOr[String] = js.undefined
  /**
    * Header name for the start time of the request
    */
  var startHeader: js.UndefOr[String] = js.undefined
  /**
    * The header name for the time in milliseconds that should ellapse before the request is considered expired.
    */
  var timeoutHeader: js.UndefOr[String] = js.undefined
}

object RequestExpiryOptions {
  @scala.inline
  def apply(absoluteHeader: String = null, startHeader: String = null, timeoutHeader: String = null): RequestExpiryOptions = {
    val __obj = js.Dynamic.literal()
    if (absoluteHeader != null) __obj.updateDynamic("absoluteHeader")(absoluteHeader.asInstanceOf[js.Any])
    if (startHeader != null) __obj.updateDynamic("startHeader")(startHeader.asInstanceOf[js.Any])
    if (timeoutHeader != null) __obj.updateDynamic("timeoutHeader")(timeoutHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestExpiryOptions]
  }
}

