package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/Modifiers", JSImport.Namespace)
@js.native
object libWebModifiersMod extends js.Object {
  def addMidLines(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def cleanJitsiSdpImageattr(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def stripG722(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def stripRtpPayload(payload: java.lang.String): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
  def stripTcpCandidates(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def stripTelephoneEvent(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def stripVideo(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
}

