package typings.relayRuntime

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchQueryInternalMod {
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "fetchQuery")
  @js.native
  def fetchQuery(environment: Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = js.native
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "fetchQueryDeduped")
  @js.native
  def fetchQueryDeduped(
    environment: Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = js.native
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "getObservableForActiveRequest")
  @js.native
  def getObservableForActiveRequest(environment: Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = js.native
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", "getPromiseForActiveRequest")
  @js.native
  def getPromiseForActiveRequest(environment: Environment, request: RequestDescriptor): js.Promise[Unit] | Null = js.native
}
