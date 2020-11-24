package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclArrayBufferModes extends js.Object {
  
  var ccm: SjclArrayBufferCCMMode = js.native
}
object SjclArrayBufferModes {
  
  @scala.inline
  def apply(ccm: SjclArrayBufferCCMMode): SjclArrayBufferModes = {
    val __obj = js.Dynamic.literal(ccm = ccm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclArrayBufferModes]
  }
  
  @scala.inline
  implicit class SjclArrayBufferModesOps[Self <: SjclArrayBufferModes] (val x: Self) extends AnyVal {
    
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
    def setCcm(value: SjclArrayBufferCCMMode): Self = this.set("ccm", value.asInstanceOf[js.Any])
  }
}
