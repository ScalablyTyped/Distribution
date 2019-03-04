package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.typesClientDashContextMod.ClientContext because Inheritance from two classes. Inlined request, send, receiveResponse, onRequestTimeout, onTransportError */ @JSImport("sip.js/types/session", "InviteClientContext")
@js.native
class InviteClientContext protected () extends Session {
  def this(ua: sipDotJsLib.typesUaMod.UA, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: sipDotJsLib.typesUriMod.URI) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: sipDotJsLib.typesUriMod.URI, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: java.lang.String, options: js.Any, modifiers: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: sipDotJsLib.typesUriMod.URI, options: js.Any, modifiers: js.Any) = this()
  var request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest = js.native
  def cancel(): this.type = js.native
  def cancel(options: js.Any): this.type = js.native
  def invite(): this.type = js.native
  def receiveInviteResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def receiveNonInviteResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def receiveResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def send(): this.type = js.native
}

