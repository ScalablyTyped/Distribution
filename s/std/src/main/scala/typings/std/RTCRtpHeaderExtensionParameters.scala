package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpHeaderExtensionParameters extends js.Object {
  var encrypted: js.UndefOr[scala.Boolean] = js.native
  var id: Double = js.native
  var uri: java.lang.String = js.native
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(id: Double, uri: java.lang.String): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
  @scala.inline
  implicit class RTCRtpHeaderExtensionParametersOps[Self <: RTCRtpHeaderExtensionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: java.lang.String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted(value: scala.Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
  }
  
}

