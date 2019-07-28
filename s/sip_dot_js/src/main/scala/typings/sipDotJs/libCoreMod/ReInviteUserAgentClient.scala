package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsMod.ReInviteUserAgentClient {
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}

