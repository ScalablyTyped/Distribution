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
import org.scalablytyped.runtime.StObject
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
trait LogEvent extends StObject
object LogEvent {
  
  @scala.inline
  def Readonlynameentrypointroo(name: entrypointDotrootDotconsume, profilerContext: js.Any, rootModuleID: String): typings.relayRuntime.anon.Readonlynameentrypointroo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], rootModuleID = rootModuleID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameentrypointroo]
  }
  
  @scala.inline
  def Readonlynameexecutecomple(name: executeDotcomplete, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutecomple]
  }
  
  @scala.inline
  def Readonlynameexecuteerrort(error: Error, name: executeDoterror, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecuteerrort = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteerrort]
  }
  
  @scala.inline
  def Readonlynameexecuteinfotr(info: js.Any, name: executeDotinfo, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecuteinfotr = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteinfotr]
  }
  
  @scala.inline
  def Readonlynameexecutenexttr(name: executeDotnext, response: GraphQLResponse, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecutenexttr = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutenexttr]
  }
  
  @scala.inline
  def Readonlynameexecutestartt(name: executeDotstart, params: RequestParameters, transactionID: Double, variables: Variables): typings.relayRuntime.anon.Readonlynameexecutestartt = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecutestartt]
  }
  
  @scala.inline
  def Readonlynameexecuteunsubs(name: executeDotunsubscribe, transactionID: Double): typings.relayRuntime.anon.Readonlynameexecuteunsubs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynameexecuteunsubs]
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
  ): typings.relayRuntime.anon.Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamequeryresource]
  }
  
  @scala.inline
  def ReadonlynamequeryresourceName(name: queryresourceDotretain, profilerContext: js.Any, resourceID: Double): typings.relayRuntime.anon.ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.ReadonlynamequeryresourceName]
  }
  
  @scala.inline
  def Readonlynamestoregcrefere(name: storeDotgc, references: Set[DataID]): typings.relayRuntime.anon.Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestoregcrefere]
  }
  
  @scala.inline
  def Readonlynamestorenotifyco(
    invalidatedRecordIDs: Set[DataID],
    name: storeDotnotifyDotcomplete,
    updatedRecordIDs: UpdatedRecords
  ): typings.relayRuntime.anon.Readonlynamestorenotifyco = {
    val __obj = js.Dynamic.literal(invalidatedRecordIDs = invalidatedRecordIDs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedRecordIDs = updatedRecordIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifyco]
  }
  
  @scala.inline
  def Readonlynamestorenotifyst(name: storeDotnotifyDotstart): typings.relayRuntime.anon.Readonlynamestorenotifyst = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorenotifyst]
  }
  
  @scala.inline
  def Readonlynamestorepublishs(name: storeDotpublish, optimistic: Boolean, source: RecordSource): typings.relayRuntime.anon.Readonlynamestorepublishs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optimistic = optimistic.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorepublishs]
  }
  
  @scala.inline
  def Readonlynamestorerestore(name: storeDotrestore): typings.relayRuntime.anon.Readonlynamestorerestore = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestorerestore]
  }
  
  @scala.inline
  def Readonlynamestoresnapshot(name: storeDotsnapshot): typings.relayRuntime.anon.Readonlynamestoresnapshot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.anon.Readonlynamestoresnapshot]
  }
}
