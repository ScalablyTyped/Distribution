package typings.sipDotJs.sipDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sipDotJs.Anon_Body
import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import typings.sipDotJs.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.TransactionUser
import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod.UserAgentCoreConfiguration
import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashDelegateMod.UserAgentCoreDelegate
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.ClientTransactionConstructor
import typings.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core")
@js.native
object CoreNs extends js.Object {
  @js.native
  class ByeUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.ByeUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class ByeUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.ByeUserAgentServer {
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class CancelUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.CancelUserAgentClient {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @js.native
  abstract class ClientTransaction protected ()
    extends typings.sipDotJs.libCoreMod.ClientTransaction {
    protected def this(
      _request: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      transport: typings.sipDotJs.libCoreTransportMod.Transport,
      user: ClientTransactionUser,
      state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  class Dialog protected ()
    extends typings.sipDotJs.libCoreMod.Dialog {
    /**
      * Dialog constructor.
      * @param core - User agent core.
      * @param dialogState - Initial dialog state.
      */
    protected def this(core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore, dialogState: DialogState) = this()
  }
  
  @js.native
  class DigestAuthentication protected ()
    extends typings.sipDotJs.libCoreMod.DigestAuthentication {
    def this(loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory) = this()
    def this(loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory, username: String) = this()
    def this(
      loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory,
      username: js.UndefOr[scala.Nothing],
      password: String
    ) = this()
    /**
      * Constructor.
      * @param loggerFactory - LoggerFactory.
      * @param username - Username.
      * @param password - Password.
      */
    def this(loggerFactory: typings.sipDotJs.libCoreLogMod.LoggerFactory, username: String, password: String) = this()
  }
  
  @js.native
  abstract class Exception protected ()
    extends typings.sipDotJs.libCoreMod.Exception {
    protected def this(message: String) = this()
  }
  
  @js.native
  class IncomingMessage ()
    extends typings.sipDotJs.libCoreMod.IncomingMessage
  
  @js.native
  class IncomingRequestMessage ()
    extends typings.sipDotJs.libCoreMod.IncomingRequestMessage
  
  @js.native
  class IncomingResponseMessage ()
    extends typings.sipDotJs.libCoreMod.IncomingResponseMessage
  
  @js.native
  class InfoUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.InfoUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class InfoUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.InfoUserAgentServer {
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class InviteClientTransaction protected ()
    extends typings.sipDotJs.libCoreMod.InviteClientTransaction {
    /**
      * Constructor.
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1
      * @param request - The outgoing INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      transport: typings.sipDotJs.libCoreTransportMod.Transport,
      user: ClientTransactionUser
    ) = this()
  }
  
  @js.native
  class InviteServerTransaction protected ()
    extends typings.sipDotJs.libCoreMod.InviteServerTransaction {
    /**
      * Constructor.
      * Upon construction, a "100 Trying" reply will be immediately sent.
      * After construction the transaction will be in the "proceeding" state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.1
      * @param request - Incoming INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      transport: typings.sipDotJs.libCoreTransportMod.Transport,
      user: ServerTransactionUser
    ) = this()
  }
  
  @js.native
  class InviteUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.InviteUserAgentClient {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingInviteRequestDelegate
    ) = this()
  }
  
  @js.native
  class InviteUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.InviteUserAgentServer {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class Logger protected ()
    extends typings.sipDotJs.libCoreMod.Logger {
    def this(logger: typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory, category: String) = this()
    def this(
      logger: typings.sipDotJs.libCoreLogLoggerDashFactoryMod.LoggerFactory,
      category: String,
      label: String
    ) = this()
  }
  
  @js.native
  class LoggerFactory ()
    extends typings.sipDotJs.libCoreMod.LoggerFactory
  
  @js.native
  class MessageUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.MessageUserAgentClient {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @js.native
  class MessageUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.MessageUserAgentServer {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class NameAddrHeader protected ()
    extends typings.sipDotJs.libCoreMod.NameAddrHeader {
    /**
      * Constructor
      * @param uri -
      * @param displayName -
      * @param parameters -
      */
    def this(
      uri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      displayName: String,
      parameters: StringDictionary[String]
    ) = this()
  }
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends typings.sipDotJs.libCoreMod.NonInviteClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request - The outgoing Non-INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      transport: typings.sipDotJs.libCoreTransportMod.Transport,
      user: ClientTransactionUser
    ) = this()
  }
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends typings.sipDotJs.libCoreMod.NonInviteServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request - Incoming Non-INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      transport: typings.sipDotJs.libCoreTransportMod.Transport,
      user: ServerTransactionUser
    ) = this()
  }
  
