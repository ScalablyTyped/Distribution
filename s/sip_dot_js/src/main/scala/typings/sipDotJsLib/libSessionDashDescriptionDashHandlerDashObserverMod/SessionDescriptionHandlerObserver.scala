package typings
package sipDotJsLib.libSessionDashDescriptionDashHandlerDashObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/session-description-handler-observer", "SessionDescriptionHandlerObserver")
@js.native
class SessionDescriptionHandlerObserver protected () extends js.Object {
  def this(session: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any) = this()
  def this(session: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any) = this()
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def directionChanged(): scala.Unit = js.native
  def trackAdded(): scala.Unit = js.native
}

