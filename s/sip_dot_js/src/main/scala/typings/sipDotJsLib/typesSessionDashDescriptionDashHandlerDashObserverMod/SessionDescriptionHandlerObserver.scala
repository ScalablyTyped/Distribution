package typings
package sipDotJsLib.typesSessionDashDescriptionDashHandlerDashObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session-description-handler-observer", "SessionDescriptionHandlerObserver")
@js.native
class SessionDescriptionHandlerObserver protected () extends js.Object {
  def this(session: sipDotJsLib.typesSessionMod.InviteClientContext, options: js.Any) = this()
  def this(session: sipDotJsLib.typesSessionMod.InviteServerContext, options: js.Any) = this()
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def directionChanged(): scala.Unit = js.native
  def trackAdded(): scala.Unit = js.native
}

