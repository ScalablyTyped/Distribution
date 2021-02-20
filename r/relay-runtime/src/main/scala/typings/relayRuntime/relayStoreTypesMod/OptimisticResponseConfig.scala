package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayNetworkTypesMod.PayloadData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticResponseConfig extends StObject {
  
  val operation: OperationDescriptor = js.native
  
  val response: js.UndefOr[PayloadData | Null] = js.native
  
  val updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
}
object OptimisticResponseConfig {
  
  @scala.inline
  def apply(operation: OperationDescriptor): OptimisticResponseConfig = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponseConfig]
  }
  
  @scala.inline
  implicit class OptimisticResponseConfigMutableBuilder[Self <: OptimisticResponseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: PayloadData): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseNull: Self = StObject.set(x, "response", null)
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    @scala.inline
    def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
  }
}
