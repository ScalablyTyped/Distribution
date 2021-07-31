package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
  - typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload
*/
trait OptimisticUpdate extends StObject
object OptimisticUpdate {
  
  @scala.inline
  def OptimisticUpdateFunction(storeUpdater: RecordSourceProxy => Unit): typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction = {
    val __obj = js.Dynamic.literal(storeUpdater = js.Any.fromFunction1(storeUpdater))
    __obj.asInstanceOf[typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction]
  }
  
  @scala.inline
  def OptimisticUpdateRelayPayload(operation: OperationDescriptor, payload: RelayResponsePayload): typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateRelayPayload]
  }
}
