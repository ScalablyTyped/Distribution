package typings.sipDotJs.libCoreMessagesIncomingDashRequestMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.URI
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingRequest extends js.Object {
  /** Delegate providing custom handling of this incoming request. */
  var delegate: js.UndefOr[IncomingRequestDelegate] = js.native
  /** The incoming message. */
  val message: IncomingRequestMessage = js.native
  /**
    * Send a 2xx positive final response to this request. Defaults to 200.
    * @param options - Response options bucket.
    */
  def accept(): OutgoingResponse = js.native
  def accept(options: ResponseOptions): OutgoingResponse = js.native
  /**
    * Send a 1xx provisional response to this request. Defaults to 180. Excludes 100.
    * Note that per RFC 4320, this method may only be used to respond to INVITE requests.
    * @param options - Response options bucket.
    */
  def progress(): OutgoingResponse = js.native
  def progress(options: ResponseOptions): OutgoingResponse = js.native
  /**
    * Send a 3xx negative final response to this request. Defaults to 302.
    * @param contacts - Contacts to redirect the UAC to.
    * @param options - Response options bucket.
    */
  def redirect(contacts: js.Array[URI]): OutgoingResponse = js.native
  def redirect(contacts: js.Array[URI], options: ResponseOptions): OutgoingResponse = js.native
  /**
    * Send a 4xx, 5xx, or 6xx negative final response to this request. Defaults to 480.
    * @param options -  Response options bucket.
    */
  def reject(): OutgoingResponse = js.native
  def reject(options: ResponseOptions): OutgoingResponse = js.native
  /**
    * Send a 100 outgoing response to this request.
    * @param options - Response options bucket.
    */
  def trying(): OutgoingResponse = js.native
  def trying(options: ResponseOptions): OutgoingResponse = js.native
}

