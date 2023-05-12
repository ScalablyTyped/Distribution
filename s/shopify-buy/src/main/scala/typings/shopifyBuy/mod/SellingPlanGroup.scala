package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanGroup extends StObject {
  
  var appName: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var options: js.Array[SellingPlanGroupOption]
  
  var sellingPlans: js.Array[SellingPlan]
}
object SellingPlanGroup {
  
  inline def apply(name: String, options: js.Array[SellingPlanGroupOption], sellingPlans: js.Array[SellingPlan]): SellingPlanGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sellingPlans = sellingPlans.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanGroup] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[SellingPlanGroupOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SellingPlanGroupOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSellingPlans(value: js.Array[SellingPlan]): Self = StObject.set(x, "sellingPlans", value.asInstanceOf[js.Any])
    
    inline def setSellingPlansVarargs(value: SellingPlan*): Self = StObject.set(x, "sellingPlans", js.Array(value*))
  }
}
