package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends sipDotJsLib.libCoreDialogsMod.SessionDialog {
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate) = this()
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate) = this()
}

