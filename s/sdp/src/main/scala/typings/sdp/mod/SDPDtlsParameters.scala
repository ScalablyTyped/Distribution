package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPDtlsParameters extends js.Object {
  
  var fingerprints: js.Array[SDPFingerprint] = js.native
  
  var role: String = js.native
}
object SDPDtlsParameters {
  
  @scala.inline
  def apply(fingerprints: js.Array[SDPFingerprint], role: String): SDPDtlsParameters = {
    val __obj = js.Dynamic.literal(fingerprints = fingerprints.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPDtlsParameters]
  }
  
  @scala.inline
  implicit class SDPDtlsParametersOps[Self <: SDPDtlsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFingerprintsVarargs(value: SDPFingerprint*): Self = this.set("fingerprints", js.Array(value :_*))
    
    @scala.inline
    def setFingerprints(value: js.Array[SDPFingerprint]): Self = this.set("fingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
  }
}
