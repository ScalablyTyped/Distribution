package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", "Store")
@js.native
class Store () extends js.Object {
  var id: String = js.native
  var listenables: js.Any = js.native
  var state: js.Any = js.native
  def fetchInitialState(listenable: Listenable, defaultCallback: js.Function): Unit = js.native
  def hasListener(listenable: Listenable): Boolean = js.native
  def listen(callback: js.Function, bindContext: js.Any): js.Function = js.native
  def listenTo(listenable: Listenable, callback: js.Function): Subscription = js.native
  def listenTo(listenable: Listenable, callback: js.Function, defaultCallback: js.Function): Subscription = js.native
  def listenToMany(listenables: js.Array[Listenable]): Unit = js.native
  def setState(state: js.Object): Unit = js.native
  def stopListeningTo(listenable: Listenable): Boolean = js.native
  def stopListeningToAll(): Unit = js.native
  def trigger(state: js.Any): Unit = js.native
  def validateListening(listenable: Listenable): String = js.native
}

