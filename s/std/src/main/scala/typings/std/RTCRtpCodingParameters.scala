package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpCodingParameters extends js.Object {
  var rid: js.UndefOr[java.lang.String] = js.native
}

object RTCRtpCodingParameters {
  @scala.inline
  def apply(): RTCRtpCodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpCodingParameters]
  }
  @scala.inline
  implicit class RTCRtpCodingParametersOps[Self <: RTCRtpCodingParameters] (val x: Self) extends AnyVal {
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
    def setRid(value: java.lang.String): Self = this.set("rid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRid: Self = this.set("rid", js.undefined)
  }
  
}

