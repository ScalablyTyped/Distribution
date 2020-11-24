package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceMetricsListViewItems
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[String] = js.native
  
  var job_creation_time: js.UndefOr[String] = js.native
  
  var job_id: js.UndefOr[String] = js.native
  
  var job_name_hash: js.UndefOr[String] = js.native
  
  var job_owner: js.UndefOr[String] = js.native
  
  var load_id: js.UndefOr[String] = js.native
  
  var loader_id: js.UndefOr[String] = js.native
  
  var metric_data: js.UndefOr[PerformanceMetricsDetails] = js.native
  
  var order_index: js.UndefOr[Double] = js.native
  
  var page_url: js.UndefOr[String] = js.native
}
object PerformanceMetricsListViewItems {
  
  @scala.inline
  def apply(): PerformanceMetricsListViewItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceMetricsListViewItems]
  }
  
  @scala.inline
  implicit class PerformanceMetricsListViewItemsOps[Self <: PerformanceMetricsListViewItems] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setJob_creation_time(value: String): Self = this.set("job_creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_creation_time: Self = this.set("job_creation_time", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_id: Self = this.set("job_id", js.undefined)
    
    @scala.inline
    def setJob_name_hash(value: String): Self = this.set("job_name_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_name_hash: Self = this.set("job_name_hash", js.undefined)
    
    @scala.inline
    def setJob_owner(value: String): Self = this.set("job_owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob_owner: Self = this.set("job_owner", js.undefined)
    
    @scala.inline
    def setLoad_id(value: String): Self = this.set("load_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad_id: Self = this.set("load_id", js.undefined)
    
    @scala.inline
    def setLoader_id(value: String): Self = this.set("loader_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader_id: Self = this.set("loader_id", js.undefined)
    
    @scala.inline
    def setMetric_data(value: PerformanceMetricsDetails): Self = this.set("metric_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric_data: Self = this.set("metric_data", js.undefined)
    
    @scala.inline
    def setOrder_index(value: Double): Self = this.set("order_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder_index: Self = this.set("order_index", js.undefined)
    
    @scala.inline
    def setPage_url(value: String): Self = this.set("page_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_url: Self = this.set("page_url", js.undefined)
  }
}
