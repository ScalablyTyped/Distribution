package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceGatherOptions extends js.Object {
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.undefined
  var iceservers: js.UndefOr[Array[RTCIceServer]] = js.undefined
}

object RTCIceGatherOptions {
  @scala.inline
  def apply(gatherPolicy: RTCIceGatherPolicy = null, iceservers: Array[RTCIceServer] = null): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    if (gatherPolicy != null) __obj.updateDynamic("gatherPolicy")(gatherPolicy)
    if (iceservers != null) __obj.updateDynamic("iceservers")(iceservers)
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
}

