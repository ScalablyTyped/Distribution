package typings
package simpleDashPeerLib.simpleDashPeerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalData extends js.Object {
  var candidate: js.UndefOr[js.Any] = js.undefined
  var sdp: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[
    simpleDashPeerLib.simpleDashPeerLibStrings.offer | simpleDashPeerLib.simpleDashPeerLibStrings.pranswer | simpleDashPeerLib.simpleDashPeerLibStrings.answer | simpleDashPeerLib.simpleDashPeerLibStrings.rollback
  ] = js.undefined
}

object SignalData {
  @scala.inline
  def apply(
    candidate: js.Any = null,
    sdp: js.Any = null,
    `type`: simpleDashPeerLib.simpleDashPeerLibStrings.offer | simpleDashPeerLib.simpleDashPeerLibStrings.pranswer | simpleDashPeerLib.simpleDashPeerLibStrings.answer | simpleDashPeerLib.simpleDashPeerLibStrings.rollback = null
  ): SignalData = {
    val __obj = js.Dynamic.literal()
    if (candidate != null) __obj.updateDynamic("candidate")(candidate)
    if (sdp != null) __obj.updateDynamic("sdp")(sdp)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalData]
  }
}

