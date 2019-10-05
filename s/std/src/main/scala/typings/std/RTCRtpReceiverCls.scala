package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

