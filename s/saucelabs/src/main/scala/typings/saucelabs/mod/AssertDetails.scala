package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertDetails
  extends StObject
     with /* key */ StringDictionary[Any] {
  
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
  
  inline def apply(): AssertDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertDetails] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setLower_boundary(value: Double): Self = StObject.set(x, "lower_boundary", value.asInstanceOf[js.Any])
    
    inline def setLower_boundaryUndefined: Self = StObject.set(x, "lower_boundary", js.undefined)
    
    inline def setOrder_index(value: Double): Self = StObject.set(x, "order_index", value.asInstanceOf[js.Any])
    
    inline def setOrder_indexUndefined: Self = StObject.set(x, "order_index", js.undefined)
    
    inline def setOutlier(value: OutlierDetails): Self = StObject.set(x, "outlier", value.asInstanceOf[js.Any])
    
    inline def setOutlierUndefined: Self = StObject.set(x, "outlier", js.undefined)
    
    inline def setReal_value(value: Double): Self = StObject.set(x, "real_value", value.asInstanceOf[js.Any])
    
    inline def setReal_valueUndefined: Self = StObject.set(x, "real_value", js.undefined)
    
    inline def setUpper_boundary(value: Double): Self = StObject.set(x, "upper_boundary", value.asInstanceOf[js.Any])
    
    inline def setUpper_boundaryUndefined: Self = StObject.set(x, "upper_boundary", js.undefined)
  }
}
