package typings
package sipDotJsLib.typesSessionDtmfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/Session/dtmf", "DTMF")
@js.native
class DTMF protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(session: sipDotJsLib.typesSessionMod.Session) = this()
  def this(session: sipDotJsLib.typesSessionMod.Session, tone: java.lang.String) = this()
  def this(session: sipDotJsLib.typesSessionMod.Session, tone: scala.Double) = this()
  def this(session: sipDotJsLib.typesSessionMod.Session, tone: java.lang.String, options: js.Any) = this()
  def this(session: sipDotJsLib.typesSessionMod.Session, tone: scala.Double, options: js.Any) = this()
  var duration: scala.Double = js.native
  var interToneGap: scala.Double = js.native
  var tone: java.lang.String = js.native
  def init_incoming(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def send(options: js.Any): scala.Unit = js.native
}

