package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpTransceiver extends js.Object {
  val currentDirection: RTCRtpTransceiverDirection | scala.Null
  var direction: RTCRtpTransceiverDirection
  val mid: java.lang.String | scala.Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: scala.Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): scala.Unit
  def stop(): scala.Unit
}

@JSGlobal("RTCRtpTransceiver")
@js.native
class RTCRtpTransceiverCls () extends RTCRtpTransceiver {
  /* CompleteClass */
  override val currentDirection: RTCRtpTransceiverDirection | scala.Null = js.native
  /* CompleteClass */
  override var direction: RTCRtpTransceiverDirection = js.native
  /* CompleteClass */
  override val mid: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val receiver: RTCRtpReceiver = js.native
  /* CompleteClass */
  override val sender: RTCRtpSender = js.native
  /* CompleteClass */
  override val stopped: scala.Boolean = js.native
  /* CompleteClass */
  override def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): scala.Unit = js.native
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
}

@JSGlobal("RTCRtpTransceiver")
@js.native
object RTCRtpTransceiver
  extends org.scalablytyped.runtime.Instantiable0[RTCRtpTransceiver]

