package typings.stompjs.stompjsMod

import typings.node.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", "setInterval")
@js.native
object setInterval extends js.Object {
  def apply(interval: Double, f: js.Function1[/* repeated */ js.Any, Unit]): Timer = js.native
}

