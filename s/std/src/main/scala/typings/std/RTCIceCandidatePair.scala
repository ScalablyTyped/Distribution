package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidatePair extends js.Object {
  var local: js.UndefOr[RTCIceCandidate] = js.undefined
  var remote: js.UndefOr[RTCIceCandidate] = js.undefined
}

object RTCIceCandidatePair {
  @scala.inline
  def apply(local: RTCIceCandidate = null, remote: RTCIceCandidate = null): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
}

