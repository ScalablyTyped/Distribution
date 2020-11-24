package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegimeAcknowledge
  extends /* key */ StringDictionary[js.Any] {
  
  var metric_names: js.Array[String] = js.native
  
  var order_index: Double = js.native
  
  var page_url: String = js.native
}
object RegimeAcknowledge {
  
  @scala.inline
  def apply(metric_names: js.Array[String], order_index: Double, page_url: String): RegimeAcknowledge = {
    val __obj = js.Dynamic.literal(metric_names = metric_names.asInstanceOf[js.Any], order_index = order_index.asInstanceOf[js.Any], page_url = page_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegimeAcknowledge]
  }
  
  @scala.inline
  implicit class RegimeAcknowledgeOps[Self <: RegimeAcknowledge] (val x: Self) extends AnyVal {
    
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
    def setMetric_namesVarargs(value: String*): Self = this.set("metric_names", js.Array(value :_*))
    
    @scala.inline
    def setMetric_names(value: js.Array[String]): Self = this.set("metric_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_index(value: Double): Self = this.set("order_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_url(value: String): Self = this.set("page_url", value.asInstanceOf[js.Any])
  }
}
