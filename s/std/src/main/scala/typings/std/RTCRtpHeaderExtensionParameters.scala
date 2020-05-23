package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpHeaderExtensionParameters extends js.Object {
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var id: Double
  var uri: java.lang.String
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(id: Double, uri: java.lang.String, encrypted: js.UndefOr[scala.Boolean] = js.undefined): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
}

