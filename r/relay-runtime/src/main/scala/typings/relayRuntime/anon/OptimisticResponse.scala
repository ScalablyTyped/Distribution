package typings.relayRuntime.anon

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticResponse extends StObject {
  
  var operation: OperationDescriptor = js.native
  
  var optimisticResponse: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  
  var updater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.native
  
  var uploadables: js.UndefOr[UploadableMap | Null] = js.native
}
object OptimisticResponse {
  
  @scala.inline
  def apply(operation: OperationDescriptor): OptimisticResponse = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimisticResponse]
  }
  
  @scala.inline
  implicit class OptimisticResponseMutableBuilder[Self <: OptimisticResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimisticResponse(value: StringDictionary[js.Any]): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimisticResponseNull: Self = StObject.set(x, "optimisticResponse", null)
    
    @scala.inline
    def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
    
    @scala.inline
    def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
    
    @scala.inline
    def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
    
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdaterNull: Self = StObject.set(x, "updater", null)
    
    @scala.inline
    def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
    
    @scala.inline
    def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadablesNull: Self = StObject.set(x, "uploadables", null)
    
    @scala.inline
    def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
  }
}
