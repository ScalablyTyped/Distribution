package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidateInit extends js.Object {
  var candidate: js.UndefOr[java.lang.String] = js.undefined
  var sdpMLineIndex: js.UndefOr[Double | Null] = js.undefined
  var sdpMid: js.UndefOr[java.lang.String | Null] = js.undefined
  var usernameFragment: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceCandidateInit {
  @scala.inline
  def apply(
    candidate: java.lang.String = null,
    sdpMLineIndex: Int | Double = null,
    sdpMid: java.lang.String = null,
    usernameFragment: java.lang.String = null
  ): RTCIceCandidateInit = {
    val __obj = js.Dynamic.literal()
    if (candidate != null) __obj.updateDynamic("candidate")(candidate)
    if (sdpMLineIndex != null) __obj.updateDynamic("sdpMLineIndex")(sdpMLineIndex.asInstanceOf[js.Any])
    if (sdpMid != null) __obj.updateDynamic("sdpMid")(sdpMid)
    if (usernameFragment != null) __obj.updateDynamic("usernameFragment")(usernameFragment)
    __obj.asInstanceOf[RTCIceCandidateInit]
  }
}

