package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ByeUserAgentClient")
@js.native
class ByeUserAgentClient protected ()
  extends typings.sipDotJs.libCoreUserDashAgentsMod.ByeUserAgentClient {
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

