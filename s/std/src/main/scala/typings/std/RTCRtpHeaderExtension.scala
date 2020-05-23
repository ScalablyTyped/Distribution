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
    preferredId: js.UndefOr[Double] = js.undefined,
    uri: java.lang.String = null
  ): RTCRtpHeaderExtension = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(preferredEncrypt)) __obj.updateDynamic("preferredEncrypt")(preferredEncrypt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferredId)) __obj.updateDynamic("preferredId")(preferredId.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtension]
  }
}

