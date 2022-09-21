package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adress extends StObject {
  
  var adress: String
  
  var validated: Boolean
}
object Adress {
  
  inline def apply(adress: String, validated: Boolean): Adress = {
    val __obj = js.Dynamic.literal(adress = adress.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adress]
  }
  
  extension [Self <: Adress](x: Self) {
    
    inline def setAdress(value: String): Self = StObject.set(x, "adress", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
  }
}
