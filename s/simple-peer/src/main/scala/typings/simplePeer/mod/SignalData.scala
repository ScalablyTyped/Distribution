package typings.simplePeer.mod

import typings.simplePeer.simplePeerStrings.answer
import typings.simplePeer.simplePeerStrings.offer
import typings.simplePeer.simplePeerStrings.pranswer
import typings.simplePeer.simplePeerStrings.rollback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalData extends js.Object {
  
  var candidate: js.UndefOr[js.Any] = js.native
  
  var sdp: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[offer | pranswer | answer | rollback] = js.native
}
object SignalData {
  
  @scala.inline
  def apply(): SignalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignalData]
  }
  
  @scala.inline
  implicit class SignalDataOps[Self <: SignalData] (val x: Self) extends AnyVal {
    
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
    def setCandidate(value: js.Any): Self = this.set("candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandidate: Self = this.set("candidate", js.undefined)
    
    @scala.inline
    def setSdp(value: js.Any): Self = this.set("sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdp: Self = this.set("sdp", js.undefined)
    
    @scala.inline
    def setType(value: offer | pranswer | answer | rollback): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
