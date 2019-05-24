package typings
package sipDotJsLib.libCoreMessagesOutgoingDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** Body to include in the message. */
  var body: js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.undefined
  /** Extra headers to include in the message. */
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    body: sipDotJsLib.libCoreMessagesBodyMod.Body = null,
    extraHeaders: js.Array[java.lang.String] = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    __obj.asInstanceOf[RequestOptions]
  }
}

