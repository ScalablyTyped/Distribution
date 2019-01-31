package typings
package sipDotJsLib.typesWebSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/Web/simple", "Simple")
@js.native
class Simple protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: js.Any) = this()
  var anonymous: scala.Boolean = js.native
  var audio: scala.Boolean = js.native
  var logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  var options: js.Any = js.native
  var session: js.UndefOr[
    sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext
  ] = js.native
  var state: SimpleStatus = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  var video: scala.Boolean = js.native
  def answer(): sipDotJsLib.typesSessionMod.InviteServerContext | scala.Unit = js.native
  def call(destination: java.lang.String): sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext | scala.Unit = js.native
  def hangup(): js.UndefOr[
    sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext
  ] = js.native
  def hold(): sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext | scala.Unit = js.native
  def message(destination: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def mute(): scala.Unit = js.native
  def reject(): js.UndefOr[sipDotJsLib.typesSessionMod.InviteServerContext] = js.native
  def sendDTMF(tone: java.lang.String): scala.Unit = js.native
  def unhold(): sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext | scala.Unit = js.native
  def unmute(): scala.Unit = js.native
}

@JSImport("sip.js/types/Web/simple", "Simple")
@js.native
object Simple extends js.Object {
  val C: sipDotJsLib.typesWebSimpleMod.SimpleStatus = js.native
}

