package typings.sipJs

import typings.sipJs.libCoreDialogsDialogStateMod.DialogState
import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesIncomingResponseMessageMod.IncomingResponseMessage
import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessage
import typings.sipJs.libCoreSessionSessionDelegateMod.SessionDelegate
import typings.sipJs.libCoreSubscriptionSubscriptionDelegateMod.SubscriptionDelegate
import typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState
import typings.sipJs.libCoreTransactionsInviteClientTransactionMod.InviteClientTransaction
import typings.sipJs.libCoreTransactionsInviteServerTransactionMod.InviteServerTransaction
import typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreDialogsMod {
  
  @JSImport("sip.js/lib/core/dialogs", "Dialog")
  @js.native
  open class Dialog protected ()
    extends typings.sipJs.libCoreDialogsDialogMod.Dialog {
    /**
      * Dialog constructor.
      * @param core - User agent core.
      * @param dialogState - Initial dialog state.
      */
    /* protected */ def this(core: UserAgentCore, dialogState: DialogState) = this()
  }
  /* static members */
  object Dialog {
    
    @JSImport("sip.js/lib/core/dialogs", "Dialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    inline def initialDialogStateForUserAgentClient(outgoingRequestMessage: OutgoingRequestMessage, incomingResponseMessage: IncomingResponseMessage): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForUserAgentClient")(outgoingRequestMessage.asInstanceOf[js.Any], incomingResponseMessage.asInstanceOf[js.Any])).asInstanceOf[DialogState]
    
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage - Incoming request message creating dialog.
      * @param toTag - Tag in the To field in the response to the incoming request.
      */
    inline def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForUserAgentServer")(incomingRequestMessage.asInstanceOf[js.Any], toTag.asInstanceOf[js.Any])).asInstanceOf[DialogState]
    inline def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String, early: Boolean): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForUserAgentServer")(incomingRequestMessage.asInstanceOf[js.Any], toTag.asInstanceOf[js.Any], early.asInstanceOf[js.Any])).asInstanceOf[DialogState]
  }
  
  @JSImport("sip.js/lib/core/dialogs", "SessionDialog")
  @js.native
  open class SessionDialog protected ()
    extends typings.sipJs.libCoreDialogsSessionDialogMod.SessionDialog {
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
  
  @JSImport("sip.js/lib/core/dialogs", "SubscriptionDialog")
  @js.native
  open class SubscriptionDialog protected ()
    extends typings.sipJs.libCoreDialogsSubscriptionDialogMod.SubscriptionDialog {
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: UserAgentCore,
      state: DialogState
    ) = this()
    def this(
      subscriptionEvent: String,
      subscriptionExpires: Double,
      subscriptionState: SubscriptionState,
      core: UserAgentCore,
      state: DialogState,
      delegate: SubscriptionDelegate
    ) = this()
  }
  /* static members */
  object SubscriptionDialog {
    
    @JSImport("sip.js/lib/core/dialogs", "SubscriptionDialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    inline def initialDialogStateForSubscription(
      outgoingSubscribeRequestMessage: OutgoingRequestMessage,
      incomingNotifyRequestMessage: IncomingRequestMessage
    ): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForSubscription")(outgoingSubscribeRequestMessage.asInstanceOf[js.Any], incomingNotifyRequestMessage.asInstanceOf[js.Any])).asInstanceOf[DialogState]
  }
}
