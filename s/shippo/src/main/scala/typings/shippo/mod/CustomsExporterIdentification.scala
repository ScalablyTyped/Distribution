package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomsExporterIdentification extends StObject {
  
  var eori_number: js.UndefOr[String] = js.undefined
  
  var tax_id: js.UndefOr[CustomsTaxIdentification] = js.undefined
}
object CustomsExporterIdentification {
  
  inline def apply(): CustomsExporterIdentification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomsExporterIdentification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomsExporterIdentification] (val x: Self) extends AnyVal {
    
    inline def setEori_number(value: String): Self = StObject.set(x, "eori_number", value.asInstanceOf[js.Any])
    
    inline def setEori_numberUndefined: Self = StObject.set(x, "eori_number", js.undefined)
    
    inline def setTax_id(value: CustomsTaxIdentification): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    inline def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
  }
}
