package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  var isoCode: CurrencyCode
  
  var name: String
  
  var symbol: String
}
object Currency {
  
  inline def apply(isoCode: CurrencyCode, name: String, symbol: String): Currency = {
    val __obj = js.Dynamic.literal(isoCode = isoCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    inline def setIsoCode(value: CurrencyCode): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
