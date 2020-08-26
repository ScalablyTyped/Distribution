package typings.sipJs.mod.Core

import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.NotifyUserAgentClient")
@js.native
class NotifyUserAgentClient protected ()
  extends typings.sipJs.coreMod.NotifyUserAgentClient {
  def this(dialog: typings.sipJs.dialogsMod.SessionDialog) = this()
  def this(dialog: typings.sipJs.dialogsMod.SessionDialog, delegate: OutgoingRequestDelegate) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    delegate: js.UndefOr[scala.Nothing],
    options: RequestOptions
  ) = this()
  def this(
    dialog: typings.sipJs.dialogsMod.SessionDialog,
    delegate: OutgoingRequestDelegate,
    options: RequestOptions
  ) = this()
}

