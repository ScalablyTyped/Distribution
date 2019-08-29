package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebRTC API interface manages the reception and decoding of data for a MediaStreamTrack on an RTCPeerConnection. */
trait RTCRtpReceiver extends js.Object {
  val rtcpTransport: RTCDtlsTransport | Null
  val track: MediaStreamTrack
  val transport: RTCDtlsTransport | Null
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  def getParameters(): RTCRtpReceiveParameters
  def getStats(): js.Promise[RTCStatsReport]
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource]
}

@JSGlobal("RTCRtpReceiver")
@js.native
class RTCRtpReceiverCls () extends RTCRtpReceiver {
  /* CompleteClass */
  override val rtcpTransport: RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override val track: MediaStreamTrack = js.native
  /* CompleteClass */
  override val transport: RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  /* CompleteClass */
  override def getStats(): js.Promise[RTCStatsReport] = js.native
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver extends Instantiable0[RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = js.native
}

