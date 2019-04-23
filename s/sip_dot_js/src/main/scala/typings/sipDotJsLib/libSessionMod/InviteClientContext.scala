package typings
package sipDotJsLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- sipDotJsLib.libClientContextMod.ClientContext because Inheritance from two classes. Inlined request, send, receiveResponse, onRequestTimeout, onTransportError */ @JSImport("sip.js/lib/Session", "InviteClientContext")
@js.native
class InviteClientContext protected () extends Session {
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, options: js.Any, modifiers: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI, options: js.Any, modifiers: js.Any) = this()
  var anonymous: js.Any = js.native
  var cancelReason: js.Any = js.native
  var inviteWithoutSdp: js.Any = js.native
  var isCanceled: js.Any = js.native
  var received100: js.Any = js.native
  var request: sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def cancel(): this.type = js.native
  def cancel(options: js.Any): this.type = js.native
  def invite(): this.type = js.native
  def receiveInviteResponse(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def receiveResponse(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def send(): this.type = js.native
}

