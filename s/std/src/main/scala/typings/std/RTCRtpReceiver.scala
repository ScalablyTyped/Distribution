package typings.std

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

object RTCRtpReceiver {
  @scala.inline
  def apply(
    getContributingSources: () => js.Array[RTCRtpContributingSource],
    getParameters: () => RTCRtpReceiveParameters,
    getStats: () => js.Promise[RTCStatsReport],
    getSynchronizationSources: () => js.Array[RTCRtpSynchronizationSource],
    track: MediaStreamTrack,
    rtcpTransport: RTCDtlsTransport = null,
    transport: RTCDtlsTransport = null
  ): RTCRtpReceiver = {
    val __obj = js.Dynamic.literal(getContributingSources = js.Any.fromFunction0(getContributingSources), getParameters = js.Any.fromFunction0(getParameters), getStats = js.Any.fromFunction0(getStats), getSynchronizationSources = js.Any.fromFunction0(getSynchronizationSources), track = track.asInstanceOf[js.Any], rtcpTransport = rtcpTransport.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpReceiver]
  }
}

