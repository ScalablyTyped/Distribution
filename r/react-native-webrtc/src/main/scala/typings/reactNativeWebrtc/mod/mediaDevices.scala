package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-webrtc", "mediaDevices")
@js.native
class mediaDevices () extends js.Object {
  def ondevicechange(): js.UndefOr[Unit] = js.native
}

/* static members */
@JSImport("react-native-webrtc", "mediaDevices")
@js.native
object mediaDevices extends js.Object {
  def enumerateDevices(): js.Promise[_] = js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream | Boolean] = js.native
}

