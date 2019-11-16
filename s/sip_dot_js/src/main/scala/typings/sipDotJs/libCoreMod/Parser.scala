package typings.sipDotJs.libCoreMod

import typings.sipDotJs.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(
    message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Anon_Error = js.native
  def parseHeader(
    message: typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Anon_Error = js.native
  def parseMessage(data: String, logger: typings.sipDotJs.libCoreLogLoggerMod.Logger): js.UndefOr[
    typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage | typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ] = js.native
}

