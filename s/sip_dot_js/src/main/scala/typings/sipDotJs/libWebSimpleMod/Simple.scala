package typings.sipDotJs.libWebSimpleMod

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libUAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/Simple", "Simple")
@js.native
class Simple protected () extends EventEmitter {
  def this(options: js.Any) = this()
  var anonymous: Boolean = js.native
  var audio: Boolean = js.native
  var checkRegistration: js.Any = js.native
  var cleanupMedia: js.Any = js.native
  var destroyMedia: js.Any = js.native
  var logger: Logger = js.native
  var onAccepted: js.Any = js.native
  var onEnded: js.Any = js.native
  var onFailed: js.Any = js.native
  var onProgress: js.Any = js.native
  var options: js.Any = js.native
  var session: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var setupLocalMedia: js.Any = js.native
  var setupRemoteMedia: js.Any = js.native
  var setupSession: js.Any = js.native
  var state: SimpleStatus = js.native
  var toggleMute: js.Any = js.native
  var ua: UA = js.native
  var video: Boolean = js.native
  def answer(): InviteServerContext | Unit = js.native
  def call(destination: String): InviteClientContext | InviteServerContext | Unit = js.native
  def hangup(): js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  def hold(): InviteClientContext | InviteServerContext | Unit = js.native
  def message(destination: String, message: String): Unit = js.native
  def mute(): Unit = js.native
  def reject(): js.UndefOr[InviteServerContext] = js.native
  def sendDTMF(tone: String): Unit = js.native
  def unhold(): InviteClientContext | InviteServerContext | Unit = js.native
  def unmute(): Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/Web/Simple", "Simple")
@js.native
object Simple extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SimpleStatus */ js.Any = js.native
}

