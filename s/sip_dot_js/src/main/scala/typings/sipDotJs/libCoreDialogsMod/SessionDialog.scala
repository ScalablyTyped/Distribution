package typings.sipDotJs.libCoreDialogsMod

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction
import typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends typings.sipDotJs.libCoreDialogsSessionDashDialogMod.SessionDialog {
  def this(initialTransaction: InviteClientTransaction, core: UserAgentCore, state: DialogState) = this()
  def this(initialTransaction: InviteServerTransaction, core: UserAgentCore, state: DialogState) = this()
  def this(
    initialTransaction: InviteClientTransaction,
    core: UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: InviteServerTransaction,
    core: UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}

