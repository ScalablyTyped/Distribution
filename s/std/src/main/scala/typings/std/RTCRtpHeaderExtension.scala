package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpHeaderExtension extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var preferredEncrypt: js.UndefOr[scala.Boolean] = js.undefined
  var preferredId: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpHeaderExtension {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    preferredEncrypt: js.UndefOr[scala.Boolean] = js.undefined,
    preferredId: Int | Double = null,
    uri: java.lang.String = null
  ): RTCRtpHeaderExtension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(preferredEncrypt)) __obj.updateDynamic("preferredEncrypt")(preferredEncrypt)
    if (preferredId != null) __obj.updateDynamic("preferredId")(preferredId.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[RTCRtpHeaderExtension]
  }
}

