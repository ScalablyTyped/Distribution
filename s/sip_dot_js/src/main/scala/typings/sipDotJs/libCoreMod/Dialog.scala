package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Dialog")
@js.native
class Dialog protected ()
  extends typings.sipDotJs.libCoreDialogsMod.Dialog {
  /**
    * Dialog constructor.
    * @param core User agent core.
    * @param dialogState Initial dialog state.
    */
  protected def this(core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore, dialogState: DialogState) = this()
}

/* static members */
@JSImport("sip.js/lib/core", "Dialog")
@js.native
object Dialog extends js.Object {
  /**
    * When a UAC receives a response that establishes a dialog, it
    * constructs the state of the dialog.  This state MUST be maintained
    * for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.2
    * @param outgoingRequestMessage Outgoing request message for dialog.
    * @param incomingResponseMessage Incoming response message creating dialog.
    */
  def initialDialogStateForUserAgentClient(
    outgoingRequestMessage: typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage,
    incomingResponseMessage: typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
  ): DialogState = js.native
  /**
    * The UAS then constructs the state of the dialog.  This state MUST be
    * maintained for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.1
    * @param incomingRequestMessage Incoming request message creating dialog.
    * @param toTag Tag in the To field in the response to the incoming request.
    */
  def initialDialogStateForUserAgentServer(incomingRequestMessage: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage, toTag: String): DialogState = js.native
  def initialDialogStateForUserAgentServer(
    incomingRequestMessage: typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    toTag: String,
    early: Boolean
  ): DialogState = js.native
}

