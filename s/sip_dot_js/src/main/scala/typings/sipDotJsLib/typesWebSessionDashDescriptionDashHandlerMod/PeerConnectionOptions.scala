package typings
package sipDotJsLib.typesWebSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerConnectionOptions extends js.Object {
  var iceCheckingTimeout: js.UndefOr[scala.Double] = js.undefined
  var rtcConfiguration: js.UndefOr[js.Any] = js.undefined
}

object PeerConnectionOptions {
  @scala.inline
  def apply(iceCheckingTimeout: scala.Int | scala.Double = null, rtcConfiguration: js.Any = null): PeerConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (iceCheckingTimeout != null) __obj.updateDynamic("iceCheckingTimeout")(iceCheckingTimeout.asInstanceOf[js.Any])
    if (rtcConfiguration != null) __obj.updateDynamic("rtcConfiguration")(rtcConfiguration)
    __obj.asInstanceOf[PeerConnectionOptions]
  }
}

