package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy
import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import typings.relayRuntime.relayStoreTypesMod.LogEvent
import typings.relayRuntime.relayStoreTypesMod.OperationAvailability
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
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
  implicit class ReadonlynamequeryresourceOps[Self <: Readonlynamequeryresource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFetchPolicy(value: FetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: queryresourceDotfetch): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilerContext(value: js.Any): Self = this.set("profilerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryAvailability(value: OperationAvailability): Self = this.set("queryAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPolicy(value: RenderPolicy): Self = this.set("renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceID(value: Double): Self = this.set("resourceID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldFetch(value: Boolean): Self = this.set("shouldFetch", value.asInstanceOf[js.Any])
  }
}
