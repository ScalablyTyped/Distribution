package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeResult extends StObject {
  
  def get_value(): js.Date
}
object DateTimeResult {
  
  inline def apply(get_value: () => js.Date): DateTimeResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DateTimeResult]
  }
  
  extension [Self <: DateTimeResult](x: Self) {
    
    inline def setGet_value(value: () => js.Date): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
