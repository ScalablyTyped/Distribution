package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction
  - typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends StObject
object OptimisticUpdate {
  
  inline def OptimisticUpdateFunction(storeUpdater: RecordSourceProxy => Unit): typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateFunction]
  }
  
  inline def OptimisticUpdateRelayPayload(operation: OperationDescriptor, payload: RelayResponsePayload): typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.libStoreRelayStoreTypesMod.OptimisticUpdateRelayPayload]
  }
}
