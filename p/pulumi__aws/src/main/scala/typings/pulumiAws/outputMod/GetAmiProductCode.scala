package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAmiProductCode extends StObject {
  
  var productCodeId: String
  
  var productCodeType: String
}
object GetAmiProductCode {
  
  inline def apply(productCodeId: String, productCodeType: String): GetAmiProductCode = {
    val __obj = js.Dynamic.literal(productCodeId = productCodeId.asInstanceOf[js.Any], productCodeType = productCodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiProductCode]
  }
  
  extension [Self <: GetAmiProductCode](x: Self) {
    
    inline def setProductCodeId(value: String): Self = StObject.set(x, "productCodeId", value.asInstanceOf[js.Any])
    
    inline def setProductCodeType(value: String): Self = StObject.set(x, "productCodeType", value.asInstanceOf[js.Any])
  }
}
