package typings.reactDates.anon

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndDate extends StObject {
  
  var endDate: Moment | Null = js.native
  
  var startDate: Moment | Null = js.native
}
object EndDate {
  
  @scala.inline
  def apply(): EndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit class EndDateMutableBuilder[Self <: EndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: Moment): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    @scala.inline
    def setStartDate(value: Moment): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateNull: Self = StObject.set(x, "startDate", null)
  }
}
