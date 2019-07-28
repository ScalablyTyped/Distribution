package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSInputMethodContextEventMap extends js.Object {
  var MSCandidateWindowHide: Event
  var MSCandidateWindowShow: Event
  var MSCandidateWindowUpdate: Event
}

object MSInputMethodContextEventMap {
  @scala.inline
  def apply(MSCandidateWindowHide: Event, MSCandidateWindowShow: Event, MSCandidateWindowUpdate: Event): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide, MSCandidateWindowShow = MSCandidateWindowShow, MSCandidateWindowUpdate = MSCandidateWindowUpdate)
  
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
}

