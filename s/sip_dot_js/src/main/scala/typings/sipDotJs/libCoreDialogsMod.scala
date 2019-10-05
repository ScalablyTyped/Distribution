package typings.sipDotJs

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import typings.sipDotJs.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate
import typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState
import typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction
import typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs", JSImport.Namespace)
@js.native
object libCoreDialogsMod extends js.Object {
  @js.native
  class Dialog protected ()
    extends typings.sipDotJs.libCoreDialogsDialogMod.Dialog {
    /**
      * Dialog constructor.
      * @param core - User agent core.
      * @param dialogState - Initial dialog state.
      */
    protected def this(core: UserAgentCore, dialogState: DialogState) = this()
  }
  
  @js.native
  class SessionDialog protected ()
    extends typings.sipDotJs.libCoreDialogsSessionDashDialogMod.SessionDialog {
    def this(initialTransaction: InviteClientTransaction, core: UserAgentCore, state: DialogState) = this()
    def this(initialTransaction: InviteServerTransaction, core: UserAgentCore, state: DialogState) = this()
    def this(
      initialTransaction: InviteClientTransaction,
      core: UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
    def this(
      initialTransaction: InviteServerTransaction,
      core: UserAgentCore,
      state: DialogState,
      delegate: SessionDelegate
    ) = this()
  }
  
  @js.native
  class SubscriptionDialog protected ()
    extends typings.sipDotJs.libCoreDialogsSubscriptionDashDialogMod.SubscriptionDialog {
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore,
      state: DialogState,
      delegate: SubscriptionDelegate
    ) = this()
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
    def initialDialogStateForUserAgentClient(outgoingRequestMessage: OutgoingRequestMessage, incomingResponseMessage: IncomingResponseMessage): DialogState = js.native
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage - Incoming request message creating dialog.
      * @param toTag - Tag in the To field in the response to the incoming request.
      */
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String): DialogState = js.native
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String, early: Boolean): DialogState = js.native
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
      outgoingSubscribeRequestMessage: OutgoingRequestMessage,
      incomingNotifyRequestMessage: IncomingRequestMessage
    ): DialogState = js.native
  }
  
}

