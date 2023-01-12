package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonObjectResult extends StObject {
  
  def get_value(): Any
}
object JsonObjectResult {
  
  inline def apply(get_value: () => Any): JsonObjectResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[JsonObjectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonObjectResult] (val x: Self) extends AnyVal {
    
    inline def setGet_value(value: () => Any): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
