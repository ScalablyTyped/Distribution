package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpReceiver extends js.Object {
  val rtcpTransport: RTCDtlsTransport | scala.Null
  val track: MediaStreamTrack
  val transport: RTCDtlsTransport | scala.Null
  def getContributingSources(): Array[RTCRtpContributingSource]
  def getParameters(): RTCRtpReceiveParameters
  def getStats(): Promise[RTCStatsReport]
  def getSynchronizationSources(): Array[RTCRtpSynchronizationSource]
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver
  extends org.scalablytyped.runtime.Instantiable0[RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): atSindresorhusIsLib.RTCRtpCapabilities | scala.Null = js.native
}

