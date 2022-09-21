package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpTransceiver extends StObject {
  
  /* standard dom */
  val currentDirection: RTCRtpTransceiverDirection | Null = js.native
  
  /* standard dom */
  var direction: RTCRtpTransceiverDirection = js.native
  
  /* standard dom */
  val mid: java.lang.String | Null = js.native
  
  /* standard dom */
  val receiver: RTCRtpReceiver = js.native
  
  /* standard dom */
  val sender: RTCRtpSender = js.native
  
  /* standard dom */
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  /* standard dom.iterable */
  def setCodecPreferences(codecs: js.Iterable[RTCRtpCodecCapability]): Unit = js.native
  
  /* standard dom */
  def stop(): Unit = js.native
}
