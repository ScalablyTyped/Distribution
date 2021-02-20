package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaselineDetails
  extends /* key */ StringDictionary[js.Any] {
  
  var baseline: js.UndefOr[Double] = js.native
  
  var lower_boundary: js.UndefOr[Double] = js.native
  
  var upper_boundary: js.UndefOr[Double] = js.native
  
  var values: js.UndefOr[js.Array[BaselineValues]] = js.native
}
object BaselineDetails {
  
  @scala.inline
  def apply(): BaselineDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineDetails]
  }
  
  @scala.inline
  implicit class BaselineDetailsMutableBuilder[Self <: BaselineDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setLower_boundary(value: Double): Self = StObject.set(x, "lower_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLower_boundaryUndefined: Self = StObject.set(x, "lower_boundary", js.undefined)
    
    @scala.inline
    def setUpper_boundary(value: Double): Self = StObject.set(x, "upper_boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper_boundaryUndefined: Self = StObject.set(x, "upper_boundary", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[BaselineValues]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: BaselineValues*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
