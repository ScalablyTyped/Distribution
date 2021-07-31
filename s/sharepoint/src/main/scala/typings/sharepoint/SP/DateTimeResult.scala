package typings.sharepoint.SP

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeResult extends StObject {
  
  def get_value(): Date
}
object DateTimeResult {
  
  @scala.inline
  def apply(get_value: () => Date): DateTimeResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DateTimeResult]
  }
  
  @scala.inline
  implicit class DateTimeResultMutableBuilder[Self <: DateTimeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_value(value: () => Date): Self = StObject.set(x, "get_value", js.Any.fromFunction0(value))
  }
}
