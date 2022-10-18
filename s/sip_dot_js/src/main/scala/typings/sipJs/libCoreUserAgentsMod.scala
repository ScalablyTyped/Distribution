package typings.sipJs

import typings.sipJs.libCoreDialogsMod.Dialog
import typings.sipJs.libCoreDialogsMod.SessionDialog
import typings.sipJs.libCoreDialogsMod.SubscriptionDialog
import typings.sipJs.libCoreMessagesIncomingRequestMod.IncomingRequestDelegate
import typings.sipJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipJs.libCoreMessagesOutgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.libCoreMessagesOutgoingRequestMod.RequestOptions
import typings.sipJs.libCoreUserAgentCoreMod.UserAgentCore
import typings.sipJs.libCoreUserAgentsUserAgentClientMod.ClientTransactionConstructor
import typings.sipJs.libCoreUserAgentsUserAgentServerMod.ServerTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentsMod {
  
  @JSImport("sip.js/lib/core/user-agents", "ByeUserAgentClient")
  @js.native
  open class ByeUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsByeUserAgentClientMod.ByeUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ByeUserAgentServer")
  @js.native
  open class ByeUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsByeUserAgentServerMod.ByeUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
  @js.native
  open class CancelUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsCancelUserAgentClientMod.CancelUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InfoUserAgentClient")
  @js.native
  open class InfoUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsInfoUserAgentClientMod.InfoUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InfoUserAgentServer")
  @js.native
  open class InfoUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsInfoUserAgentServerMod.InfoUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InviteUserAgentClient")
  @js.native
  open class InviteUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsInviteUserAgentClientMod.InviteUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InviteUserAgentServer")
  @js.native
  open class InviteUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsInviteUserAgentServerMod.InviteUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "MessageUserAgentClient")
  @js.native
  open class MessageUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsMessageUserAgentClientMod.MessageUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "MessageUserAgentServer")
  @js.native
  open class MessageUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsMessageUserAgentServerMod.MessageUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentClient")
  @js.native
  open class NotifyUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsNotifyUserAgentClientMod.NotifyUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentServer")
  @js.native
  open class NotifyUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsNotifyUserAgentServerMod.NotifyUserAgentServer {
    /**
      * NOTIFY UAS constructor.
      * @param dialogOrCore - Dialog for in dialog NOTIFY, UserAgentCore for out of dialog NOTIFY (deprecated).
      * @param message - Incoming NOTIFY request message.
      */
    def this(dialogOrCore: Dialog, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PrackUserAgentClient")
  @js.native
  open class PrackUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsPrackUserAgentClientMod.PrackUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PrackUserAgentServer")
  @js.native
  open class PrackUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsPrackUserAgentServerMod.PrackUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PublishUserAgentClient")
  @js.native
  open class PublishUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsPublishUserAgentClientMod.PublishUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentClient")
  @js.native
  open class ReInviteUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsReInviteUserAgentClientMod.ReInviteUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentServer")
  @js.native
  open class ReInviteUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsReInviteUserAgentServerMod.ReInviteUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
  @js.native
  open class ReSubscribeUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsReSubscribeUserAgentClientMod.ReSubscribeUserAgentClient {
    def this(dialog: SubscriptionDialog) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SubscriptionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentServer")
  @js.native
  open class ReSubscribeUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsReSubscribeUserAgentServerMod.ReSubscribeUserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReferUserAgentClient")
  @js.native
  open class ReferUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsReferUserAgentClientMod.ReferUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReferUserAgentServer")
  @js.native
  open class ReferUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsReferUserAgentServerMod.ReferUserAgentServer {
    /**
      * REFER UAS constructor.
      * @param dialogOrCore - Dialog for in dialog REFER, UserAgentCore for out of dialog REFER.
      * @param message - Incoming REFER request message.
      */
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(dialogOrCore: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
    def this(dialogOrCore: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentClient")
  @js.native
  open class RegisterUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsRegisterUserAgentClientMod.RegisterUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentServer")
  @js.native
  open class RegisterUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsRegisterUserAgentServerMod.RegisterUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
  @js.native
  open class SubscribeUserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsSubscribeUserAgentClientMod.SubscribeUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentServer")
  @js.native
  open class SubscribeUserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsSubscribeUserAgentServerMod.SubscribeUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
  @js.native
  open class UserAgentClient protected ()
    extends typings.sipJs.libCoreUserAgentsUserAgentClientMod.UserAgentClient {
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: UserAgentCore,
      message: OutgoingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ClientTransactionConstructor,
      core: UserAgentCore,
      message: OutgoingRequestMessage,
      delegate: OutgoingRequestDelegate
    ) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "UserAgentServer")
  @js.native
  open class UserAgentServer protected ()
    extends typings.sipJs.libCoreUserAgentsUserAgentServerMod.UserAgentServer {
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: UserAgentCore,
      message: IncomingRequestMessage
    ) = this()
    def this(
      transactionConstructor: ServerTransactionConstructor,
      core: UserAgentCore,
      message: IncomingRequestMessage,
      delegate: IncomingRequestDelegate
    ) = this()
  }
}
