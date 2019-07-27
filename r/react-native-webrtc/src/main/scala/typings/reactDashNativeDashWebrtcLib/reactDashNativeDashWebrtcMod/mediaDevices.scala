package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-webrtc", "mediaDevices")
@js.native
class mediaDevices () extends js.Object {
  def ondevicechange(): js.UndefOr[scala.Unit] = js.native
}

/* static members */
@JSImport("react-native-webrtc", "mediaDevices")
@js.native
object mediaDevices extends js.Object {
  def enumerateDevices(): js.Promise[_] = js.native
  def getUserMedia(constraints: reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod.MediaStreamConstraints): reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod.MediaStream = js.native
}

