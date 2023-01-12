package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionValue extends StObject {
  
  var name: String
  
  var option_id: String
  
  var value: Any
}
object OptionValue {
  
  inline def apply(name: String, option_id: String, value: Any): OptionValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], option_id = option_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionValue] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOption_id(value: String): Self = StObject.set(x, "option_id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
