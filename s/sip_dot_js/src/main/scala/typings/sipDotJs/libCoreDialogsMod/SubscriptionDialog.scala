package typings.sipDotJs.libCoreDialogsMod

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate
import typings.sipDotJs.libCoreSubscriptionSubscriptionMod.SubscriptionState
import typings.sipDotJs.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs", "SubscriptionDialog")
@js.native
class SubscriptionDialog protected ()
  extends typings.sipDotJs.libCoreDialogsSubscriptionDashDialogMod.SubscriptionDialog {
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
@JSImport("sip.js/lib/core/dialogs", "SubscriptionDialog")
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
    outgoingSubscribeRequestMessage: OutgoingRequestMessage,
    incomingNotifyRequestMessage: IncomingRequestMessage
  ): DialogState = js.native
}

