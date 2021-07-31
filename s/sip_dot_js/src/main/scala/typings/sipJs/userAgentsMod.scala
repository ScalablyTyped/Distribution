package typings.sipJs

import typings.sipJs.dialogsMod.Dialog
import typings.sipJs.dialogsMod.SessionDialog
import typings.sipJs.dialogsMod.SubscriptionDialog
import typings.sipJs.incomingRequestMod.IncomingRequestDelegate
import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typings.sipJs.userAgentClientMod.ClientTransactionConstructor
import typings.sipJs.userAgentCoreMod.UserAgentCore
import typings.sipJs.userAgentServerMod.ServerTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userAgentsMod {
  
  @JSImport("sip.js/lib/core/user-agents", "ByeUserAgentClient")
  @js.native
  class ByeUserAgentClient protected ()
    extends typings.sipJs.byeUserAgentClientMod.ByeUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ByeUserAgentServer")
  @js.native
  class ByeUserAgentServer protected ()
    extends typings.sipJs.byeUserAgentServerMod.ByeUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
  @js.native
  class CancelUserAgentClient protected ()
    extends typings.sipJs.cancelUserAgentClientMod.CancelUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InfoUserAgentClient")
  @js.native
  class InfoUserAgentClient protected ()
    extends typings.sipJs.infoUserAgentClientMod.InfoUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InfoUserAgentServer")
  @js.native
  class InfoUserAgentServer protected ()
    extends typings.sipJs.infoUserAgentServerMod.InfoUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InviteUserAgentClient")
  @js.native
  class InviteUserAgentClient protected ()
    extends typings.sipJs.inviteUserAgentClientMod.InviteUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingInviteRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "InviteUserAgentServer")
  @js.native
  class InviteUserAgentServer protected ()
    extends typings.sipJs.inviteUserAgentServerMod.InviteUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "MessageUserAgentClient")
  @js.native
  class MessageUserAgentClient protected ()
    extends typings.sipJs.messageUserAgentClientMod.MessageUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "MessageUserAgentServer")
  @js.native
  class MessageUserAgentServer protected ()
    extends typings.sipJs.messageUserAgentServerMod.MessageUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentClient")
  @js.native
  class NotifyUserAgentClient protected ()
    extends typings.sipJs.notifyUserAgentClientMod.NotifyUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentServer")
  @js.native
  class NotifyUserAgentServer protected ()
    extends typings.sipJs.notifyUserAgentServerMod.NotifyUserAgentServer {
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
  class PrackUserAgentClient protected ()
    extends typings.sipJs.prackUserAgentClientMod.PrackUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PrackUserAgentServer")
  @js.native
  class PrackUserAgentServer protected ()
    extends typings.sipJs.prackUserAgentServerMod.PrackUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "PublishUserAgentClient")
  @js.native
  class PublishUserAgentClient protected ()
    extends typings.sipJs.publishUserAgentClientMod.PublishUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentClient")
  @js.native
  class ReInviteUserAgentClient protected ()
    extends typings.sipJs.reInviteUserAgentClientMod.ReInviteUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentServer")
  @js.native
  class ReInviteUserAgentServer protected ()
    extends typings.sipJs.reInviteUserAgentServerMod.ReInviteUserAgentServer {
    def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
    def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
  @js.native
  class ReSubscribeUserAgentClient protected ()
    extends typings.sipJs.reSubscribeUserAgentClientMod.ReSubscribeUserAgentClient {
    def this(dialog: SubscriptionDialog) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SubscriptionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentServer")
  @js.native
  class ReSubscribeUserAgentServer protected ()
    extends typings.sipJs.reSubscribeUserAgentServerMod.ReSubscribeUserAgentServer {
    def this(dialog: Dialog, message: IncomingRequestMessage) = this()
    def this(dialog: Dialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReferUserAgentClient")
  @js.native
  class ReferUserAgentClient protected ()
    extends typings.sipJs.referUserAgentClientMod.ReferUserAgentClient {
    def this(dialog: SessionDialog) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
    def this(dialog: SessionDialog, delegate: Unit, options: RequestOptions) = this()
    def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "ReferUserAgentServer")
  @js.native
  class ReferUserAgentServer protected ()
    extends typings.sipJs.referUserAgentServerMod.ReferUserAgentServer {
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
  class RegisterUserAgentClient protected ()
    extends typings.sipJs.registerUserAgentClientMod.RegisterUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentServer")
  @js.native
  class RegisterUserAgentServer protected ()
    extends typings.sipJs.registerUserAgentServerMod.RegisterUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
  @js.native
  class SubscribeUserAgentClient protected ()
    extends typings.sipJs.subscribeUserAgentClientMod.SubscribeUserAgentClient {
    def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
    def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentServer")
  @js.native
  class SubscribeUserAgentServer protected ()
    extends typings.sipJs.subscribeUserAgentServerMod.SubscribeUserAgentServer {
    def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
    def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
  }
  
  @JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
  @js.native
  class UserAgentClient protected ()
    extends typings.sipJs.userAgentClientMod.UserAgentClient {
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
  class UserAgentServer protected ()
    extends typings.sipJs.userAgentServerMod.UserAgentServer {
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
