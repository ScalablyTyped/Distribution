package typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod

import typings.sipDotJs.libCoreMessagesBodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptions extends js.Object {
  /** Body to include in the message. */
  var body: js.UndefOr[Body] = js.undefined
  /** Extra headers to include in the message. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** Reason phrase of the response. */
  var reasonPhrase: js.UndefOr[String] = js.undefined
  /** Status code of the response. */
  var statusCode: Double
  /** Support options tags for Supported header. */
  var supported: js.UndefOr[js.Array[String]] = js.undefined
  /** To tag of the response. If not provided, one is generated. */
  var toTag: js.UndefOr[String] = js.undefined
  /** User agent string for User-Agent header. */
  var userAgent: js.UndefOr[String] = js.undefined
}

object ResponseOptions {
  @scala.inline
  def apply(
    statusCode: Double,
    body: Body = null,
    extraHeaders: js.Array[String] = null,
    reasonPhrase: String = null,
    supported: js.Array[String] = null,
    toTag: String = null,
    userAgent: String = null
  ): ResponseOptions = {
    val __obj = js.Dynamic.literal(statusCode = statusCode)
    if (body != null) __obj.updateDynamic("body")(body)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase)
    if (supported != null) __obj.updateDynamic("supported")(supported)
    if (toTag != null) __obj.updateDynamic("toTag")(toTag)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[ResponseOptions]
  }
}

