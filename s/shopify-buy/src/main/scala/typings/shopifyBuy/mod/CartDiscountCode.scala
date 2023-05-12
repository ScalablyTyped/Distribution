package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartDiscountCode extends StObject {
  
  var applicable: Boolean
  
  var code: String
}
object CartDiscountCode {
  
  inline def apply(applicable: Boolean, code: String): CartDiscountCode = {
    val __obj = js.Dynamic.literal(applicable = applicable.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartDiscountCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartDiscountCode] (val x: Self) extends AnyVal {
    
    inline def setApplicable(value: Boolean): Self = StObject.set(x, "applicable", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
