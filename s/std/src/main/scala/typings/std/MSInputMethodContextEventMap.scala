package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSInputMethodContextEventMap extends js.Object {
  var MSCandidateWindowHide: Event_
  var MSCandidateWindowShow: Event_
  var MSCandidateWindowUpdate: Event_
}

object MSInputMethodContextEventMap {
  @scala.inline
  def apply(MSCandidateWindowHide: Event_, MSCandidateWindowShow: Event_, MSCandidateWindowUpdate: Event_): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide.asInstanceOf[js.Any], MSCandidateWindowShow = MSCandidateWindowShow.asInstanceOf[js.Any], MSCandidateWindowUpdate = MSCandidateWindowUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
}

