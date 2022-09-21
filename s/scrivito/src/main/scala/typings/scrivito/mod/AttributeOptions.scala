package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeOptions extends StObject {
  
  var only: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object AttributeOptions {
  
  inline def apply(): AttributeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeOptions]
  }
  
  extension [Self <: AttributeOptions](x: Self) {
    
    inline def setOnly(value: String | js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value*))
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
