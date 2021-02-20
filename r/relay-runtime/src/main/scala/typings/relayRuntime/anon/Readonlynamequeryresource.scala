package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'queryresource.fetch',   resourceID :number,   operation :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationDescriptor,   profilerContext :any,   fetchPolicy :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.FetchPolicy,   renderPolicy :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.RenderPolicy,   queryAvailability :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationAvailability,   shouldFetch :boolean}> */
@js.native
trait Readonlynamequeryresource extends LogEvent {
  
  val fetchPolicy: FetchPolicy = js.native
  
  val name: queryresourceDotfetch = js.native
  
  val operation: OperationDescriptor = js.native
  
  val profilerContext: js.Any = js.native
  
  val queryAvailability: OperationAvailability = js.native
  
  val renderPolicy: RenderPolicy = js.native
  
  val resourceID: Double = js.native
  
  val shouldFetch: Boolean = js.native
}
object Readonlynamequeryresource {
  
  @scala.inline
  def apply(
    fetchPolicy: FetchPolicy,
    name: queryresourceDotfetch,
    operation: OperationDescriptor,
    profilerContext: js.Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamequeryresource]
  }
  
  @scala.inline
  implicit class ReadonlynamequeryresourceMutableBuilder[Self <: Readonlynamequeryresource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: queryresourceDotfetch): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerContext(value: js.Any): Self = StObject.set(x, "profilerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryAvailability(value: OperationAvailability): Self = StObject.set(x, "queryAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceID(value: Double): Self = StObject.set(x, "resourceID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldFetch(value: Boolean): Self = StObject.set(x, "shouldFetch", value.asInstanceOf[js.Any])
  }
}
