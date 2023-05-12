package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellingPlanGroupOption extends StObject {
  
  var name: String
  
  var values: js.Array[String]
}
object SellingPlanGroupOption {
  
  inline def apply(name: String, values: js.Array[String]): SellingPlanGroupOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellingPlanGroupOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellingPlanGroupOption] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
