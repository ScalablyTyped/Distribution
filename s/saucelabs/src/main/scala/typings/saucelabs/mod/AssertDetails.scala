package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertDetails
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var baseline: js.UndefOr[Double] = js.undefined
  
  var datetime: js.UndefOr[String] = js.undefined
  
  var job_id: js.UndefOr[String] = js.undefined
  
  var lower_boundary: js.UndefOr[Double] = js.undefined
  
  var order_index: js.UndefOr[Double] = js.undefined
  
  var outlier: js.UndefOr[OutlierDetails] = js.undefined
  
  var real_value: js.UndefOr[Double] = js.undefined
  
  var upper_boundary: js.UndefOr[Double] = js.undefined
}
object AssertDetails {
  
  @scala.inline
  def apply(): AssertDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertDetails]
  }
  
  @scala.inline
  implicit class AssertDetailsMutableBuilder[Self <: AssertDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    @scala.inline
    def setLower_boundary(value: Double): Self = StObject.set(x, "lower_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLower_boundaryUndefined: Self = StObject.set(x, "lower_boundary", js.undefined)
    
    @scala.inline
    def setOrder_index(value: Double): Self = StObject.set(x, "order_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_indexUndefined: Self = StObject.set(x, "order_index", js.undefined)
    
    @scala.inline
    def setOutlier(value: OutlierDetails): Self = StObject.set(x, "outlier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlierUndefined: Self = StObject.set(x, "outlier", js.undefined)
    
    @scala.inline
    def setReal_value(value: Double): Self = StObject.set(x, "real_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal_valueUndefined: Self = StObject.set(x, "real_value", js.undefined)
    
    @scala.inline
    def setUpper_boundary(value: Double): Self = StObject.set(x, "upper_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper_boundaryUndefined: Self = StObject.set(x, "upper_boundary", js.undefined)
  }
}
