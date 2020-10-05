package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtlsParameters extends js.Object {
  var fingerprints: js.UndefOr[js.Array[RTCDtlsFingerprint]] = js.native
  var role: js.UndefOr[RTCDtlsRole] = js.native
}

object RTCDtlsParameters {
  @scala.inline
  def apply(): RTCDtlsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDtlsParameters]
  }
  @scala.inline
  implicit class RTCDtlsParametersOps[Self <: RTCDtlsParameters] (val x: Self) extends AnyVal {
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
    def setFingerprintsVarargs(value: RTCDtlsFingerprint*): Self = this.set("fingerprints", js.Array(value :_*))
    @scala.inline
    def setFingerprints(value: js.Array[RTCDtlsFingerprint]): Self = this.set("fingerprints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprints: Self = this.set("fingerprints", js.undefined)
    @scala.inline
    def setRole(value: RTCDtlsRole): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

