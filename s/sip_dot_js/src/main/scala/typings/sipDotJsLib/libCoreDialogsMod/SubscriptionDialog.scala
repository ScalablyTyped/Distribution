package typings
package sipDotJsLib.libCoreDialogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/dialogs", "SubscriptionDialog")
@js.native
class SubscriptionDialog protected ()
  extends sipDotJsLib.libCoreDialogsSubscriptionDashDialogMod.SubscriptionDialog {
  def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(subscriptionEvent: java.lang.String, subscriptionExpires: scala.Double, subscriptionState: sipDotJsLib.libCoreSubscriptionSubscriptionMod.SubscriptionState, core: sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSubscriptionSubscriptionDashDelegateMod.SubscriptionDelegate) = this()
}

/* static members */
@JSImport("sip.js/lib/Core/dialogs", "SubscriptionDialog")
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
    outgoingSubscribeRequestMessage: sipDotJsLib.libSIPMessageMod.OutgoingRequest,
    incomingNotifyRequestMessage: sipDotJsLib.libSIPMessageMod.IncomingRequest
  ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
}

