package typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod

import typings.sipDotJs.libCoreMessagesBodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /** Body to include in the message. */
  var body: js.UndefOr[Body] = js.undefined
  /** Extra headers to include in the message. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(body: Body = null, extraHeaders: js.Array[String] = null): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

