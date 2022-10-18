package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: js.Array[Boolean]
}
object Value {
  
  inline def apply(value: js.Array[Boolean]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: js.Array[Boolean]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Boolean*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
