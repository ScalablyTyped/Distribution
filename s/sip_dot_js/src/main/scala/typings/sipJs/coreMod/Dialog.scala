package typings.sipJs.coreMod

import typings.sipJs.dialogStateMod.DialogState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "Dialog")
@js.native
class Dialog protected ()
  extends typings.sipJs.dialogsMod.Dialog {
  /**
    * Dialog constructor.
    * @param core - User agent core.
    * @param dialogState - Initial dialog state.
    */
  protected def this(core: typings.sipJs.userAgentCoreMod.UserAgentCore, dialogState: DialogState) = this()
}
/* static members */
object Dialog {
  
  @JSImport("sip.js/lib/core", "Dialog")
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
  @scala.inline
  def initialDialogStateForUserAgentClient(
    outgoingRequestMessage: typings.sipJs.messagesMod.OutgoingRequestMessage,
    incomingResponseMessage: typings.sipJs.messagesMod.IncomingResponseMessage
  ): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForUserAgentClient")(outgoingRequestMessage.asInstanceOf[js.Any], incomingResponseMessage.asInstanceOf[js.Any])).asInstanceOf[DialogState]
  
  /**
    * The UAS then constructs the state of the dialog.  This state MUST be
    * maintained for the duration of the dialog.
    * https://tools.ietf.org/html/rfc3261#section-12.1.1
    * @param incomingRequestMessage - Incoming request message creating dialog.
    * @param toTag - Tag in the To field in the response to the incoming request.
    */
  @scala.inline
  def initialDialogStateForUserAgentServer(incomingRequestMessage: typings.sipJs.messagesMod.IncomingRequestMessage, toTag: String): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForUserAgentServer")(incomingRequestMessage.asInstanceOf[js.Any], toTag.asInstanceOf[js.Any])).asInstanceOf[DialogState]
  @scala.inline
  def initialDialogStateForUserAgentServer(
    incomingRequestMessage: typings.sipJs.messagesMod.IncomingRequestMessage,
    toTag: String,
    early: Boolean
  ): DialogState = (^.asInstanceOf[js.Dynamic].applyDynamic("initialDialogStateForUserAgentServer")(incomingRequestMessage.asInstanceOf[js.Any], toTag.asInstanceOf[js.Any], early.asInstanceOf[js.Any])).asInstanceOf[DialogState]
}
