package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueArray extends StObject {
  
  var value: js.Array[Double]
}
object ValueArray {
  
  inline def apply(value: js.Array[Double]): ValueArray = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueArray]
  }
  
  extension [Self <: ValueArray](x: Self) {
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
