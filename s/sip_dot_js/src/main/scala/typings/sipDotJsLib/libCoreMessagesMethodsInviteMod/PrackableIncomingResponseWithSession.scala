package typings
package sipDotJsLib.libCoreMessagesMethodsInviteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrackableIncomingResponseWithSession
  extends sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse {
  /** Session associated with outgoing request progress. If out of dialog request, an early dialog. */
  val session: sipDotJsLib.libCoreSessionSessionMod.Session = js.native
  /**
    * Send an PRACK to acknowledge this response.
    * @param options Request options bucket.
    */
  def prack(): sipDotJsLib.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest = js.native
  def prack(options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions): sipDotJsLib.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest = js.native
}

