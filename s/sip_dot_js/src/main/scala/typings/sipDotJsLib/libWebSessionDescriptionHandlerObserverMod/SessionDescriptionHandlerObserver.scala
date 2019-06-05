package typings
package sipDotJsLib.libWebSessionDescriptionHandlerObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/SessionDescriptionHandlerObserver", "SessionDescriptionHandlerObserver")
@js.native
class SessionDescriptionHandlerObserver protected () extends js.Object {
  def this(session: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any) = this()
  def this(session: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any) = this()
  var options: js.Any = js.native
  var session: js.Any = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def directionChanged(): scala.Unit = js.native
  def trackAdded(): scala.Unit = js.native
}

