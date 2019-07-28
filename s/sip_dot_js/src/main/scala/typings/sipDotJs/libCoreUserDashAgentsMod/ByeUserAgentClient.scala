package typings.sipDotJs.libCoreUserDashAgentsMod

import typings.sipDotJs.libCoreDialogsMod.SessionDialog
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ByeUserAgentClient")
@js.native
class ByeUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsByeDashUserDashAgentDashClientMod.ByeUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

