package typings.sentryTypes.anon

import typings.sentryTypes.typesThreadMod.Thread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuesArray extends StObject {
  
  var values: js.Array[Thread]
}
object ValuesArray {
  
  inline def apply(values: js.Array[Thread]): ValuesArray = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuesArray] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[Thread]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Thread*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
