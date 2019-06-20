package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayModernEnvironment extends js.Object {
  val configName: js.UndefOr[java.lang.String | scala.Null] = js.native
  def applyMutation(data: relayDashRuntimeLib.Anon_OperationOptimisticResponse): Disposable = js.native
  def applyUpdate(optimisticUpdate: OptimisticUpdate): Disposable = js.native
  def check(readSelector: NormalizationSelector): scala.Boolean = js.native
  def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): scala.Unit = js.native
  def commitUpdate(updater: StoreUpdater): scala.Unit = js.native
  def execute(data: relayDashRuntimeLib.Anon_CacheConfigOperation): RelayObservable[GraphQLResponse] = js.native
  def executeMutation(
    hasOperationOptimisticResponseOptimisticUpdaterUpdaterUploadables: relayDashRuntimeLib.Anon_Operation
  ): RelayObservable[GraphQLResponse] = js.native
  def getNetwork(): Network = js.native
  def getStore(): Store = js.native
  def lookup(readSelector: ReaderSelector): Snapshot = js.native
  def lookup(readSelector: ReaderSelector, owner: OperationDescriptor): Snapshot = js.native
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): scala.Unit = js.native
  def retain(selector: NormalizationSelector): Disposable = js.native
  def revertUpdate(update: OptimisticUpdate): scala.Unit = js.native
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, scala.Unit]): Disposable = js.native
}

