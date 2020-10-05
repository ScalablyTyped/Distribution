package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpHeaderExtensionCapability extends js.Object {
  var uri: js.UndefOr[java.lang.String] = js.native
}

object RTCRtpHeaderExtensionCapability {
  @scala.inline
  def apply(): RTCRtpHeaderExtensionCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpHeaderExtensionCapability]
  }
  @scala.inline
  implicit class RTCRtpHeaderExtensionCapabilityOps[Self <: RTCRtpHeaderExtensionCapability] (val x: Self) extends AnyVal {
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
    def setUri(value: java.lang.String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

