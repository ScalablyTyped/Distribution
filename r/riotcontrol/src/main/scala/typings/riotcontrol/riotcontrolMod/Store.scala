package typings.riotcontrol.riotcontrolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  def off(events: String): Store = js.native
  def off(events: String, fn: js.Function): Store = js.native
  def on(events: String, fn: js.Function): Store = js.native
  def one(name: String, fn: js.Function): Store = js.native
  def trigger(name: String, args: js.Any*): Store = js.native
}

