package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session", "InviteServerContext")
@js.native
class InviteServerContext () extends Session {
  def accept(): InviteServerContext = js.native
  def accept(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): InviteServerContext = js.native
  def accept(
    options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): InviteServerContext = js.native
  @JSName("on")
  def on_progress(
    name: sipDotJsLib.sipDotJsLibStrings.progress,
    callback: js.Function2[/* response */ js.Any, /* reasonPhrase */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def progress(): InviteServerContext = js.native
  def progress(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): InviteServerContext = js.native
  def reject(): InviteServerContext = js.native
  def reject(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): InviteServerContext = js.native
  def reply(): InviteServerContext = js.native
  def reply(options: sipDotJsLib.typesSessionMod.InviteServerContextNs.Options): InviteServerContext = js.native
}

