package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  var endonymName: String
  
  var isoCode: LanguageCode
  
  var name: String
}
object Language {
  
  inline def apply(endonymName: String, isoCode: LanguageCode, name: String): Language = {
    val __obj = js.Dynamic.literal(endonymName = endonymName.asInstanceOf[js.Any], isoCode = isoCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    inline def setEndonymName(value: String): Self = StObject.set(x, "endonymName", value.asInstanceOf[js.Any])
    
    inline def setIsoCode(value: LanguageCode): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
