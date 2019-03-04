package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aborted extends js.Object {
  var aborted: scala.Boolean
  var done: scala.Boolean
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var events: js.Array[reactDashRelayLib.classicMod.ReadyStateEvent]
  var ready: scala.Boolean
  var stale: scala.Boolean
}

object Anon_Aborted {
  @scala.inline
  def apply(
    aborted: scala.Boolean,
    done: scala.Boolean,
    events: js.Array[reactDashRelayLib.classicMod.ReadyStateEvent],
    ready: scala.Boolean,
    stale: scala.Boolean,
    error: stdLib.Error = null
  ): Anon_Aborted = {
    val __obj = js.Dynamic.literal(aborted = aborted, done = done, events = events, ready = ready, stale = stale)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Aborted]
  }
}

