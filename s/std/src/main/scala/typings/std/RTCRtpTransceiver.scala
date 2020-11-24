package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpTransceiver extends js.Object {
  
  val currentDirection: RTCRtpTransceiverDirection | Null = js.native
  
  var direction: RTCRtpTransceiverDirection = js.native
  
  val mid: java.lang.String | Null = js.native
  
  val receiver: RTCRtpReceiver = js.native
  
  val sender: RTCRtpSender = js.native
  
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  def setCodecPreferences(codecs: Iterable[RTCRtpCodecCapability]): Unit = js.native
  
  def stop(): Unit = js.native
}
