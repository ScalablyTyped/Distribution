package typings.relayRuntime.anon

import typings.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typings.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.relayRuntimeStrings.suspenseDotfragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'suspense.fragment',   data :unknown,   fragment :relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderFragment,   isRelayHooks :boolean,   isMissingData :boolean,   isPromiseCached :boolean,   pendingOperations :std.ReadonlyArray<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.RequestDescriptor>}> */
trait Readonlynamesuspensefragm
  extends StObject
     with LogEvent {
  
  val data: Any
  
  val fragment: ReaderFragment
  
  val isMissingData: Boolean
  
  val isPromiseCached: Boolean
  
  val isRelayHooks: Boolean
  
  val name: suspenseDotfragment
  
  val pendingOperations: js.Array[RequestDescriptor]
}
object Readonlynamesuspensefragm {
  
  inline def apply(
    data: Any,
    fragment: ReaderFragment,
    isMissingData: Boolean,
    isPromiseCached: Boolean,
    isRelayHooks: Boolean,
    pendingOperations: js.Array[RequestDescriptor]
  ): Readonlynamesuspensefragm = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], isMissingData = isMissingData.asInstanceOf[js.Any], isPromiseCached = isPromiseCached.asInstanceOf[js.Any], isRelayHooks = isRelayHooks.asInstanceOf[js.Any], name = "suspense.fragment", pendingOperations = pendingOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamesuspensefragm]
  }
  
  extension [Self <: Readonlynamesuspensefragm](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: ReaderFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setIsMissingData(value: Boolean): Self = StObject.set(x, "isMissingData", value.asInstanceOf[js.Any])
    
    inline def setIsPromiseCached(value: Boolean): Self = StObject.set(x, "isPromiseCached", value.asInstanceOf[js.Any])
    
    inline def setIsRelayHooks(value: Boolean): Self = StObject.set(x, "isRelayHooks", value.asInstanceOf[js.Any])
    
    inline def setName(value: suspenseDotfragment): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPendingOperations(value: js.Array[RequestDescriptor]): Self = StObject.set(x, "pendingOperations", value.asInstanceOf[js.Any])
    
    inline def setPendingOperationsVarargs(value: RequestDescriptor*): Self = StObject.set(x, "pendingOperations", js.Array(value*))
  }
}
