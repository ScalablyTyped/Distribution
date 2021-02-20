package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class PerformanceMetricsListViewItemsMutableBuilder[Self <: PerformanceMetricsListViewItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setJob_creation_time(value: String): Self = StObject.set(x, "job_creation_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_creation_timeUndefined: Self = StObject.set(x, "job_creation_time", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    @scala.inline
    def setJob_name_hash(value: String): Self = StObject.set(x, "job_name_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_name_hashUndefined: Self = StObject.set(x, "job_name_hash", js.undefined)
    
    @scala.inline
    def setJob_owner(value: String): Self = StObject.set(x, "job_owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_ownerUndefined: Self = StObject.set(x, "job_owner", js.undefined)
    
    @scala.inline
    def setLoad_id(value: String): Self = StObject.set(x, "load_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoad_idUndefined: Self = StObject.set(x, "load_id", js.undefined)
    
    @scala.inline
    def setLoader_id(value: String): Self = StObject.set(x, "loader_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader_idUndefined: Self = StObject.set(x, "loader_id", js.undefined)
    
    @scala.inline
    def setMetric_data(value: PerformanceMetricsDetails): Self = StObject.set(x, "metric_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric_dataUndefined: Self = StObject.set(x, "metric_data", js.undefined)
    
    @scala.inline
    def setOrder_index(value: Double): Self = StObject.set(x, "order_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_indexUndefined: Self = StObject.set(x, "order_index", js.undefined)
    
    @scala.inline
    def setPage_url(value: String): Self = StObject.set(x, "page_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_urlUndefined: Self = StObject.set(x, "page_url", js.undefined)
  }
}