  @js.native
  class NotifyUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.NotifyUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class NotifyUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.NotifyUserAgentServer {
    /**
      * NOTIFY UAS constructor.
      * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
      * @param message - Incoming NOTIFY request message.
      */
    def this(
      dialogOrCore: typings.sipDotJs.libCoreDialogsMod.Dialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialogOrCore: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialogOrCore: typings.sipDotJs.libCoreDialogsMod.Dialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
    def this(
      dialogOrCore: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class OutgoingRequestMessage protected ()
    extends typings.sipDotJs.libCoreMod.OutgoingRequestMessage {
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI
    ) = this()
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions
    ) = this()
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String]
    ) = this()
    def this(
      method: String,
      ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
      fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
      options: OutgoingRequestMessageOptions,
      extraHeaders: js.Array[String],
      body: Body
    ) = this()
  }
  
  @js.native
  class Parameters protected ()
    extends typings.sipDotJs.libCoreMod.Parameters {
    def this(parameters: StringDictionary[String]) = this()
  }
  
  @js.native
  class PrackUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.PrackUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class PrackUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.PrackUserAgentServer {
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class PublishUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.PublishUserAgentClient {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @js.native
  class ReInviteUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.ReInviteUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      delegate: OutgoingInviteRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class ReInviteUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.ReInviteUserAgentServer {
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class ReSubscribeUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.ReSubscribeUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog,
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class ReSubscribeUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.ReSubscribeUserAgentServer {
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.Dialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.Dialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class ReferUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.ReferUserAgentClient {
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
    def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(
      dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ) = this()
  }
  
  @js.native
  class ReferUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.ReferUserAgentServer {
    /**
      * REFER UAS constructor.
      * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
      * @param message - Incoming REFER request message.
      */
    def this(
      dialogOrCore: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialogOrCore: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      dialogOrCore: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
    def this(
      dialogOrCore: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class RegisterUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.RegisterUserAgentClient {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @js.native
  class RegisterUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.RegisterUserAgentServer {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  abstract class ServerTransaction protected ()
    extends typings.sipDotJs.libCoreMod.ServerTransaction {
    protected def this(
      _request: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      transport: typings.sipDotJs.libCoreTransportMod.Transport,
      user: ServerTransactionUser,
      state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  class SessionDialog protected ()
    extends typings.sipDotJs.libCoreMod.SessionDialog {
    def this(
      initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
    def this(
      initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
  }
  
  @js.native
  class SubscribeUserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.SubscribeUserAgentClient {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingSubscribeRequestDelegate
    ) = this()
  }
  
  @js.native
  class SubscribeUserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.SubscribeUserAgentServer {
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  @js.native
  class SubscriptionDialog protected ()
    extends typings.sipDotJs.libCoreMod.SubscriptionDialog {
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState,
      delegate: SubscriptionDelegate
    ) = this()
  }
  
  @js.native
  abstract class Transaction protected ()
    extends typings.sipDotJs.libCoreMod.Transaction {
    protected def this(
      _transport: typings.sipDotJs.libCoreTransportMod.Transport,
      _user: TransactionUser,
      _id: String,
      _state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  class TransactionStateError ()
    extends typings.sipDotJs.libCoreMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @js.native
  abstract class Transport protected ()
    extends typings.sipDotJs.libCoreMod.Transport {
    /**
      * Constructor
      * @param logger - Logger.
      * @param options - Options bucket. Deprecated.
      */
    def this(logger: typings.sipDotJs.libCoreLogMod.Logger) = this()
    def this(logger: typings.sipDotJs.libCoreLogMod.Logger, options: js.Any) = this()
  }
  
  @js.native
  class TransportError ()
    extends typings.sipDotJs.libCoreMod.TransportError {
    def this(message: String) = this()
  }
  
  @js.native
  class URI protected ()
    extends typings.sipDotJs.libCoreMod.URI {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
  }
  
  @js.native
  class UserAgentClient protected ()
    extends typings.sipDotJs.libCoreMod.UserAgentClient {
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @js.native
  class UserAgentCore protected ()
    extends typings.sipDotJs.libCoreMod.UserAgentCore {
    /**
      * Constructor.
      * @param configuration - Configuration.
      * @param delegate - Delegate.
      */
    def this(configuration: UserAgentCoreConfiguration) = this()
    def this(configuration: UserAgentCoreConfiguration, delegate: UserAgentCoreDelegate) = this()
  }
  
  @js.native
  class UserAgentServer protected ()
    extends typings.sipDotJs.libCoreMod.UserAgentServer {
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
      message: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
  
  def constructOutgoingResponse(
    message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: Anon_Body): Body = js.native
  def getBody(message: Body): js.UndefOr[Body] = js.native
  def getBody(message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(
    message: typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ): js.UndefOr[Body] = js.native
  def getBody(message: typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
  @JSName("C")
  @js.native
  object CNs extends js.Object {
    val ACK: typings.sipDotJs.sipDotJsStrings.ACK = js.native
    val BYE: typings.sipDotJs.sipDotJsStrings.BYE = js.native
    val CANCEL: typings.sipDotJs.sipDotJsStrings.CANCEL = js.native
    val INFO: typings.sipDotJs.sipDotJsStrings.INFO = js.native
    val INVITE: typings.sipDotJs.sipDotJsStrings.INVITE = js.native
    val MESSAGE: typings.sipDotJs.sipDotJsStrings.MESSAGE = js.native
    val NOTIFY: typings.sipDotJs.sipDotJsStrings.NOTIFY = js.native
    val OPTIONS: typings.sipDotJs.sipDotJsStrings.OPTIONS = js.native
    val PRACK: typings.sipDotJs.sipDotJsStrings.PRACK = js.native
    val PUBLISH: typings.sipDotJs.sipDotJsStrings.PUBLISH = js.native
    val REFER: typings.sipDotJs.sipDotJsStrings.REFER = js.native
    val REGISTER: typings.sipDotJs.sipDotJsStrings.REGISTER = js.native
    val SUBSCRIBE: typings.sipDotJs.sipDotJsStrings.SUBSCRIBE = js.native
    val UPDATE: typings.sipDotJs.sipDotJsStrings.UPDATE = js.native
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
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    def initialDialogStateForUserAgentClient(
      outgoingRequestMessage: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      incomingResponseMessage: typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
    ): DialogState = js.native
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage - Incoming request message creating dialog.
      * @param toTag - Tag in the To field in the response to the incoming request.
      */
    def initialDialogStateForUserAgentServer(incomingRequestMessage: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage, toTag: String): DialogState = js.native
    def initialDialogStateForUserAgentServer(
      incomingRequestMessage: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
      toTag: String,
      early: Boolean
    ): DialogState = js.native
  }
  
  @JSName("Grammar")
  @js.native
  object GrammarNs extends js.Object {
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    def URIParse(uri: String): js.UndefOr[typings.sipDotJs.libCoreMessagesUriMod.URI] = js.native
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[typings.sipDotJs.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    def parse(input: String, startRule: String): js.Any = js.native
  }
  
  @js.native
  object Levels extends js.Object {
    /* 3 */ val debug: typings.sipDotJs.libCoreLogLevelsMod.Levels.debug with Double = js.native
    /* 0 */ val error: typings.sipDotJs.libCoreLogLevelsMod.Levels.error with Double = js.native
    /* 2 */ val log: typings.sipDotJs.libCoreLogLevelsMod.Levels.log with Double = js.native
    /* 1 */ val warn: typings.sipDotJs.libCoreLogLevelsMod.Levels.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sipDotJs.libCoreLogLevelsMod.Levels with Double] = js.native
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
    /* "AckWait" */ val AckWait: typings.sipDotJs.libCoreSessionSessionMod.SessionState.AckWait with String = js.native
    /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Confirmed with String = js.native
    /* "Early" */ val Early: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Early with String = js.native
    /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Initial with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSessionSessionMod.SessionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.SessionState with String] = js.native
  }
  
  @js.native
  object SignalingState extends js.Object {
    /* "Closed" */ val Closed: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Closed with String = js.native
    /* "HaveLocalOffer" */ val HaveLocalOffer: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
    /* "Initial" */ val Initial: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Initial with String = js.native
    /* "Stable" */ val Stable: typings.sipDotJs.libCoreSessionSessionMod.SignalingState.Stable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.SignalingState with String] = js.native
  }
  
  /* static members */
  @js.native
  object SubscriptionDialog extends js.Object {
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
      incomingNotifyRequestMessage: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
    ): DialogState = js.native
  }
  
  @js.native
  object SubscriptionState extends js.Object {
    /* "Active" */ val Active: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Active with String = js.native
    /* "Initial" */ val Initial: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Initial with String = js.native
    /* "NotifyWait" */ val NotifyWait: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.NotifyWait with String = js.native
    /* "Pending" */ val Pending: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Pending with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState with String
      ] = js.native
  }
  
  @js.native
  object Timers extends js.Object {
    var PROVISIONAL_RESPONSE_INTERVAL: Double = js.native
    var T1: Double = js.native
    var T2: Double = js.native
    var T4: Double = js.native
    var TIMER_B: Double = js.native
    var TIMER_D: Double = js.native
    var TIMER_F: Double = js.native
    var TIMER_H: Double = js.native
    var TIMER_I: Double = js.native
    var TIMER_J: Double = js.native
    var TIMER_K: Double = js.native
    var TIMER_L: Double = js.native
    var TIMER_M: Double = js.native
    var TIMER_N: Double = js.native
  }
  
  @js.native
  object TransactionState extends js.Object {
    /* "Accepted" */ val Accepted: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with String = js.native
    /* "Calling" */ val Calling: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with String = js.native
    /* "Completed" */ val Completed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with String = js.native
    /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with String = js.native
    /* "Proceeding" */ val Proceeding: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with String = js.native
    /* "Trying" */ val Trying: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState with String
      ] = js.native
  }
  
}

