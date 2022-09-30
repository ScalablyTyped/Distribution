package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineDetails
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var baseline: js.UndefOr[Double] = js.undefined
  
  var lower_boundary: js.UndefOr[Double] = js.undefined
  
  var upper_boundary: js.UndefOr[Double] = js.undefined
  
  var values: js.UndefOr[js.Array[BaselineValues]] = js.undefined
}
object BaselineDetails {
  
  inline def apply(): BaselineDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineDetails]
  }
  
  extension [Self <: BaselineDetails](x: Self) {
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setLower_boundary(value: Double): Self = StObject.set(x, "lower_boundary", value.asInstanceOf[js.Any])
    
    inline def setLower_boundaryUndefined: Self = StObject.set(x, "lower_boundary", js.undefined)
    
    inline def setUpper_boundary(value: Double): Self = StObject.set(x, "upper_boundary", value.asInstanceOf[js.Any])
    
    inline def setUpper_boundaryUndefined: Self = StObject.set(x, "upper_boundary", js.undefined)
    
    inline def setValues(value: js.Array[BaselineValues]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: BaselineValues*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
