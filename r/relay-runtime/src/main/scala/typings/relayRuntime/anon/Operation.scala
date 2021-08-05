package typings.relayRuntime.anon

import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  var operation: OperationDescriptor
  
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
}
object Operation {
  
  inline def apply(operation: OperationDescriptor): Operation = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
    
    inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
