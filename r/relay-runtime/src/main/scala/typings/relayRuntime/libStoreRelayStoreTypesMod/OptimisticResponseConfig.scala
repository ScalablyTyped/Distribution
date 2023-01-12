package typings.relayRuntime.libStoreRelayStoreTypesMod

import typings.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimisticResponseConfig[TMutation /* <: MutationParameters */] extends StObject {
  
  val operation: OperationDescriptor
  
  val response: js.UndefOr[PayloadData | Null] = js.undefined
  
  val updater: js.UndefOr[SelectorStoreUpdater[TMutation] | Null] = js.undefined
}
object OptimisticResponseConfig {
  
  inline def apply[TMutation /* <: MutationParameters */](operation: OperationDescriptor): OptimisticResponseConfig[TMutation] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponseConfig[TMutation]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimisticResponseConfig[?], TMutation /* <: MutationParameters */] (val x: Self & OptimisticResponseConfig[TMutation]) extends AnyVal {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: PayloadData): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseNull: Self = StObject.set(x, "response", null)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[TMutation], TMutation) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
    
    inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
