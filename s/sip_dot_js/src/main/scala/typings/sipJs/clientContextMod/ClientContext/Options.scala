package typings.sipJs.clientContextMod.ClientContext

import typings.sipJs.AnonFromUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var params: js.UndefOr[AnonFromUri] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    body: String = null,
    contentType: String = null,
    extraHeaders: js.Array[String] = null,
    params: AnonFromUri = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

