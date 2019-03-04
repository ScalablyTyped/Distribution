package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.typesServerDashContextMod.ServerContext because Inheritance from two classes. Inlined request, transaction, progress, progress, accept, accept, reject, reject, reply, reply, onRequestTimeout, onTransportError */ @JSImport("sip.js/types/session", "InviteServerContext")
@js.native
class InviteServerContext protected () extends Session {
  def this(ua: sipDotJsLib.typesUaMod.UA, request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest) = this()
  var request: sipDotJsLib.typesSipDashMessageMod.IncomingMessage | sipDotJsLib.typesSipDashMessageMod.IncomingRequest = js.native
  var transaction: sipDotJsLib.typesTransactionsMod.InviteServerTransaction | sipDotJsLib.typesTransactionsMod.NonInviteServerTransaction = js.native
   // TODO
  def accept(): this.type = js.native
  def accept(options: js.Any): this.type = js.native
  def accept(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): this.type = js.native
  def accept(
    options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): this.type = js.native
  def progress(): this.type = js.native
  def progress(options: js.Any): this.type = js.native
  def progress(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): this.type = js.native
   // TODO
  def reject(): this.type = js.native
  def reject(options: js.Any): this.type = js.native
  def reject(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): this.type = js.native
   // TODO
  def reply(): this.type = js.native
  def reply(options: js.Any): this.type = js.native
  def reply(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): this.type = js.native
}

