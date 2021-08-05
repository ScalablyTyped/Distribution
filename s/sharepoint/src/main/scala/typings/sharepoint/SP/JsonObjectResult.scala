package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonObjectResult extends StObject {
  
  def get_value(): js.Any
}
object JsonObjectResult {
  
  inline def apply(get_value: () => js.Any): JsonObjectResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[JsonObjectResult]
  }
  
  extension [Self <: JsonObjectResult](x: Self) {
    
    inline def setGet_value(value: () => js.Any): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
