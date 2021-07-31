package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-webrtc", "mediaDevices")
@js.native
class mediaDevices () extends StObject {
  
  def ondevicechange(): js.UndefOr[Unit] = js.native
}
/* static members */
object mediaDevices {
  
  @JSImport("react-native-webrtc", "mediaDevices")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enumerateDevices(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateDevices")().asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream | Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserMedia")(constraints.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MediaStream | Boolean]]
}
