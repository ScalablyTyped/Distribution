package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weight extends StObject {
  
  var FIELD: String
  
  var VALUE: String
  
  var WEIGHT: Double
}
object Weight {
  
  inline def apply(FIELD: String, VALUE: String, WEIGHT: Double): Weight = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any], VALUE = VALUE.asInstanceOf[js.Any], WEIGHT = WEIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weight]
  }
  
  extension [Self <: Weight](x: Self) {
    
    inline def setFIELD(value: String): Self = StObject.set(x, "FIELD", value.asInstanceOf[js.Any])
    
    inline def setVALUE(value: String): Self = StObject.set(x, "VALUE", value.asInstanceOf[js.Any])
    
    inline def setWEIGHT(value: Double): Self = StObject.set(x, "WEIGHT", value.asInstanceOf[js.Any])
  }
}
