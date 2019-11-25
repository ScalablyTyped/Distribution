package typings.sipDotJs.libSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    body: String = null,
    contentType: String = null,
    expires: Int | Double = null,
    extraHeaders: js.Array[String] = null
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

