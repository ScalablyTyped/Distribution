package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Dialog")
@js.native
class Dialog protected ()
  extends sipDotJsLib.libCoreDialogsMod.Dialog {
  /**
    * Dialog constructor.
    * @param core User agent core.
    * @param dialogState Initial dialog state.
    */
  protected def this(core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, dialogState: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
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
    outgoingRequestMessage: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage,
    incomingResponseMessage: sipDotJsLib.libCoreMessagesMod.IncomingResponseMessage
  ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
  /**
    * The UAS then constructs the state of the dialog.  This state MUST be
    * maintained for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.1
    * @param incomingRequestMessage Incoming request message creating dialog.
    * @param toTag Tag in the To field in the response to the incoming request.
    */
  def initialDialogStateForUserAgentServer(
    incomingRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage,
    toTag: java.lang.String
  ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
  def initialDialogStateForUserAgentServer(
    incomingRequestMessage: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage,
    toTag: java.lang.String,
    early: scala.Boolean
  ): sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState = js.native
}

