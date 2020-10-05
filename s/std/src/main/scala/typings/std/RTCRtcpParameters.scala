package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtcpParameters extends js.Object {
  var cname: js.UndefOr[java.lang.String] = js.native
  var reducedSize: js.UndefOr[scala.Boolean] = js.native
}

object RTCRtcpParameters {
  @scala.inline
  def apply(): RTCRtcpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtcpParameters]
  }
  @scala.inline
  implicit class RTCRtcpParametersOps[Self <: RTCRtcpParameters] (val x: Self) extends AnyVal {
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
    def setCname(value: java.lang.String): Self = this.set("cname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    @scala.inline
    def setReducedSize(value: scala.Boolean): Self = this.set("reducedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReducedSize: Self = this.set("reducedSize", js.undefined)
  }
  
}

