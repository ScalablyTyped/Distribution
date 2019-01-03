package typings
package sipDotJsLib.typesEventDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/event-emitter", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  def addListener(`type`: java.lang.String, listener: js.Any): scala.Unit = js.native
  def emit(`type`: java.lang.String, restOfEvent: js.Any*): js.Any = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* any */ js.Any, scala.Unit]): scala.Unit = js.native
  def once(`type`: java.lang.String, listener: js.Any): scala.Unit = js.native
  def removeAllListeners(`type`: java.lang.String): scala.Unit = js.native
  def removeListener(`type`: java.lang.String, callback: js.Any): scala.Unit = js.native
}

