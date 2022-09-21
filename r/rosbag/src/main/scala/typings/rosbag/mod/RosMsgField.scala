package typings.rosbag.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RosMsgField extends StObject {
  
  var arrayLength: js.UndefOr[Double] = js.undefined
  
  // For arrays
  var isArray: js.UndefOr[Boolean] = js.undefined
  
  var isComplex: js.UndefOr[Boolean] = js.undefined
  
  // For constants
  var isConstant: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var `type`: String
  
  var value: js.UndefOr[Any] = js.undefined
}
object RosMsgField {
  
  inline def apply(name: String, `type`: String): RosMsgField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosMsgField]
  }
  
  extension [Self <: RosMsgField](x: Self) {
    
    inline def setArrayLength(value: Double): Self = StObject.set(x, "arrayLength", value.asInstanceOf[js.Any])
    
    inline def setArrayLengthUndefined: Self = StObject.set(x, "arrayLength", js.undefined)
    
    inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    inline def setIsComplex(value: Boolean): Self = StObject.set(x, "isComplex", value.asInstanceOf[js.Any])
    
    inline def setIsComplexUndefined: Self = StObject.set(x, "isComplex", js.undefined)
    
    inline def setIsConstant(value: Boolean): Self = StObject.set(x, "isConstant", value.asInstanceOf[js.Any])
    
    inline def setIsConstantUndefined: Self = StObject.set(x, "isConstant", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
