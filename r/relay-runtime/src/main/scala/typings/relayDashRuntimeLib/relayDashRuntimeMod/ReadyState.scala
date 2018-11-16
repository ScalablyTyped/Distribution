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

