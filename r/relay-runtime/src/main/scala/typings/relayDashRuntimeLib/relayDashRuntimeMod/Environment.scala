package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends js.Object {
  def this(config: EnvironmentConfig) = this()
  def applyMutation(config: relayDashRuntimeLib.Anon_Operation): Disposable = js.native
  def applyUpdate(optimisticUpdate: OptimisticUpdate): Disposable = js.native
  def check(readSelector: Selector): scala.Boolean = js.native
  def commitPayload(operationSelector: OperationSelector, payload: PayloadData): scala.Unit = js.native
  def commitUpdate(updater: StoreUpdater): scala.Unit = js.native
  def execute(config: relayDashRuntimeLib.Anon_CacheConfigOperation): RelayObservable[RelayResponsePayload] = js.native
  def executeMutation(config: relayDashRuntimeLib.Anon_OperationOptimisticResponse): RelayObservable[RelayResponsePayload] = js.native
  def getDebugger(): RelayDebugger = js.native
  def getStore(): Store = js.native
  def lookup(readSelector: Selector): Snapshot = js.native
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): scala.Unit = js.native
  def retain(selector: Selector): Disposable = js.native
  def revertUpdate(update: OptimisticUpdate): scala.Unit = js.native
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, scala.Unit]): Disposable = js.native
}

