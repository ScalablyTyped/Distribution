package typings.reactAdaptiveHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/memory.MemoryStatus> */
@js.native
trait PartialMemoryStatus extends js.Object {
  
  var deviceMemory: js.UndefOr[Double] = js.native
  
  var jsHeapSizeLimit: js.UndefOr[Double | Null] = js.native
  
  var totalJSHeapSize: js.UndefOr[Double | Null] = js.native
  
  var usedJSHeapSize: js.UndefOr[Double | Null] = js.native
}
object PartialMemoryStatus {
  
  @scala.inline
  def apply(): PartialMemoryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMemoryStatus]
  }
  
  @scala.inline
  implicit class PartialMemoryStatusOps[Self <: PartialMemoryStatus] (val x: Self) extends AnyVal {
    
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
    def setDeviceMemory(value: Double): Self = this.set("deviceMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMemory: Self = this.set("deviceMemory", js.undefined)
    
    @scala.inline
    def setJsHeapSizeLimit(value: Double): Self = this.set("jsHeapSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsHeapSizeLimit: Self = this.set("jsHeapSizeLimit", js.undefined)
    
    @scala.inline
    def setJsHeapSizeLimitNull: Self = this.set("jsHeapSizeLimit", null)
    
    @scala.inline
    def setTotalJSHeapSize(value: Double): Self = this.set("totalJSHeapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalJSHeapSize: Self = this.set("totalJSHeapSize", js.undefined)
    
    @scala.inline
    def setTotalJSHeapSizeNull: Self = this.set("totalJSHeapSize", null)
    
    @scala.inline
    def setUsedJSHeapSize(value: Double): Self = this.set("usedJSHeapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedJSHeapSize: Self = this.set("usedJSHeapSize", js.undefined)
    
    @scala.inline
    def setUsedJSHeapSizeNull: Self = this.set("usedJSHeapSize", null)
  }
}
