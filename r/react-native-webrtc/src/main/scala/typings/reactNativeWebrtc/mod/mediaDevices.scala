package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-webrtc", "mediaDevices")
@js.native
open class mediaDevices () extends StObject {
  
  def ondevicechange(): js.UndefOr[Unit] = js.native
}
/* static members */
object mediaDevices {
  
  @JSImport("react-native-webrtc", "mediaDevices")
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumerateDevices(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateDevices")().asInstanceOf[js.Promise[Any]]
  
  inline def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserMedia")(constraints.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MediaStream]]
}
