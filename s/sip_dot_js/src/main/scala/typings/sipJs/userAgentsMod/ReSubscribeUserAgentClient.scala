package typings.sipJs.userAgentsMod

import typings.sipJs.dialogsMod.SubscriptionDialog
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ReSubscribeUserAgentClient")
@js.native
class ReSubscribeUserAgentClient protected ()
  extends typings.sipJs.reSubscribeUserAgentClientMod.ReSubscribeUserAgentClient {
  def this(dialog: SubscriptionDialog) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SubscriptionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
  def this(dialog: SubscriptionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

