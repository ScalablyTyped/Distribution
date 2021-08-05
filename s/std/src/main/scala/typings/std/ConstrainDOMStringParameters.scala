package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainDOMStringParameters extends StObject {
  
  var exact: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  
  var ideal: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}
object ConstrainDOMStringParameters {
  
  inline def apply(): ConstrainDOMStringParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDOMStringParameters]
  }
  
  extension [Self <: ConstrainDOMStringParameters](x: Self) {
    
    inline def setExact(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setExactVarargs(value: java.lang.String*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    inline def setIdeal(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    inline def setIdealVarargs(value: java.lang.String*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
