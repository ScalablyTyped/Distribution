package typings.sipJs.coreMod

import typings.sipJs.dialogStateMod.DialogState
import typings.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SubscriptionDialog")
@js.native
class SubscriptionDialog protected ()
  extends typings.sipJs.dialogsMod.SubscriptionDialog {
  def this(
    subscriptionEvent: String,
    subscriptionExpires: Double,
    subscriptionState: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState,
    core: typings.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    subscriptionEvent: String,
    subscriptionExpires: Double,
    subscriptionState: typings.sipJs.subscriptionSubscriptionMod.SubscriptionState,
    core: typings.sipJs.userAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SubscriptionDelegate
  ) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "SubscriptionDialog")
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
    outgoingSubscribeRequestMessage: typings.sipJs.messagesMod.OutgoingRequestMessage,
    incomingNotifyRequestMessage: typings.sipJs.messagesMod.IncomingRequestMessage
  ): DialogState = js.native
}

