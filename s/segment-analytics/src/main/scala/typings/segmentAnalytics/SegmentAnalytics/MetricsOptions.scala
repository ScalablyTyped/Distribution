package typings.segmentAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsOptions extends js.Object {
  
  var flushTimer: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var maxQueueSize: js.UndefOr[Double] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
}
object MetricsOptions {
  
  @scala.inline
  def apply(): MetricsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsOptions]
  }
  
  @scala.inline
  implicit class MetricsOptionsOps[Self <: MetricsOptions] (val x: Self) extends AnyVal {
    
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
    def setFlushTimer(value: Double): Self = this.set("flushTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushTimer: Self = this.set("flushTimer", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setMaxQueueSize(value: Double): Self = this.set("maxQueueSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxQueueSize: Self = this.set("maxQueueSize", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
  }
}
