package typings
package sipDotJsLib.libSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SubscriptionOptions {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    contentType: java.lang.String = null,
    expires: scala.Int | scala.Double = null,
    extraHeaders: js.Array[java.lang.String] = null
  ): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

