package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SubscriptionDialog")
@js.native
class SubscriptionDialog protected ()
  extends sipDotJsLib.libCoreDialogsMod.SubscriptionDialog {
  def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate) = this()
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
    * @param outgoingRequestMessage Outgoing request message for dialog.
    * @param incomingResponseMessage Incoming response message creating dialog.
    */
  def initialDialogStateForSubscription(
    outgoingSubscribeRequestMessage: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage,
    incomingNotifyRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage
  ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
}

