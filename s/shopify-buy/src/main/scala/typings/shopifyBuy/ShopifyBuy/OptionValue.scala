package typings.shopifyBuy.ShopifyBuy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionValue extends StObject {
  
  var name: String = js.native
  
  var option_id: String = js.native
  
  var value: js.Any = js.native
}
object OptionValue {
  
  @scala.inline
  def apply(name: String, option_id: String, value: js.Any): OptionValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], option_id = option_id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionValue]
  }
  
  @scala.inline
  implicit class OptionValueMutableBuilder[Self <: OptionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption_id(value: String): Self = StObject.set(x, "option_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
