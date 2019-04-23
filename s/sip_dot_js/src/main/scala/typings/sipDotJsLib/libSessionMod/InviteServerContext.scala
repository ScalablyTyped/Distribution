package typings
package sipDotJsLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libServerContextMod.ServerContext because Inheritance from two classes. Inlined request, transaction, progress, progress, accept, accept, reject, reject, reply, reply, onRequestTimeout, onTransportError */ @JSImport("sip.js/lib/Session", "InviteServerContext")
@js.native
class InviteServerContext protected () extends Session {
  def this(ua: sipDotJsLib.libUAMod.UA, request: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  var request: sipDotJsLib.libSIPMessageMod.IncomingRequest = js.native
  var setupSessionDescriptionHandler: js.Any = js.native
  var transaction: sipDotJsLib.libTransactionsMod.InviteServerTransaction | sipDotJsLib.libTransactionsMod.NonInviteServerTransaction = js.native
  def accept(): this.type = js.native
  def accept(options: js.Any): js.Any = js.native
  def accept(options: sipDotJsLib.libSessionMod.InviteServerContextNs.Options): this.type = js.native
  @JSName("accept")
  def accept_Any(): js.Any = js.native
  def progress(): this.type = js.native
  def progress(options: js.Any): js.Any = js.native
  def progress(options: sipDotJsLib.libSessionMod.InviteServerContextNs.Options): this.type = js.native
  @JSName("progress")
  def progress_Any(): js.Any = js.native
  def reject(): this.type = js.native
  def reject(options: js.Any): js.Any = js.native
  def reject(options: sipDotJsLib.libSessionMod.InviteServerContextNs.Options): this.type = js.native
  @JSName("reject")
  def reject_Any(): js.Any = js.native
  def reply(): this.type = js.native
  def reply(options: js.Any): this.type = js.native
  @JSName("reply")
  def reply_Any(): js.Any = js.native
  @JSName("reply")
  def reply_Any(options: js.Any): js.Any = js.native
}

