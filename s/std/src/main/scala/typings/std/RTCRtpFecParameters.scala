package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpFecParameters extends js.Object {
  var mechanism: js.UndefOr[java.lang.String] = js.native
  var ssrc: js.UndefOr[Double] = js.native
}

object RTCRtpFecParameters {
  @scala.inline
  def apply(): RTCRtpFecParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpFecParameters]
  }
  @scala.inline
  implicit class RTCRtpFecParametersOps[Self <: RTCRtpFecParameters] (val x: Self) extends AnyVal {
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
    def setMechanism(value: java.lang.String): Self = this.set("mechanism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMechanism: Self = this.set("mechanism", js.undefined)
    @scala.inline
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrc: Self = this.set("ssrc", js.undefined)
  }
  
}

