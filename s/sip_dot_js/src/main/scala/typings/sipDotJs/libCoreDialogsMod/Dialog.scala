package typings.sipDotJs.libCoreDialogsMod

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs", "Dialog")
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

/* static members */
@JSImport("sip.js/lib/core/dialogs", "Dialog")
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

