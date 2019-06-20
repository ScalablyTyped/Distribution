package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reflux", "Store")
@js.native
class Store () extends js.Object {
  var id: java.lang.String = js.native
  var listenables: js.Any = js.native
  var state: js.Any = js.native
  def fetchInitialState(listenable: Listenable, defaultCallback: js.Function): scala.Unit = js.native
  def hasListener(listenable: Listenable): scala.Boolean = js.native
  def listen(callback: js.Function, bindContext: js.Any): js.Function = js.native
  def listenTo(listenable: Listenable, callback: js.Function): Subscription = js.native
  def listenTo(listenable: Listenable, callback: js.Function, defaultCallback: js.Function): Subscription = js.native
  def listenToMany(listenables: js.Array[Listenable]): scala.Unit = js.native
  def setState(state: js.Object): scala.Unit = js.native
  def stopListeningTo(listenable: Listenable): scala.Boolean = js.native
  def stopListeningToAll(): scala.Unit = js.native
  def trigger(state: js.Any): scala.Unit = js.native
  def validateListening(listenable: Listenable): java.lang.String = js.native
}

