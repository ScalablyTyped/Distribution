package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ./store/RelayModernStore
@js.native
trait RelayModernStore extends js.Object {
  def check(selector: NormalizationSelector): scala.Boolean = js.native
  def getSource(): RecordSource = js.native
  def holdGC(): Disposable = js.native
  def lookup(selector: ReaderSelector): Snapshot = js.native
  def lookup(selector: ReaderSelector, owner: OperationDescriptor): Snapshot = js.native
  def publish(source: RecordSource): scala.Unit = js.native
  def retain(selector: NormalizationSelector): Disposable = js.native
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, scala.Unit]): Disposable = js.native
}

