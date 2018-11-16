package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Store")
@js.native
class Store protected () extends js.Object {
  def this(source: RecordSource) = this()
  def check(selector: Selector): scala.Boolean = js.native
  def getSource(): MutableRecordSource = js.native
  def lookup(selector: Selector): Snapshot = js.native
  def publish(source: RecordSource): scala.Unit = js.native
  def retain(selector: Selector): Disposable = js.native
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, scala.Unit]): Disposable = js.native
}

