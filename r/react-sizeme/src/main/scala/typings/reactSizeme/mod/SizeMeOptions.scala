package typings.reactSizeme.mod

import typings.reactSizeme.reactSizemeStrings.debounce
import typings.reactSizeme.reactSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeMeOptions extends js.Object {
  
  var monitorHeight: js.UndefOr[Boolean] = js.native
  
  var monitorPosition: js.UndefOr[Boolean] = js.native
  
  var monitorWidth: js.UndefOr[Boolean] = js.native
  
  var noPlaceholder: js.UndefOr[Boolean] = js.native
  
  var refreshMode: js.UndefOr[throttle | debounce] = js.native
  
  var refreshRate: js.UndefOr[Double] = js.native
}
object SizeMeOptions {
  
  @scala.inline
  def apply(): SizeMeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeMeOptions]
  }
  
  @scala.inline
  implicit class SizeMeOptionsOps[Self <: SizeMeOptions] (val x: Self) extends AnyVal {
    
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
    def setMonitorHeight(value: Boolean): Self = this.set("monitorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorHeight: Self = this.set("monitorHeight", js.undefined)
    
    @scala.inline
    def setMonitorPosition(value: Boolean): Self = this.set("monitorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorPosition: Self = this.set("monitorPosition", js.undefined)
    
    @scala.inline
    def setMonitorWidth(value: Boolean): Self = this.set("monitorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorWidth: Self = this.set("monitorWidth", js.undefined)
    
    @scala.inline
    def setNoPlaceholder(value: Boolean): Self = this.set("noPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPlaceholder: Self = this.set("noPlaceholder", js.undefined)
    
    @scala.inline
    def setRefreshMode(value: throttle | debounce): Self = this.set("refreshMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshMode: Self = this.set("refreshMode", js.undefined)
    
    @scala.inline
    def setRefreshRate(value: Double): Self = this.set("refreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshRate: Self = this.set("refreshRate", js.undefined)
  }
}
