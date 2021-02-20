package typings.sipJs.mod.Core

import typings.sipJs.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSImport("sip.js", "Core.Parser.getHeader")
  @js.native
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  
  @JSImport("sip.js", "Core.Parser.parseHeader")
  @js.native
  def parseHeader(
    message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Error = js.native
  @JSImport("sip.js", "Core.Parser.parseHeader")
  @js.native
  def parseHeader(
    message: typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: Double,
    headerEnd: Double
  ): Boolean | Error = js.native
  
  @JSImport("sip.js", "Core.Parser.parseMessage")
  @js.native
  def parseMessage(data: String, logger: typings.sipJs.loggerMod.Logger): js.UndefOr[
    typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage | typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage
  ] = js.native
}
