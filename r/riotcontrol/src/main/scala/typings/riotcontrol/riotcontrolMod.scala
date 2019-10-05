package typings.riotcontrol

import typings.riotcontrol.riotcontrolMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riotcontrol", JSImport.Namespace)
@js.native
object riotcontrolMod extends js.Object {
  @js.native
  trait Store extends js.Object {
    def off(events: String): Store = js.native
    def off(events: String, fn: js.Function): Store = js.native
    def on(events: String, fn: js.Function): Store = js.native
    def one(name: String, fn: js.Function): Store = js.native
    def trigger(name: String, args: js.Any*): Store = js.native
  }
  
  var _stores: js.Array[Store] = js.native
  def addStore(store: Store): Unit = js.native
  def off(events: String): Unit = js.native
  def off(events: String, fn: js.Function): Unit = js.native
  def on(events: String, fn: js.Function): Unit = js.native
  def one(name: String, fn: js.Function): Unit = js.native
  def trigger(name: String, args: js.Any*): Unit = js.native
}

