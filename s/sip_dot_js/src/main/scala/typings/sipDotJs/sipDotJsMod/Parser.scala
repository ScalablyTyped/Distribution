package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.Anon_Error
import typings.sipDotJs.libCoreLogLoggerMod.Logger
import typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(message: IncomingRequestMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Anon_Error = js.native
  def parseHeader(message: IncomingResponseMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Anon_Error = js.native
  def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = js.native
}

