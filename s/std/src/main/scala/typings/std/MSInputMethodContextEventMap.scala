package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSInputMethodContextEventMap extends js.Object {
  var MSCandidateWindowHide: Event = js.native
  var MSCandidateWindowShow: Event = js.native
  var MSCandidateWindowUpdate: Event = js.native
}

object MSInputMethodContextEventMap {
  @scala.inline
  def apply(MSCandidateWindowHide: Event, MSCandidateWindowShow: Event, MSCandidateWindowUpdate: Event): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide.asInstanceOf[js.Any], MSCandidateWindowShow = MSCandidateWindowShow.asInstanceOf[js.Any], MSCandidateWindowUpdate = MSCandidateWindowUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
  @scala.inline
  implicit class MSInputMethodContextEventMapOps[Self <: MSInputMethodContextEventMap] (val x: Self) extends AnyVal {
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
    def setMSCandidateWindowHide(value: Event): Self = this.set("MSCandidateWindowHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSCandidateWindowShow(value: Event): Self = this.set("MSCandidateWindowShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSCandidateWindowUpdate(value: Event): Self = this.set("MSCandidateWindowUpdate", value.asInstanceOf[js.Any])
  }
  
}

