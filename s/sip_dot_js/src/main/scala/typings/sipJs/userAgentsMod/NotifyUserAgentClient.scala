package typings.sipJs.userAgentsMod

import typings.sipJs.dialogsMod.SessionDialog
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "NotifyUserAgentClient")
@js.native
class NotifyUserAgentClient protected ()
  extends typings.sipJs.notifyUserAgentClientMod.NotifyUserAgentClient {
  def this(dialog: SessionDialog) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(dialog: SessionDialog, delegate: js.UndefOr[scala.Nothing], options: RequestOptions) = this()
  def this(dialog: SessionDialog, delegate: OutgoingRequestDelegate, options: RequestOptions) = this()
}

