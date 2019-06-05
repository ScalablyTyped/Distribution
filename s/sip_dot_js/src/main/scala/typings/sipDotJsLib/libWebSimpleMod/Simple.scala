package typings
package sipDotJsLib.libWebSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/Simple", "Simple")
@js.native
class Simple protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: js.Any) = this()
  var anonymous: scala.Boolean = js.native
  var audio: scala.Boolean = js.native
  var checkRegistration: js.Any = js.native
  var cleanupMedia: js.Any = js.native
  var destroyMedia: js.Any = js.native
  var logger: sipDotJsLib.libCoreMod.Logger = js.native
  var onAccepted: js.Any = js.native
  var onEnded: js.Any = js.native
  var onFailed: js.Any = js.native
  var onProgress: js.Any = js.native
  var options: js.Any = js.native
  var session: js.UndefOr[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  var setupLocalMedia: js.Any = js.native
  var setupRemoteMedia: js.Any = js.native
  var setupSession: js.Any = js.native
  var state: SimpleStatus = js.native
  var toggleMute: js.Any = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  var video: scala.Boolean = js.native
  def answer(): sipDotJsLib.libSessionMod.InviteServerContext | scala.Unit = js.native
  def call(destination: java.lang.String): sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext | scala.Unit = js.native
  def hangup(): js.UndefOr[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  def hold(): sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext | scala.Unit = js.native
  def message(destination: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def mute(): scala.Unit = js.native
  def reject(): js.UndefOr[sipDotJsLib.libSessionMod.InviteServerContext] = js.native
  def sendDTMF(tone: java.lang.String): scala.Unit = js.native
  def unhold(): sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext | scala.Unit = js.native
  def unmute(): scala.Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/Web/Simple", "Simple")
@js.native
object Simple extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SimpleStatus */ js.Any = js.native
}

