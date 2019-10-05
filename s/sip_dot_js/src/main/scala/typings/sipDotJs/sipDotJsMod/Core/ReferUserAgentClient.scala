package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReferUserAgentClient")
@js.native
class ReferUserAgentClient protected ()
  extends typings.sipDotJs.libCoreMod.ReferUserAgentClient {
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

