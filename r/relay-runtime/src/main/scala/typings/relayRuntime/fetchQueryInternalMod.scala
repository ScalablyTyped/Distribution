package typings.relayRuntime

import typings.relayRuntime.anon.NetworkCacheConfig
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/query/fetchQueryInternal", JSImport.Namespace)
@js.native
object fetchQueryInternalMod extends js.Object {
  def fetchQuery(environment: Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = js.native
  def fetchQuery(environment: Environment, operation: OperationDescriptor, options: NetworkCacheConfig): RelayObservable[GraphQLResponse] = js.native
  def fetchQueryDeduped(
    environment: Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = js.native
  def getObservableForActiveRequest(environment: Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = js.native
  def getPromiseForActiveRequest(environment: Environment, request: RequestDescriptor): js.Promise[Unit] | Null = js.native
}

