package typings.sipJs.mod.Core

import typings.sipJs.dialogStateMod.DialogState
import typings.sipJs.subscriptionSubscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.SubscriptionDialog")
@js.native
class SubscriptionDialog protected ()
  extends typings.sipJs.coreMod.SubscriptionDialog {
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
object SubscriptionDialog {
  
  /**
    * When a UAC receives a response that establishes a dialog, it
    * constructs the state of the dialog.  This state MUST be maintained
    * for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.2
    * @param outgoingRequestMessage - Outgoing request message for dialog.
    * @param incomingResponseMessage - Incoming response message creating dialog.
    */
  @JSImport("sip.js", "Core.SubscriptionDialog.initialDialogStateForSubscription")
  @js.native
  def initialDialogStateForSubscription(
    outgoingSubscribeRequestMessage: typings.sipJs.messagesMod.OutgoingRequestMessage,
    incomingNotifyRequestMessage: typings.sipJs.messagesMod.IncomingRequestMessage
  ): DialogState = js.native
}
