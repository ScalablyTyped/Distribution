package typings.relayRuntime

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchQueryInternalMod {
  
  @JSImport("relay-runtime/lib/query/fetchQueryInternal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fetchQuery(environment: Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQuery")(environment.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[GraphQLResponse]]
  
  @scala.inline
  def fetchQueryDeduped(
    environment: Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchQueryDeduped")(environment.asInstanceOf[js.Any], request.asInstanceOf[js.Any], fetchFn.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[GraphQLResponse]]
  
  @scala.inline
  def getObservableForActiveRequest(environment: Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getObservableForActiveRequest")(environment.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[RelayObservable[Unit] | Null]
  
  @scala.inline
  def getPromiseForActiveRequest(environment: Environment, request: RequestDescriptor): js.Promise[Unit] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPromiseForActiveRequest")(environment.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit] | Null]
}
