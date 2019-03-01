package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyState extends js.Object {
  var aborted: scala.Boolean
  var done: scala.Boolean
  var error: stdLib.Error | scala.Null
  var events: js.Array[ReadyStateEvent]
  var ready: scala.Boolean
  var stale: scala.Boolean
}

object ReadyState {
  @scala.inline
  def apply(
    aborted: scala.Boolean,
    done: scala.Boolean,
    events: js.Array[ReadyStateEvent],
    ready: scala.Boolean,
    stale: scala.Boolean,
    error: stdLib.Error = null
  ): ReadyState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aborted")(aborted)
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("stale")(stale)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ReadyState]
  }
}

