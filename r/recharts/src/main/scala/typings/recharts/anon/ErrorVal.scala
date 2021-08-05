package typings.recharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorVal extends StObject {
  
  var errorVal: js.Any
  
  var value: js.Any
  
  var x: Double
  
  var y: Double
}
object ErrorVal {
  
  inline def apply(errorVal: js.Any, value: js.Any, x: Double, y: Double): ErrorVal = {
    val __obj = js.Dynamic.literal(errorVal = errorVal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorVal]
  }
  
  extension [Self <: ErrorVal](x: Self) {
    
    inline def setErrorVal(value: js.Any): Self = StObject.set(x, "errorVal", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
