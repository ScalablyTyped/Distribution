package typings.sipJs.outgoingResponseMod

import typings.sipJs.bodyMod.Body
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
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (reasonPhrase != null) __obj.updateDynamic("reasonPhrase")(reasonPhrase.asInstanceOf[js.Any])
    if (supported != null) __obj.updateDynamic("supported")(supported.asInstanceOf[js.Any])
    if (toTag != null) __obj.updateDynamic("toTag")(toTag.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOptions]
  }
}

