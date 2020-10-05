package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpHeaderExtension extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.native
  var preferredEncrypt: js.UndefOr[scala.Boolean] = js.native
  var preferredId: js.UndefOr[Double] = js.native
  var uri: js.UndefOr[java.lang.String] = js.native
}

object RTCRtpHeaderExtension {
  @scala.inline
  def apply(): RTCRtpHeaderExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtension]
  }
  @scala.inline
  implicit class RTCRtpHeaderExtensionOps[Self <: RTCRtpHeaderExtension] (val x: Self) extends AnyVal {
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
    def setKind(value: java.lang.String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPreferredEncrypt(value: scala.Boolean): Self = this.set("preferredEncrypt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredEncrypt: Self = this.set("preferredEncrypt", js.undefined)
    @scala.inline
    def setPreferredId(value: Double): Self = this.set("preferredId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredId: Self = this.set("preferredId", js.undefined)
    @scala.inline
    def setUri(value: java.lang.String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

