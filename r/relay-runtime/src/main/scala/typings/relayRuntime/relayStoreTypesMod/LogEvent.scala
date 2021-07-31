package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.anon.Readonlynamequeryresource
  - typings.relayRuntime.anon.ReadonlynamequeryresourceName
  - typings.relayRuntime.anon.Readonlynameexecuteinfotr
  - typings.relayRuntime.anon.Readonlynameexecutestartt
  - typings.relayRuntime.anon.Readonlynameexecutenexttr
  - typings.relayRuntime.anon.Readonlynameexecuteerrort
  - typings.relayRuntime.anon.Readonlynameexecutecomple
  - typings.relayRuntime.anon.Readonlynameexecuteunsubs
  - typings.relayRuntime.anon.Readonlynamestorepublishs
  - typings.relayRuntime.anon.Readonlynamestoresnapshot
  - typings.relayRuntime.anon.Readonlynamestorerestore
  - typings.relayRuntime.anon.Readonlynamestoregcrefere
  - typings.relayRuntime.anon.Readonlynamestorenotifyst
  - typings.relayRuntime.anon.Readonlynamestorenotifyco
  - typings.relayRuntime.anon.Readonlynameentrypointroo
*/
trait LogEvent extends StObject
object LogEvent {
  
  @scala.inline
  def Readonlynameentrypointroo(profilerContext: js.Any, rootModuleID: String): typings.relayRuntime.anon.Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = "entrypoint.root.consume", profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameentrypointroo]
  }
  
  @scala.inline
  def Readonlynameexecutecomple(transactionID: Double): typings.relayRuntime.anon.Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(name = "execute.complete", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutecomple]
  }
  
  @scala.inline
  def Readonlynameexecuteerrort(error: Error, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecuteerrort = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "execute.error", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteerrort]
  }
  
  @scala.inline
  def Readonlynameexecuteinfotr(info: js.Any, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecuteinfotr = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = "execute.info", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteinfotr]
  }
  
  @scala.inline
  def Readonlynameexecutenexttr(response: GraphQLResponse, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecutenexttr = {
    val __obj = js.Dynamic.literal(name = "execute.next", response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutenexttr]
  }
  
  @scala.inline
  def Readonlynameexecutestartt(params: RequestParameters, transactionID: Double, variables: Variables): typings.relayRuntime.anon.Readonlynameexecutestartt = {
    val __obj = js.Dynamic.literal(name = "execute.start", params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutestartt]
  }
  
  @scala.inline
  def Readonlynameexecuteunsubs(transactionID: Double): typings.relayRuntime.anon.Readonlynameexecuteunsubs = {
    val __obj = js.Dynamic.literal(name = "execute.unsubscribe", transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteunsubs]
  }
  
  @scala.inline
  def Readonlynamequeryresource(
    fetchPolicy: FetchPolicy,
    operation: OperationDescriptor,
    profilerContext: js.Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): typings.relayRuntime.anon.Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = "queryresource.fetch", operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamequeryresource]
  }
  
  @scala.inline
  def ReadonlynamequeryresourceName(profilerContext: js.Any, resourceID: Double): typings.relayRuntime.anon.ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = "queryresource.retain", profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.ReadonlynamequeryresourceName]
  }
  
  @scala.inline
  def Readonlynamestoregcrefere(references: Set[DataID]): typings.relayRuntime.anon.Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = "store.gc", references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestoregcrefere]
  }
  
  @scala.inline
  def Readonlynamestorenotifyco(invalidatedRecordIDs: Set[DataID], updatedRecordIDs: UpdatedRecords): typings.relayRuntime.anon.Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = "store.notify.complete", updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifyco]
  }
  
  @scala.inline
  def Readonlynamestorenotifyst(): typings.relayRuntime.anon.Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = "store.notify.start")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifyst]
  }
  
  @scala.inline
  def Readonlynamestorepublishs(optimistic: Boolean, source: RecordSource): typings.relayRuntime.anon.Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = "store.publish", optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorepublishs]
  }
  
  @scala.inline
  def Readonlynamestorerestore(): typings.relayRuntime.anon.Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = "store.restore")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorerestore]
  }
  
  @scala.inline
  def Readonlynamestoresnapshot(): typings.relayRuntime.anon.Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = "store.snapshot")
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestoresnapshot]
  }
}
