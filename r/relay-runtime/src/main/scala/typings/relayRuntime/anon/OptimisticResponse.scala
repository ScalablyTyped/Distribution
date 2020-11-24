package typings.relayRuntime.anon

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimisticResponse extends js.Object {
  
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
  implicit class OptimisticResponseOps[Self <: OptimisticResponse] (val x: Self) extends AnyVal {
    
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
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimisticResponse(value: StringDictionary[js.Any]): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    
    @scala.inline
    def setOptimisticResponseNull: Self = this.set("optimisticResponse", null)
    
    @scala.inline
    def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("optimisticUpdater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOptimisticUpdater: Self = this.set("optimisticUpdater", js.undefined)
    
    @scala.inline
    def setOptimisticUpdaterNull: Self = this.set("optimisticUpdater", null)
    
    @scala.inline
    def setUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = this.set("updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
    
    @scala.inline
    def setUpdaterNull: Self = this.set("updater", null)
    
    @scala.inline
    def setUploadables(value: UploadableMap): Self = this.set("uploadables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadables: Self = this.set("uploadables", js.undefined)
    
    @scala.inline
    def setUploadablesNull: Self = this.set("uploadables", null)
  }
}
