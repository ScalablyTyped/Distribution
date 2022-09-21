package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeValueObject extends StObject {
  
  var GTE: String | Double
  
  var LTE: String | Double
}
object RangeValueObject {
  
  inline def apply(GTE: String | Double, LTE: String | Double): RangeValueObject = {
    val __obj = js.Dynamic.literal(GTE = GTE.asInstanceOf[js.Any], LTE = LTE.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeValueObject]
  }
  
  extension [Self <: RangeValueObject](x: Self) {
    
    inline def setGTE(value: String | Double): Self = StObject.set(x, "GTE", value.asInstanceOf[js.Any])
    
    inline def setLTE(value: String | Double): Self = StObject.set(x, "LTE", value.asInstanceOf[js.Any])
  }
}
