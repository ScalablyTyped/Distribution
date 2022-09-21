package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to control and obtain details about how a particular MediaStreamTrack is encoded and sent to a remote peer. */
@js.native
trait RTCRtpSender extends StObject {
  
  /* standard dom */
  val dtmf: RTCDTMFSender | Null = js.native
  
  /* standard dom */
  def getParameters(): RTCRtpSendParameters = js.native
  
  /* standard dom */
  def getStats(): js.Promise[RTCStatsReport] = js.native
  
  /* standard dom */
  def replaceTrack(): js.Promise[Unit] = js.native
  def replaceTrack(withTrack: MediaStreamTrack): js.Promise[Unit] = js.native
  
  /* standard dom */
  def setParameters(parameters: RTCRtpSendParameters): js.Promise[Unit] = js.native
  
  /* standard dom */
  def setStreams(streams: MediaStream*): Unit = js.native
  
  /* standard dom */
  val track: MediaStreamTrack | Null = js.native
  
  /* standard dom */
  val transport: RTCDtlsTransport | Null = js.native
}
