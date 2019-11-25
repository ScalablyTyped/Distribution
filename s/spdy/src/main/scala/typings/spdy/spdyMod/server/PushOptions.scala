package typings.spdy.spdyMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushOptions extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var request: js.UndefOr[js.Any] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object PushOptions {
  @scala.inline
  def apply(
    method: String = null,
    request: js.Any = null,
    response: js.Any = null,
    status: Int | Double = null
  ): PushOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushOptions]
  }
}

