package typings
package sipDotJsLib.libSessionDTMFMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session/DTMF", "DTMF")
@js.native
class DTMF protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(session: sipDotJsLib.libSessionMod.Session, tone: java.lang.String) = this()
  def this(session: sipDotJsLib.libSessionMod.Session, tone: scala.Double) = this()
  def this(session: sipDotJsLib.libSessionMod.Session, tone: java.lang.String, options: js.Any) = this()
  def this(session: sipDotJsLib.libSessionMod.Session, tone: scala.Double, options: js.Any) = this()
  var C: js.Any = js.native
  var duration: scala.Double = js.native
  var interToneGap: scala.Double = js.native
  var logger: js.Any = js.native
  var owner: js.Any = js.native
  var tone: java.lang.String = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def init_incoming(request: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest): scala.Unit = js.native
  def onDialogError(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  def receiveResponse(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def send(options: js.Any): scala.Unit = js.native
}

