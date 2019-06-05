package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core")
@js.native
object CoreNs extends js.Object {
  @js.native
  class ByeUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.ByeUserAgentClient {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  }
  
  @js.native
  class ByeUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.ByeUserAgentServer {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class CancelUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.CancelUserAgentClient {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  }
  
  @js.native
  abstract class ClientTransaction protected ()
    extends sipDotJsLib.libCoreMod.ClientTransaction {
    protected def this(_request: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser, state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
  }
  
  @js.native
  class Dialog protected ()
    extends sipDotJsLib.libCoreMod.Dialog {
    /**
      * Dialog constructor.
      * @param core User agent core.
      * @param dialogState Initial dialog state.
      */
    protected def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, dialogState: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  }
  
  @js.native
  class DigestAuthentication protected ()
    extends sipDotJsLib.libCoreMod.DigestAuthentication {
    def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory) = this()
    def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory, username: java.lang.String) = this()
    def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory, username: js.UndefOr[scala.Nothing], password: java.lang.String) = this()
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory, username: java.lang.String, password: java.lang.String) = this()
  }
  
  @js.native
  abstract class Exception protected ()
    extends sipDotJsLib.libCoreMod.Exception {
    protected def this(message: java.lang.String) = this()
  }
  
  @js.native
  class IncomingMessage ()
    extends sipDotJsLib.libCoreMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends sipDotJsLib.libCoreMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends sipDotJsLib.libCoreMod.IncomingResponseMessage
  
  @js.native
  class InfoUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.InfoUserAgentServer {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class InviteClientTransaction protected ()
    extends sipDotJsLib.libCoreMod.InviteClientTransaction {
    /**
      * Constructor.
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1
      * @param request The outgoing INVITE request.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser) = this()
  }
  
  @js.native
  class InviteServerTransaction protected ()
    extends sipDotJsLib.libCoreMod.InviteServerTransaction {
    /**
      * Constructor.
      * Upon construction, a "100 Trying" reply will be immediately sent.
      * After construction the transaction will be in the "proceeding" state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.1
      * @param request Incoming INVITE request from the transport.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser) = this()
  }
  
  @js.native
  class InviteUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.InviteUserAgentClient {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate) = this()
  }
  
  @js.native
  class InviteUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.InviteUserAgentServer {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class Logger protected ()
    extends sipDotJsLib.libCoreMod.Logger {
    def this(logger: sipDotJsLib.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: java.lang.String) = this()
    def this(logger: sipDotJsLib.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: java.lang.String, label: java.lang.String) = this()
  }
  
  @js.native
  class LoggerFactory ()
    extends sipDotJsLib.libCoreMod.LoggerFactory
  
  @js.native
  class MessageUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.MessageUserAgentClient {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  }
  
  @js.native
  class MessageUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.MessageUserAgentServer {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class NameAddrHeader protected ()
    extends sipDotJsLib.libCoreMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri
      * @param displayName
      * @param parameters
      */
    def this(uri: sipDotJsLib.libCoreMessagesUriMod.URI, displayName: java.lang.String, parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  }
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends sipDotJsLib.libCoreMod.NonInviteClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request The outgoing Non-INVITE request.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser) = this()
  }
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends sipDotJsLib.libCoreMod.NonInviteServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request Incoming Non-INVITE request from the transport.
      * @param transport The transport.
      * @param user The transaction user.
      */
    def this(request: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser) = this()
  }
  
  @js.native
  class NotifyUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.NotifyUserAgentClient {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  }
  
  @js.native
  class NotifyUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.NotifyUserAgentServer {
    /**
      * NOTIFY UAS constructor.
      * @param dialogOrCore Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
      * @param message Incoming NOTIFY request message.
      */
    def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
    def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class OutgoingRequestMessage protected ()
    extends sipDotJsLib.libCoreMod.OutgoingRequestMessage {
    def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI) = this()
    def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions) = this()
    def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions, extraHeaders: js.Array[java.lang.String]) = this()
    def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions, extraHeaders: js.Array[java.lang.String], body: sipDotJsLib.libCoreMessagesBodyMod.Body) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends sipDotJsLib.libCoreMod.Parameters {
    def this(parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  }
  
  @js.native
  class PrackUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.PrackUserAgentClient {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  }
  
  @js.native
  class PrackUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.PrackUserAgentServer {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class PublishUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.PublishUserAgentClient {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  }
  
  @js.native
  class ReInviteUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.ReInviteUserAgentClient {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  }
  
  @js.native
  class ReInviteUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.ReInviteUserAgentServer {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class ReSubscribeUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.ReSubscribeUserAgentClient {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SubscriptionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  }
  
  @js.native
  class ReSubscribeUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.ReSubscribeUserAgentServer {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.Dialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class ReferUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.ReferUserAgentClient {
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
    def this(dialog: sipDotJsLib.libCoreDialogsMod.SessionDialog, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions) = this()
  }
  
  @js.native
  class ReferUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.ReferUserAgentServer {
    /**
      * REFER UAS constructor.
      * @param dialogOrCore Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
      * @param message Incoming REFER request message.
      */
    def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(dialogOrCore: sipDotJsLib.libCoreDialogsMod.SessionDialog, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
    def this(dialogOrCore: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class RegisterUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.RegisterUserAgentClient {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  }
  
  @js.native
  abstract class ServerTransaction protected ()
    extends sipDotJsLib.libCoreMod.ServerTransaction {
    protected def this(_request: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser, state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
  }
  
  @js.native
  class SessionDialog protected ()
    extends sipDotJsLib.libCoreMod.SessionDialog {
    def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
    def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
    def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate) = this()
    def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate) = this()
  }
  
  @js.native
  class SubscribeUserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.SubscribeUserAgentClient {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate) = this()
  }
  
  @js.native
  class SubscribeUserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.SubscribeUserAgentServer {
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  @js.native
  class SubscriptionDialog protected ()
    extends sipDotJsLib.libCoreMod.SubscriptionDialog {
    def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
    def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate) = this()
  }
  
  @js.native
  abstract class Transaction protected ()
    extends sipDotJsLib.libCoreMod.Transaction {
    protected def this(_transport: sipDotJsLib.libCoreTransportMod.Transport, _user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.TransactionUser, _id: java.lang.String, _state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
  }
  
  @js.native
  class TransactionStateError ()
    extends sipDotJsLib.libCoreMod.TransactionStateError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  abstract class Transport protected ()
    extends sipDotJsLib.libCoreMod.Transport {
    def this(logger: sipDotJsLib.libCoreLogMod.Logger, options: js.Any) = this()
  }
  
  @js.native
  class TransportError ()
    extends sipDotJsLib.libCoreMod.TransportError {
    def this(message: java.lang.String) = this()
  }
  
  @js.native
  class URI protected ()
    extends sipDotJsLib.libCoreMod.URI {
    /**
      * Constructor
      * @param scheme
      * @param user
      * @param host
      * @param port
      * @param parameters
      * @param headers
      */
    def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String) = this()
    def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double) = this()
    def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double, parameters: js.Any) = this()
    def this(scheme: java.lang.String, user: java.lang.String, host: java.lang.String, port: scala.Double, parameters: js.Any, headers: js.Any) = this()
  }
  
  @js.native
  class UserAgentClient protected ()
    extends sipDotJsLib.libCoreMod.UserAgentClient {
    def this(transactionConstructor: sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod.ClientTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
    def this(transactionConstructor: sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod.ClientTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  }
  
  @js.native
  class UserAgentCore protected ()
    extends sipDotJsLib.libCoreMod.UserAgentCore {
    /**
      * Constructor.
      * @param configuration Configuration.
      * @param delegate Delegate.
      */
    def this(configuration: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.UserAgentCoreConfiguration) = this()
    def this(configuration: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.UserAgentCoreConfiguration, delegate: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashDelegateMod.UserAgentCoreDelegate) = this()
  }
  
  @js.native
  class UserAgentServer protected ()
    extends sipDotJsLib.libCoreMod.UserAgentServer {
    def this(transactionConstructor: sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage) = this()
    def this(transactionConstructor: sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  }
  
  def constructOutgoingResponse(
    message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
  ): sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: java.lang.String): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def fromBodyLegacy(bodyLegacy: sipDotJsLib.Anon_BodyContentType): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesBodyMod.OutgoingResponseBody): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean = js.native
  @JSName("C")
  @js.native
  object CNs extends js.Object {
    val ACK: sipDotJsLib.sipDotJsLibStrings.ACK = js.native
    val BYE: sipDotJsLib.sipDotJsLibStrings.BYE = js.native
    val CANCEL: sipDotJsLib.sipDotJsLibStrings.CANCEL = js.native
    val INFO: sipDotJsLib.sipDotJsLibStrings.INFO = js.native
    val INVITE: sipDotJsLib.sipDotJsLibStrings.INVITE = js.native
    val MESSAGE: sipDotJsLib.sipDotJsLibStrings.MESSAGE = js.native
    val NOTIFY: sipDotJsLib.sipDotJsLibStrings.NOTIFY = js.native
    val OPTIONS: sipDotJsLib.sipDotJsLibStrings.OPTIONS = js.native
    val PRACK: sipDotJsLib.sipDotJsLibStrings.PRACK = js.native
    val PUBLISH: sipDotJsLib.sipDotJsLibStrings.PUBLISH = js.native
    val REFER: sipDotJsLib.sipDotJsLibStrings.REFER = js.native
    val REGISTER: sipDotJsLib.sipDotJsLibStrings.REGISTER = js.native
    val SUBSCRIBE: sipDotJsLib.sipDotJsLibStrings.SUBSCRIBE = js.native
    val UPDATE: sipDotJsLib.sipDotJsLibStrings.UPDATE = js.native
  }
  
  /* static members */
  @js.native
  object ClientTransaction extends js.Object {
    var makeId: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Dialog extends js.Object {
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage Outgoing request message for dialog.
      * @param incomingResponseMessage Incoming response message creating dialog.
      */
    def initialDialogStateForUserAgentClient(
      outgoingRequestMessage: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage,
      incomingResponseMessage: sipDotJsLib.libCoreMessagesMod.IncomingResponseMessage
    ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage Incoming request message creating dialog.
      * @param toTag Tag in the To field in the response to the incoming request.
      */
    def initialDialogStateForUserAgentServer(
      incomingRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage,
      toTag: java.lang.String
    ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
    def initialDialogStateForUserAgentServer(
      incomingRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage,
      toTag: java.lang.String,
      early: scala.Boolean
    ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
  }
  
  @JSName("Grammar")
  @js.native
  object GrammarNs extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesUriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    def parse(input: java.lang.String, startRule: java.lang.String): js.Any = js.native
  }
  
  @js.native
  object Levels extends js.Object {
    /* 3 */ val debug: sipDotJsLib.libCoreLogLevelsMod.Levels.debug with scala.Double = js.native
    /* 0 */ val error: sipDotJsLib.libCoreLogLevelsMod.Levels.error with scala.Double = js.native
    /* 2 */ val log: sipDotJsLib.libCoreLogLevelsMod.Levels.log with scala.Double = js.native
    /* 1 */ val warn: sipDotJsLib.libCoreLogLevelsMod.Levels.warn with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[sipDotJsLib.libCoreLogLevelsMod.Levels with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object OutgoingRequestMessage extends js.Object {
    /** Get a copy of the default options. */
    var getDefaultOptions: js.Any = js.native
    var makeNameAddrHeader: js.Any = js.native
  }
  
  @js.native
  object SessionState extends js.Object {
    /* "AckWait" */ val AckWait: sipDotJsLib.libCoreSessionSessionMod.SessionState.AckWait with java.lang.String = js.native
    /* "Confirmed" */ val Confirmed: sipDotJsLib.libCoreSessionSessionMod.SessionState.Confirmed with java.lang.String = js.native
    /* "Early" */ val Early: sipDotJsLib.libCoreSessionSessionMod.SessionState.Early with java.lang.String = js.native
    /* "Initial" */ val Initial: sipDotJsLib.libCoreSessionSessionMod.SessionState.Initial with java.lang.String = js.native
    /* "Terminated" */ val Terminated: sipDotJsLib.libCoreSessionSessionMod.SessionState.Terminated with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.SessionState with java.lang.String] = js.native
  }
  
  @js.native
  object SignalingState extends js.Object {
    /* "Closed" */ val Closed: sipDotJsLib.libCoreSessionSessionMod.SignalingState.Closed with java.lang.String = js.native
    /* "HaveLocalOffer" */ val HaveLocalOffer: sipDotJsLib.libCoreSessionSessionMod.SignalingState.HaveLocalOffer with java.lang.String = js.native
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: sipDotJsLib.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer with java.lang.String = js.native
    /* "Initial" */ val Initial: sipDotJsLib.libCoreSessionSessionMod.SignalingState.Initial with java.lang.String = js.native
    /* "Stable" */ val Stable: sipDotJsLib.libCoreSessionSessionMod.SignalingState.Stable with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.SignalingState with java.lang.String] = js.native
  }
  
  /* static members */
  @js.native
  object SubscriptionDialog extends js.Object {
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage Outgoing request message for dialog.
      * @param incomingResponseMessage Incoming response message creating dialog.
      */
    def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage,
      incomingNotifyRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage
    ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
  }
  
  @js.native
  object SubscriptionState extends js.Object {
    /* "Active" */ val Active: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active with java.lang.String = js.native
    /* "Initial" */ val Initial: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial with java.lang.String = js.native
    /* "NotifyWait" */ val NotifyWait: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait with java.lang.String = js.native
    /* "Pending" */ val Pending: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending with java.lang.String = js.native
    /* "Terminated" */ val Terminated: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState with java.lang.String
      ] = js.native
  }
  
  @js.native
  object Timers extends js.Object {
    var PROVISIONAL_RESPONSE_INTERVAL: scala.Double = js.native
    var T1: scala.Double = js.native
    var T2: scala.Double = js.native
    var T4: scala.Double = js.native
    var TIMER_B: scala.Double = js.native
    var TIMER_D: scala.Double = js.native
    var TIMER_F: scala.Double = js.native
    var TIMER_H: scala.Double = js.native
    var TIMER_I: scala.Double = js.native
    var TIMER_J: scala.Double = js.native
    var TIMER_K: scala.Double = js.native
    var TIMER_L: scala.Double = js.native
    var TIMER_M: scala.Double = js.native
    var TIMER_N: scala.Double = js.native
  }
  
  @js.native
  object TransactionState extends js.Object {
    /* "Accepted" */ val Accepted: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with java.lang.String = js.native
    /* "Calling" */ val Calling: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with java.lang.String = js.native
    /* "Completed" */ val Completed: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with java.lang.String = js.native
    /* "Confirmed" */ val Confirmed: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with java.lang.String = js.native
    /* "Proceeding" */ val Proceeding: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with java.lang.String = js.native
    /* "Terminated" */ val Terminated: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with java.lang.String = js.native
    /* "Trying" */ val Trying: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState with java.lang.String
      ] = js.native
  }
  
}

