package typings.sipDotJs.libCoreSessionSessionMod

import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesMethodsByeMod.OutgoingByeRequest
import typings.sipDotJs.libCoreMessagesMethodsInfoMod.OutgoingInfoRequest
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.OutgoingNotifyRequest
import typings.sipDotJs.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest
import typings.sipDotJs.libCoreMessagesMethodsReferMod.OutgoingReferRequest
import typings.sipDotJs.libCoreMessagesMod.URI
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /** The current answer if signalingState is stable. Otherwise undefined. */
  val answer: js.UndefOr[Body] = js.native
  /** Call Id. */
  val callId: String = js.native
  /** Session delegate. */
  var delegate: js.UndefOr[SessionDelegate] = js.native
  /** The session id. Equal to callId + localTag + remoteTag. */
  val id: String = js.native
  /** Local Tag. */
  val localTag: String = js.native
  /** Local URI. */
  val localURI: URI = js.native
  /** The current offer if signalingState is not initial or closed. Otherwise undefined. */
  val offer: js.UndefOr[Body] = js.native
  /** Remote Tag. */
  val remoteTag: String = js.native
  /** Remote Target. */
  val remoteTarget: URI = js.native
  /** Remote URI. */
  val remoteURI: URI = js.native
  /** Session state. */
  val sessionState: SessionState = js.native
  /** Current state of the offer/answer exchange. */
  val signalingState: SignalingState = js.native
  /**
    * Send a BYE request.
    * Terminating a session.
    * https://tools.ietf.org/html/rfc3261#section-15
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the BYE is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the BYE is received.
    */
  def bye(): OutgoingByeRequest = js.native
  def bye(delegate: OutgoingRequestDelegate): OutgoingByeRequest = js.native
  def bye(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingByeRequest = js.native
  /**
    * Destroy session.
    */
  def dispose(): Unit = js.native
  /**
    * Send an INFO request.
    * Exchange information during a session.
    * https://tools.ietf.org/html/rfc6086#section-4.2.1
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the BYE is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the BYE is received.
    */
  def info(): OutgoingInfoRequest = js.native
  def info(delegate: OutgoingRequestDelegate): OutgoingInfoRequest = js.native
  def info(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingInfoRequest = js.native
  /**
    * Send re-INVITE request.
    * Modifying a session.
    * https://tools.ietf.org/html/rfc3261#section-14.1
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the INVITE is received.
    * @throws {PendingRequestError} If there is a re-invite "pending".
    * @throws {RequestFailedReason} If a non-2xx final response to the INVITE is received.
    */
  def invite(): OutgoingInviteRequest = js.native
  def invite(delegate: OutgoingInviteRequestDelegate): OutgoingInviteRequest = js.native
  def invite(delegate: OutgoingInviteRequestDelegate, options: RequestOptions): OutgoingInviteRequest = js.native
  def notify(delegate: OutgoingRequestDelegate): OutgoingNotifyRequest = js.native
  def notify(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingNotifyRequest = js.native
  /**
    * Send PRACK request.
    * Acknowledge a reliable provisional response.
    * https://tools.ietf.org/html/rfc3262#section-4
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the PRACK is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the PRACK is received.
    */
  def prack(): OutgoingPrackRequest = js.native
  def prack(delegate: OutgoingRequestDelegate): OutgoingPrackRequest = js.native
  def prack(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingPrackRequest = js.native
  /**
    * Send REFER request (in dialog).
    * Transfer a session.
    * https://tools.ietf.org/html/rfc3515#section-2.4.1
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the REFER is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the REFER is received.
    */
  def refer(): OutgoingReferRequest = js.native
  def refer(delegate: OutgoingRequestDelegate): OutgoingReferRequest = js.native
  def refer(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingReferRequest = js.native
}

