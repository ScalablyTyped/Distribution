package typings.relayRuntime.mod

import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.RelayObservable
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Internal extends js.Object {
  
  def fetchQuery(environment: typings.relayRuntime.relayStoreTypesMod.Environment, operation: OperationDescriptor): RelayObservable[GraphQLResponse] = js.native
  
  def fetchQueryDeduped(
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    request: RequestDescriptor,
    fetchFn: js.Function0[RelayObservable[GraphQLResponse]]
  ): RelayObservable[GraphQLResponse] = js.native
  @JSName("fetchQueryDeduped")
  var fetchQueryDeduped_Original: js.Function3[
    /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
    /* request */ RequestDescriptor, 
    /* fetchFn */ js.Function0[RelayObservable[GraphQLResponse]], 
    RelayObservable[GraphQLResponse]
  ] = js.native
  
  @JSName("fetchQuery")
  var fetchQuery_Original: js.Function2[
    /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
    /* operation */ OperationDescriptor, 
    RelayObservable[GraphQLResponse]
  ] = js.native
  
  def getObservableForActiveRequest(environment: typings.relayRuntime.relayStoreTypesMod.Environment, request: RequestDescriptor): RelayObservable[Unit] | Null = js.native
  @JSName("getObservableForActiveRequest")
  var getObservableForActiveRequest_Original: js.Function2[
    /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
    /* request */ RequestDescriptor, 
    RelayObservable[Unit] | Null
  ] = js.native
  
  def getPromiseForActiveRequest(environment: typings.relayRuntime.relayStoreTypesMod.Environment, request: RequestDescriptor): js.Promise[Unit] | Null = js.native
  @JSName("getPromiseForActiveRequest")
  var getPromiseForActiveRequest_Original: js.Function2[
    /* environment */ typings.relayRuntime.relayStoreTypesMod.Environment, 
    /* request */ RequestDescriptor, 
    js.Promise[Unit] | Null
  ] = js.native
}
