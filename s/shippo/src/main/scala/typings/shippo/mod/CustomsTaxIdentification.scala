package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomsTaxIdentification extends StObject {
  
  var number: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[CustomsTaxIdentification] = js.undefined
}
object CustomsTaxIdentification {
  
  inline def apply(): CustomsTaxIdentification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomsTaxIdentification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomsTaxIdentification] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setType(value: CustomsTaxIdentification): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.EIN
    - typings.shippo.shippoStrings.VAT
    - typings.shippo.shippoStrings.IOSS
    - typings.shippo.shippoStrings.ARN
    - java.lang.String
  */
  type Type = _Type | String
  
  trait _Type extends StObject
}
