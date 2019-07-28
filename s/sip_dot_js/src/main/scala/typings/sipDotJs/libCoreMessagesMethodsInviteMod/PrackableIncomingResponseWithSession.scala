package typings.sipDotJs.libCoreMessagesMethodsInviteMod

import typings.sipDotJs.libCoreMessagesIncomingDashResponseMod.IncomingResponse
import typings.sipDotJs.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreSessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrackableIncomingResponseWithSession extends IncomingResponse {
  /** Session associated with outgoing request progress. If out of dialog request, an early dialog. */
  val session: Session = js.native
  /**
    * Send an PRACK to acknowledge this response.
    * @param options Request options bucket.
    */
  def prack(): OutgoingPrackRequest = js.native
  def prack(options: RequestOptions): OutgoingPrackRequest = js.native
}

