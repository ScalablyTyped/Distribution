package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashClientMod.ReInviteUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: OutgoingInviteRequestDelegate, options: RequestOptions) = this()
}

