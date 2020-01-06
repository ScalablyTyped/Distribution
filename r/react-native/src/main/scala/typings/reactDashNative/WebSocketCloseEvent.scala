package typings.reactDashNative

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketCloseEvent extends Event {
  var code: js.UndefOr[Double] = js.native
  var reason: js.UndefOr[String] = js.native
}

