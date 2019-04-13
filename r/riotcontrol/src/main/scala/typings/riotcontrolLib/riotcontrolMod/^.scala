package typings
package riotcontrolLib.riotcontrolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riotcontrol", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var _stores: js.Array[Store] = js.native
  def addStore(store: Store): scala.Unit = js.native
  def off(events: java.lang.String): scala.Unit = js.native
  def off(events: java.lang.String, fn: js.Function): scala.Unit = js.native
  def on(events: java.lang.String, fn: js.Function): scala.Unit = js.native
  def one(name: java.lang.String, fn: js.Function): scala.Unit = js.native
  def trigger(name: java.lang.String, args: js.Any*): scala.Unit = js.native
}

