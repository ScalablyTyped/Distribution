package typings.sipJs.inviteMod

import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.prackMod.OutgoingPrackRequest
import typings.sipJs.sessionSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrackableIncomingResponseWithSession extends IncomingResponse {
  
  /**
    * Send an PRACK to acknowledge this response.
    * @param options - Request options bucket.
    */
  def prack(): OutgoingPrackRequest = js.native
  def prack(options: RequestOptions): OutgoingPrackRequest = js.native
  
  /** Session associated with outgoing request progress. If out of dialog request, an early dialog. */
  val session: Session = js.native
}
