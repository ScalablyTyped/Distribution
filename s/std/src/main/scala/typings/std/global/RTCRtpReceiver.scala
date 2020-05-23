package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import typings.std.RTCRtpCapabilities
import typings.std.RTCRtpContributingSource
import typings.std.RTCRtpReceiveParameters
import typings.std.RTCRtpSynchronizationSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCRtpReceiver")
@js.native
class RTCRtpReceiver ()
  extends typings.std.RTCRtpReceiver {
  /* CompleteClass */
  override val rtcpTransport: typings.std.RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override val track: typings.std.MediaStreamTrack = js.native
  /* CompleteClass */
  override val transport: typings.std.RTCDtlsTransport | Null = js.native
  /* CompleteClass */
  override def getContributingSources(): js.Array[RTCRtpContributingSource] = js.native
  /* CompleteClass */
  override def getParameters(): RTCRtpReceiveParameters = js.native
  /* CompleteClass */
  override def getStats(): js.Promise[typings.std.RTCStatsReport] = js.native
  /* CompleteClass */
  override def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource] = js.native
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver
  extends Instantiable0[typings.std.RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): RTCRtpCapabilities | Null = js.native
}

