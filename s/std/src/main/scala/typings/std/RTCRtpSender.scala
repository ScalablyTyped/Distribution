package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer. */
@js.native
trait RTCRtpSender extends js.Object {
  val dtmf: RTCDTMFSender_ | Null = js.native
  val rtcpTransport: RTCDtlsTransport | Null = js.native
  val track: MediaStreamTrack | Null = js.native
  val transport: RTCDtlsTransport | Null = js.native
  def getParameters(): RTCRtpSendParameters = js.native
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def replaceTrack(): js.Promise[Unit] = js.native
  def replaceTrack(withTrack: MediaStreamTrack): js.Promise[Unit] = js.native
  def setParameters(parameters: RTCRtpSendParameters): js.Promise[Unit] = js.native
  def setStreams(streams: MediaStream*): Unit = js.native
}

