package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGatherOptions extends js.Object {
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.undefined
  var iceservers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
}

object RTCIceGatherOptions {
  @scala.inline
  def apply(gatherPolicy: RTCIceGatherPolicy = null, iceservers: js.Array[RTCIceServer] = null): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    if (gatherPolicy != null) __obj.updateDynamic("gatherPolicy")(gatherPolicy.asInstanceOf[js.Any])
    if (iceservers != null) __obj.updateDynamic("iceservers")(iceservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
}

