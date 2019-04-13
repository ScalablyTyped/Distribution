package typings
package riotcontrolLib.riotcontrolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  def off(events: java.lang.String): Store = js.native
  def off(events: java.lang.String, fn: js.Function): Store = js.native
  def on(events: java.lang.String, fn: js.Function): Store = js.native
  def one(name: java.lang.String, fn: js.Function): Store = js.native
  def trigger(name: java.lang.String, args: js.Any*): Store = js.native
}

