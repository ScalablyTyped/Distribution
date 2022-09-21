package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.anon.Readonlynamesuspensefragm
  - typings.relayRuntime.anon.Readonlynamesuspensequery
  - typings.relayRuntime.anon.Readonlynamequeryresource
  - typings.relayRuntime.anon.ReadonlynamequeryresourceName
  - typings.relayRuntime.anon.Readonlynamenetworkinfone
  - typings.relayRuntime.anon.Readonlynamenetworkstartn
  - typings.relayRuntime.anon.Readonlynamenetworknextne
  - typings.relayRuntime.anon.Readonlynamenetworkerrorn
  - typings.relayRuntime.anon.Readonlynamenetworkcomple
  - typings.relayRuntime.anon.Readonlynamenetworkunsubs
  - typings.relayRuntime.anon.Readonlynameexecutestarte
  - typings.relayRuntime.anon.Readonlynameexecutenextex
  - typings.relayRuntime.anon.Readonlynameexecuteasyncm
  - typings.relayRuntime.anon.Readonlynameexecuteflight
  - typings.relayRuntime.anon.Readonlynameexecuteerrore
  - typings.relayRuntime.anon.Readonlynameexecutecomple
  - typings.relayRuntime.anon.Readonlynamestorepublishs
  - typings.relayRuntime.anon.Readonlynamestoresnapshot
  - typings.relayRuntime.anon.Readonlynamestorerestore
  - typings.relayRuntime.anon.Readonlynamestoregcrefere
  - typings.relayRuntime.anon.Readonlynamestorenotifyst
  - typings.relayRuntime.anon.Readonlynamestorenotifyco
  - typings.relayRuntime.anon.Readonlynamestorenotifysu
  - typings.relayRuntime.anon.Readonlynameentrypointroo
*/
trait LogEvent extends StObject
object LogEvent {
  
