package typings.sipJs.libCoreMod

import typings.sipJs.libCoreDialogsDialogStateMod.DialogState
import typings.sipJs.libCoreSubscriptionSubscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SubscriptionDialog")
@js.native
open class SubscriptionDialog protected ()
  extends typings.sipJs.libCoreDialogsMod.SubscriptionDialog {
  def this(
    subscriptionEvent: String,
    subscriptionExpires: Double,
    subscriptionState: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    subscriptionEvent: String,
    subscriptionExpires: Double,
    subscriptionState: typings.sipJs.libCoreSubscriptionSubscriptionMod.SubscriptionState,
    core: typings.sipJs.libCoreUserAgentCoreUserAgentCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SubscriptionDelegate
  ) = this()
}
/* static members */
object SubscriptionDialog {
  
  @JSImport("sip.js/lib/core", "SubscriptionDialog")
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
    outgoingSubscribeRequestMessage: typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage,
    incomingNotifyRequestMessage: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
  ): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForSubscription")(outgoingSubscribeRequestMessage.asInstanceOf[js.Any], incomingNotifyRequestMessage.asInstanceOf[js.Any])).asInstanceOf[DialogState]
}
