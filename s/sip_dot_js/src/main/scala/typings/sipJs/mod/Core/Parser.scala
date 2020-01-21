package typings.sipJs.mod.Core

import typings.sipJs.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Parser")
@js.native
object Parser extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(
    message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | AnonError = js.native
  def parseHeader(
    message: typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | AnonError = js.native
  def parseMessage(data: String, logger: typings.sipJs.loggerMod.Logger): js.UndefOr[
    typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  ] = js.native
}

