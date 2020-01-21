package typings.sipJs.mod.Core

import typings.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.getBody")
@js.native
object getBody extends js.Object {
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(message: typings.sipJs.incomingResponseMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def apply(message: typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
}

