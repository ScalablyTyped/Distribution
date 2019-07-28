package typings.relayDashRuntime.relayDashRuntimeMod

import typings.relayDashRuntime.Anon_CacheConfigOperation
import typings.relayDashRuntime.Anon_Operation
import typings.relayDashRuntime.Anon_OperationOptimisticResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelayModernEnvironment extends js.Object {
  val configName: js.UndefOr[String | Null] = js.native
  def applyMutation(data: Anon_OperationOptimisticResponse): Disposable = js.native
  def applyUpdate(optimisticUpdate: OptimisticUpdate): Disposable = js.native
  def check(readSelector: NormalizationSelector): Boolean = js.native
  def commitPayload(operationDescriptor: OperationDescriptor, payload: PayloadData): Unit = js.native
  def commitUpdate(updater: StoreUpdater): Unit = js.native
  def execute(data: Anon_CacheConfigOperation): RelayObservable[GraphQLResponse] = js.native
  def executeMutation(hasOperationOptimisticResponseOptimisticUpdaterUpdaterUploadables: Anon_Operation): RelayObservable[GraphQLResponse] = js.native
  def getNetwork(): Network = js.native
  def getStore(): Store = js.native
  def lookup(readSelector: ReaderSelector): Snapshot = js.native
  def lookup(readSelector: ReaderSelector, owner: OperationDescriptor): Snapshot = js.native
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit = js.native
  def retain(selector: NormalizationSelector): Disposable = js.native
  def revertUpdate(update: OptimisticUpdate): Unit = js.native
  def subscribe(snapshot: Snapshot, callback: js.Function1[/* snapshot */ Snapshot, Unit]): Disposable = js.native
}

