package typings.sipJs.coreMod

import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ReInviteUserAgentClient")
@js.native
class ReInviteUserAgentClient protected ()
  extends typings.sipJs.userAgentsMod.ReInviteUserAgentClient {
  def this(dialog: typings.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipJs.dialogsMod.SessionDialog, delegate: OutgoingInviteRequestDelegate) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingInviteRequestDelegate,
    options: RequestOptions
  ) = this()
}

