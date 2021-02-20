package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-webrtc", "mediaDevices")
@js.native
class mediaDevices () extends StObject {
  
  def ondevicechange(): js.UndefOr[Unit] = js.native
}
/* static members */
object mediaDevices {
  
  @JSImport("react-native-webrtc", "mediaDevices.enumerateDevices")
  @js.native
  def enumerateDevices(): js.Promise[_] = js.native
  
  @JSImport("react-native-webrtc", "mediaDevices.getUserMedia")
  @js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream | Boolean] = js.native
}
