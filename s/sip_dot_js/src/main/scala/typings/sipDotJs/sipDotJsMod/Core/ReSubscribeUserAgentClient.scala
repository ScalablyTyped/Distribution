package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typings.sipDotJs.libCoreMod.ReSubscribeUserAgentClient {
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog) = this()
  def this(dialog: typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typings.sipDotJs.libCoreDialogsMod.SubscriptionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

