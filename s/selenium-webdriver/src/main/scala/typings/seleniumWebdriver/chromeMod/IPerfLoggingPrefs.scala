package typings.seleniumWebdriver.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPerfLoggingPrefs extends js.Object {
  
  var bufferUsageReportingInterval: Double = js.native
  
  var enableNetwork: Boolean = js.native
  
  var enablePage: Boolean = js.native
  
  var enableTimeline: Boolean = js.native
  
  var tracingCategories: String = js.native
}
object IPerfLoggingPrefs {
  
  @scala.inline
  def apply(
    bufferUsageReportingInterval: Double,
    enableNetwork: Boolean,
    enablePage: Boolean,
    enableTimeline: Boolean,
    tracingCategories: String
  ): IPerfLoggingPrefs = {
    val __obj = js.Dynamic.literal(bufferUsageReportingInterval = bufferUsageReportingInterval.asInstanceOf[js.Any], enableNetwork = enableNetwork.asInstanceOf[js.Any], enablePage = enablePage.asInstanceOf[js.Any], enableTimeline = enableTimeline.asInstanceOf[js.Any], tracingCategories = tracingCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfLoggingPrefs]
  }
  
  @scala.inline
  implicit class IPerfLoggingPrefsOps[Self <: IPerfLoggingPrefs] (val x: Self) extends AnyVal {
    
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
    def setBufferUsageReportingInterval(value: Double): Self = this.set("bufferUsageReportingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetwork(value: Boolean): Self = this.set("enableNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePage(value: Boolean): Self = this.set("enablePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTimeline(value: Boolean): Self = this.set("enableTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracingCategories(value: String): Self = this.set("tracingCategories", value.asInstanceOf[js.Any])
  }
}
