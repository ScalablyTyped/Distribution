package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SubscriptionDialog")
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

/* static members */
@JSImport("sip.js", "Core.SubscriptionDialog")
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

