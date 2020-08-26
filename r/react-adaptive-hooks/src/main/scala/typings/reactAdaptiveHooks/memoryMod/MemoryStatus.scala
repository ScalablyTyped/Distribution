package typings.reactAdaptiveHooks.memoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStatus extends js.Object {
  var deviceMemory: Double = js.native
  var jsHeapSizeLimit: Double | Null = js.native
  var totalJSHeapSize: Double | Null = js.native
  var usedJSHeapSize: Double | Null = js.native
}

object MemoryStatus {
  @scala.inline
  def apply(deviceMemory: Double): MemoryStatus = {
    val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatus]
  }
  @scala.inline
  implicit class MemoryStatusOps[Self <: MemoryStatus] (val x: Self) extends AnyVal {
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
    def setJsHeapSizeLimit(value: Double): Self = this.set("jsHeapSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsHeapSizeLimitNull: Self = this.set("jsHeapSizeLimit", null)
    @scala.inline
    def setTotalJSHeapSize(value: Double): Self = this.set("totalJSHeapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalJSHeapSizeNull: Self = this.set("totalJSHeapSize", null)
    @scala.inline
    def setUsedJSHeapSize(value: Double): Self = this.set("usedJSHeapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedJSHeapSizeNull: Self = this.set("usedJSHeapSize", null)
  }
  
}

