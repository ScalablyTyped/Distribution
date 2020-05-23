package typings.reactNative

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocketCloseEvent extends Event {
  var code: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
}

