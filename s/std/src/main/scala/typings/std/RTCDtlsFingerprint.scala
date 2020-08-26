package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsFingerprint extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.native
  var value: js.UndefOr[java.lang.String] = js.native
}

object RTCDtlsFingerprint {
  @scala.inline
  def apply(): RTCDtlsFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDtlsFingerprint]
  }
  @scala.inline
  implicit class RTCDtlsFingerprintOps[Self <: RTCDtlsFingerprint] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: java.lang.String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setValue(value: java.lang.String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

