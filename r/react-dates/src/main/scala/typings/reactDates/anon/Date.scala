package typings.reactDates.anon

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date extends StObject {
  
  var date: Moment | Null
}
object Date {
  
  @scala.inline
  def apply(): Date = {
    val __obj = js.Dynamic.literal(date = null)
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Moment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateNull: Self = StObject.set(x, "date", null)
  }
}
