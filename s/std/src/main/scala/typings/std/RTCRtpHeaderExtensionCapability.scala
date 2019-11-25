package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpHeaderExtensionCapability extends js.Object {
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpHeaderExtensionCapability {
  @scala.inline
  def apply(uri: java.lang.String = null): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
}

