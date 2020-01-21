package typings.simplePeer.mod

import typings.simplePeer.simplePeerStrings.answer
import typings.simplePeer.simplePeerStrings.offer
import typings.simplePeer.simplePeerStrings.pranswer
import typings.simplePeer.simplePeerStrings.rollback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalData extends js.Object {
  var candidate: js.UndefOr[js.Any] = js.undefined
  var sdp: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[offer | pranswer | answer | rollback] = js.undefined
}

object SignalData {
  @scala.inline
  def apply(candidate: js.Any = null, sdp: js.Any = null, `type`: offer | pranswer | answer | rollback = null): SignalData = {
    val __obj = js.Dynamic.literal()
    if (candidate != null) __obj.updateDynamic("candidate")(candidate.asInstanceOf[js.Any])
    if (sdp != null) __obj.updateDynamic("sdp")(sdp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalData]
  }
}

