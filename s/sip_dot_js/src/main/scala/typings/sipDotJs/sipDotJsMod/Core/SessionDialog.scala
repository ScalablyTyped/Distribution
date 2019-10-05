package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.SessionDialog")
@js.native
class SessionDialog protected ()
  extends typings.sipDotJs.libCoreMod.SessionDialog {
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

