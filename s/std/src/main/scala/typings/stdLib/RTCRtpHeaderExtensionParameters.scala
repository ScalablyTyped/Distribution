package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpHeaderExtensionParameters extends js.Object {
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double
  var uri: java.lang.String
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(id: scala.Double, uri: java.lang.String, encrypted: js.UndefOr[scala.Boolean] = js.undefined): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("uri")(uri)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
}

