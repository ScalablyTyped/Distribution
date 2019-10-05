package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typings.sipDotJs.libCoreMod.ReInviteUserAgentClient {
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}

