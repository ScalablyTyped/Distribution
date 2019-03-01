package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSCandidateWindowHide")(MSCandidateWindowHide)
    __obj.updateDynamic("MSCandidateWindowShow")(MSCandidateWindowShow)
    __obj.updateDynamic("MSCandidateWindowUpdate")(MSCandidateWindowUpdate)
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
}

