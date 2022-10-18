package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationAvailability
import typings.relayRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayRuntimeStrings.suspenseDotquery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'suspense.query',   fetchPolicy :string,   isPromiseCached :boolean,   operation :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationDescriptor,   queryAvailability :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.OperationAvailability | undefined,   renderPolicy :relay-runtime.relay-runtime/lib/util/RelayRuntimeTypes.RenderPolicy}> */
trait Readonlynamesuspensequery
  extends StObject
     with LogEvent {
  
  val fetchPolicy: String
  
  val isPromiseCached: Boolean
  
  val name: suspenseDotquery
  
  val operation: OperationDescriptor
  
  val queryAvailability: js.UndefOr[OperationAvailability] = js.undefined
  
  val renderPolicy: RenderPolicy
}
object Readonlynamesuspensequery {
  
  inline def apply(
    fetchPolicy: String,
    isPromiseCached: Boolean,
    operation: OperationDescriptor,
    renderPolicy: RenderPolicy
  ): Readonlynamesuspensequery = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isPromiseCached = isPromiseCached.asInstanceOf[js.Any], name = "suspense.query", operation = operation.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamesuspensequery]
  }
  
  extension [Self <: Readonlynamesuspensequery](x: Self) {
    
    inline def setFetchPolicy(value: String): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setIsPromiseCached(value: Boolean): Self = StObject.set(x, "isPromiseCached", value.asInstanceOf[js.Any])
    
    inline def setName(value: suspenseDotquery): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setQueryAvailability(value: OperationAvailability): Self = StObject.set(x, "queryAvailability", value.asInstanceOf[js.Any])
    
    inline def setQueryAvailabilityUndefined: Self = StObject.set(x, "queryAvailability", js.undefined)
    
    inline def setRenderPolicy(value: RenderPolicy): Self = StObject.set(x, "renderPolicy", value.asInstanceOf[js.Any])
  }
}
