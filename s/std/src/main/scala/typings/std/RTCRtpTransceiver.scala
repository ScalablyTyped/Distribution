package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver) */
@js.native
trait RTCRtpTransceiver extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/currentDirection) */
  /* standard dom */
  val currentDirection: RTCRtpTransceiverDirection | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/direction) */
  /* standard dom */
  var direction: RTCRtpTransceiverDirection = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/mid) */
  /* standard dom */
  val mid: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/receiver) */
  /* standard dom */
  val receiver: RTCRtpReceiver = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/sender) */
  /* standard dom */
  val sender: RTCRtpSender = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/setCodecPreferences) */
  /* standard dom */
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/setCodecPreferences) */
  /* standard dom.iterable */
  def setCodecPreferences(codecs: js.Iterable[RTCRtpCodecCapability]): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpTransceiver/stop) */
  /* standard dom */
  def stop(): Unit = js.native
}
