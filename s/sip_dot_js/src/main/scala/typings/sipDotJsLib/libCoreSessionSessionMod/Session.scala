package typings
package sipDotJsLib.libCoreSessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /** The current answer if signalingState is stable. Otherwise undefined. */
  val answer: js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  /** Call Id. */
  val callId: java.lang.String = js.native
  /** Session delegate. */
  var delegate: js.UndefOr[sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate] = js.native
  /** The session id. Equal to callId + localTag + remoteTag. */
  val id: java.lang.String = js.native
  /** Local Tag. */
  val localTag: java.lang.String = js.native
  /** Local URI. */
  val localURI: sipDotJsLib.libCoreMessagesMod.URI = js.native
  /** The current offer if signalingState is not initial or closed. Otherwise undefined. */
  val offer: js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  /** Remote Tag. */
  val remoteTag: java.lang.String = js.native
  /** Remote Target. */
  val remoteTarget: sipDotJsLib.libCoreMessagesMod.URI = js.native
  /** Remote URI. */
  val remoteURI: sipDotJsLib.libCoreMessagesMod.URI = js.native
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
  def bye(): sipDotJsLib.libCoreMessagesMethodsByeMod.OutgoingByeRequest = js.native
  def bye(delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate): sipDotJsLib.libCoreMessagesMethodsByeMod.OutgoingByeRequest = js.native
  def bye(
    delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsByeMod.OutgoingByeRequest = js.native
  /**
    * Destroy session.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Send an INFO request.
    * Exchange information during a session.
    * https://tools.ietf.org/html/rfc6086#section-4.2.1
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the BYE is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the BYE is received.
    */
  def info(): sipDotJsLib.libCoreMessagesMethodsInfoMod.OutgoingInfoRequest = js.native
  def info(delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate): sipDotJsLib.libCoreMessagesMethodsInfoMod.OutgoingInfoRequest = js.native
  def info(
    delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsInfoMod.OutgoingInfoRequest = js.native
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
  def invite(): sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest = js.native
  def invite(delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate): sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest = js.native
  def invite(
    delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest = js.native
  def notify(delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate): sipDotJsLib.libCoreMessagesMethodsNotifyMod.OutgoingNotifyRequest = js.native
  def notify(
    delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsNotifyMod.OutgoingNotifyRequest = js.native
  /**
    * Send PRACK request.
    * Acknowledge a reliable provisional response.
    * https://tools.ietf.org/html/rfc3262#section-4
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the PRACK is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the PRACK is received.
    */
  def prack(): sipDotJsLib.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest = js.native
  def prack(delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate): sipDotJsLib.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest = js.native
  def prack(
    delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsPrackMod.OutgoingPrackRequest = js.native
  /**
    * Send REFER request (in dialog).
    * Transfer a session.
    * https://tools.ietf.org/html/rfc3515#section-2.4.1
    * @param delegate Request delegate.
    * @param options Options bucket.
    * @returns A promise which resolves when a 2xx response to the REFER is received.
    * @throws {RequestFailedReason} If a non-2xx final response to the REFER is received.
    */
  def refer(): sipDotJsLib.libCoreMessagesMethodsReferMod.OutgoingReferRequest = js.native
  def refer(delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate): sipDotJsLib.libCoreMessagesMethodsReferMod.OutgoingReferRequest = js.native
  def refer(
    delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate,
    options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions
  ): sipDotJsLib.libCoreMessagesMethodsReferMod.OutgoingReferRequest = js.native
}

