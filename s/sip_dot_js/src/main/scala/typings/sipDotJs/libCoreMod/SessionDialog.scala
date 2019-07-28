package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends typings.sipDotJs.libCoreDialogsMod.SessionDialog {
  def this(
    initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction,
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction,
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState
  ) = this()
  def this(
    initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction,
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction,
    core: typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
}