  inline def Readonlynameentrypointroo(profilerContext: Any, rootModuleID: String): typings.relayRuntime.anon.Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = "entrypoint.root.consume", profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameentrypointroo]
  }
  
  inline def Readonlynameexecuteasyncm(duration: Double, executeId: Double, operationName: String): typings.relayRuntime.anon.Readonlynameexecuteasyncm = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.async.module", operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteasyncm]
  }
  
  inline def Readonlynameexecutecomple(executeId: Double): typings.relayRuntime.anon.Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(executeId = executeId.asInstanceOf[js.Any], name = "execute.complete")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutecomple]
  }
  
  inline def Readonlynameexecuteerrore(error: js.Error, executeId: Double): typings.relayRuntime.anon.Readonlynameexecuteerrore = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.error")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteerrore]
  }
  
  inline def Readonlynameexecuteflight(duration: Double, executeId: Double, operationName: String): typings.relayRuntime.anon.Readonlynameexecuteflight = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.flight.payload_deserialize", operationName = operationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteflight]
  }
  
  inline def Readonlynameexecutenextex(duration: Double, executeId: Double, response: GraphQLResponse): typings.relayRuntime.anon.Readonlynameexecutenextex = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.next", response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutenextex]
  }
  
  inline def Readonlynameexecutestarte(cacheConfig: CacheConfig, executeId: Double, params: RequestParameters, variables: Variables): typings.relayRuntime.anon.Readonlynameexecutestarte = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], executeId = executeId.asInstanceOf[js.Any], name = "execute.start", params = params.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutestarte]
  }
  
  inline def Readonlynamenetworkcomple(networkRequestId: Double): typings.relayRuntime.anon.Readonlynamenetworkcomple = {
    val __obj = js.Dynamic.literal(name = "network.complete", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamenetworkcomple]
  }
  
  inline def Readonlynamenetworkerrorn(error: js.Error, networkRequestId: Double): typings.relayRuntime.anon.Readonlynamenetworkerrorn = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "network.error", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamenetworkerrorn]
  }
  
  inline def Readonlynamenetworkinfone(info: Any, networkRequestId: Double): typings.relayRuntime.anon.Readonlynamenetworkinfone = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = "network.info", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamenetworkinfone]
  }
  
  inline def Readonlynamenetworknextne(networkRequestId: Double, response: GraphQLResponse): typings.relayRuntime.anon.Readonlynamenetworknextne = {
    val __obj = js.Dynamic.literal(name = "network.next", networkRequestId = networkRequestId.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamenetworknextne]
  }
  
  inline def Readonlynamenetworkstartn(
    cacheConfig: CacheConfig,
    networkRequestId: Double,
    params: RequestParameters,
    variables: Variables
  ): typings.relayRuntime.anon.Readonlynamenetworkstartn = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], name = "network.start", networkRequestId = networkRequestId.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamenetworkstartn]
  }
  
  inline def Readonlynamenetworkunsubs(networkRequestId: Double): typings.relayRuntime.anon.Readonlynamenetworkunsubs = {
    val __obj = js.Dynamic.literal(name = "network.unsubscribe", networkRequestId = networkRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamenetworkunsubs]
  }
  
  inline def Readonlynamequeryresource(
    fetchPolicy: FetchPolicy,
    operation: OperationDescriptor,
    profilerContext: Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): typings.relayRuntime.anon.Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = "queryresource.fetch", operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamequeryresource]
  }
  
  inline def ReadonlynamequeryresourceName(profilerContext: Any, resourceID: Double): typings.relayRuntime.anon.ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = "queryresource.retain", profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.ReadonlynamequeryresourceName]
  }
  
  inline def Readonlynamestoregcrefere(references: DataIDSet): typings.relayRuntime.anon.Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = "store.gc", references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestoregcrefere]
  }
  
  inline def Readonlynamestorenotifyco(invalidatedRecordIDs: DataIDSet, updatedRecordIDs: DataIDSet): typings.relayRuntime.anon.Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = "store.notify.complete", updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifyco]
  }
  
  inline def Readonlynamestorenotifyst(): typings.relayRuntime.anon.Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = "store.notify.start")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifyst]
  }
  
  inline def Readonlynamestorenotifysu(nextSnapshot: Snapshot, snapshot: Snapshot): typings.relayRuntime.anon.Readonlynamestorenotifysu = {
    val __obj = js.Dynamic.literal(name = "store.notify.subscription", nextSnapshot = nextSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifysu]
  }
  
  inline def Readonlynamestorepublishs(optimistic: Boolean, source: RecordSource): typings.relayRuntime.anon.Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = "store.publish", optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorepublishs]
  }
  
  inline def Readonlynamestorerestore(): typings.relayRuntime.anon.Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = "store.restore")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorerestore]
  }
  
  inline def Readonlynamestoresnapshot(): typings.relayRuntime.anon.Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = "store.snapshot")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestoresnapshot]
  }
  
  inline def Readonlynamesuspensefragm(
    data: Any,
    fragment: ReaderFragment,
    isMissingData: Boolean,
    isPromiseCached: Boolean,
    isRelayHooks: Boolean,
    pendingOperations: js.Array[RequestDescriptor]
  ): typings.relayRuntime.anon.Readonlynamesuspensefragm = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], isMissingData = isMissingData.asInstanceOf[js.Any], isPromiseCached = isPromiseCached.asInstanceOf[js.Any], isRelayHooks = isRelayHooks.asInstanceOf[js.Any], name = "suspense.fragment", pendingOperations = pendingOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamesuspensefragm]
  }
  
  inline def Readonlynamesuspensequery(
    fetchPolicy: String,
    isPromiseCached: Boolean,
    operation: OperationDescriptor,
    renderPolicy: RenderPolicy
  ): typings.relayRuntime.anon.Readonlynamesuspensequery = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isPromiseCached = isPromiseCached.asInstanceOf[js.Any], name = "suspense.query", operation = operation.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamesuspensequery]
  }
}
