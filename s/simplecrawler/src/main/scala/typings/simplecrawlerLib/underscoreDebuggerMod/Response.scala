package typings
package simplecrawlerLib.underscoreDebuggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends Message {
  /** Contains message body if success === true. */
  var body: js.UndefOr[js.Any] = js.undefined
  /** Contains error message if success === false. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  var request_seq: scala.Double
  var success: scala.Boolean
}

object Response {
  @scala.inline
  def apply(
    request_seq: scala.Double,
    seq: scala.Double,
    success: scala.Boolean,
    `type`: java.lang.String,
    body: js.Any = null,
    message: java.lang.String = null
  ): Response = {
    val __obj = js.Dynamic.literal(request_seq = request_seq, seq = seq, success = success)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Response]
  }
}

