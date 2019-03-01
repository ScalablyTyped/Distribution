package typings
package simpleDashPeerLib.simpleDashPeerMod.SimplePeerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalData extends js.Object {
  var candidate: js.UndefOr[js.Any] = js.undefined
  var sdp: js.UndefOr[js.Any] = js.undefined
}

object SignalData {
  @scala.inline
  def apply(candidate: js.Any = null, sdp: js.Any = null): SignalData = {
    val __obj = js.Dynamic.literal()
    if (candidate != null) __obj.updateDynamic("candidate")(candidate)
    if (sdp != null) __obj.updateDynamic("sdp")(sdp)
    __obj.asInstanceOf[SignalData]
  }
}

