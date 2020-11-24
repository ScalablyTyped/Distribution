package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayConcreteNodeMod.RequestParameters
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayRuntimeStrings.entrypointDotrootDotconsume
import typings.relayRuntime.relayRuntimeStrings.executeDotcomplete
import typings.relayRuntime.relayRuntimeStrings.executeDoterror
import typings.relayRuntime.relayRuntimeStrings.executeDotinfo
import typings.relayRuntime.relayRuntimeStrings.executeDotnext
import typings.relayRuntime.relayRuntimeStrings.executeDotstart
import typings.relayRuntime.relayRuntimeStrings.executeDotunsubscribe
import typings.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import typings.relayRuntime.relayRuntimeStrings.queryresourceDotretain
import typings.relayRuntime.relayRuntimeStrings.storeDotgc
import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotcomplete
import typings.relayRuntime.relayRuntimeStrings.storeDotnotifyDotstart
import typings.relayRuntime.relayRuntimeStrings.storeDotpublish
import typings.relayRuntime.relayRuntimeStrings.storeDotrestore
import typings.relayRuntime.relayRuntimeStrings.storeDotsnapshot
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait LogEvent extends js.Object
object LogEvent {
  
  @scala.inline
  def Readonlynamestorerestore(name: storeDotrestore): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecutenexttr(name: executeDotnext, response: GraphQLResponse, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorepublishs(name: storeDotpublish, optimistic: Boolean, source: RecordSource): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorenotifyst(name: storeDotnotifyDotstart): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestoresnapshot(name: storeDotsnapshot): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecuteunsubs(name: executeDotunsubscribe, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamequeryresource(
    fetchPolicy: FetchPolicy,
    name: queryresourceDotfetch,
    operation: OperationDescriptor,
    profilerContext: js.Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): LogEvent = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def ReadonlynamequeryresourceName(name: queryresourceDotretain, profilerContext: js.Any, resourceID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestoregcrefere(name: storeDotgc, references: Set[DataID]): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecutestartt(name: executeDotstart, params: RequestParameters, transactionID: Double, variables: Variables): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynamestorenotifyco(
    invalidatedRecordIDs: Set[DataID],
    name: storeDotnotifyDotcomplete,
    updatedRecordIDs: UpdatedRecords
  ): LogEvent = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameentrypointroo(name: entrypointDotrootDotconsume, profilerContext: js.Any, rootModuleID: String): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecutecomple(name: executeDotcomplete, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecuteinfotr(info: js.Any, name: executeDotinfo, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  def Readonlynameexecuteerrort(error: Error, name: executeDoterror, transactionID: Double): LogEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
}
