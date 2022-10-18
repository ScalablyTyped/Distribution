package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationAvailability
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'queryresource.fetch',   resourceID :number,   operation :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationDescriptor,   profilerContext :unknown,   fetchPolicy :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.FetchPolicy,   renderPolicy :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.RenderPolicy,   queryAvailability :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationAvailability,   shouldFetch :boolean}> */
trait Readonlynamequeryresource
  extends StObject
     with LogEvent {
  
  val fetchPolicy: typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy
  
  val name: queryresourceDotfetch
  
  val operation: OperationDescriptor
  
  val profilerContext: Any
  
  val queryAvailability: OperationAvailability
  
  val renderPolicy: RenderPolicy
  
  val resourceID: Double
  
  val shouldFetch: Boolean
}
object Readonlynamequeryresource {
  
  inline def apply(
    fetchPolicy: typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy,
    operation: OperationDescriptor,
    profilerContext: Any,
    queryAvailability: OperationAvailability,
    renderPolicy: RenderPolicy,
    resourceID: Double,
    shouldFetch: Boolean
  ): Readonlynamequeryresource = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = "queryresource.fetch", operation = operation.asInstanceOf[js.Any], profilerContext = profilerContext.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamequeryresource]
  }
  
  extension [Self <: Readonlynamequeryresource](x: Self) {
    
    inline def setFetchPolicy(value: typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setName(value: queryresourceDotfetch): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setProfilerContext(value: Any): Self = StObject.set(x, "profilerContext", value.asInstanceOf[js.Any])
    
    inline def setQueryAvailability(value: OperationAvailability): Self = StObject.set(x, "queryAvailability", value.asInstanceOf[js.Any])
    
    inline def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
    
    inline def setResourceID(value: Double): Self = StObject.set(x, "resourceID", value.asInstanceOf[js.Any])
    
    inline def setShouldFetch(value: Boolean): Self = StObject.set(x, "shouldFetch", value.asInstanceOf[js.Any])
  }
}
