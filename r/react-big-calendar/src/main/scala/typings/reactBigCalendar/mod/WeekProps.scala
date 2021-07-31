package typings.reactBigCalendar.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekProps extends StObject {
  
  var date: Date
}
object WeekProps {
  
  @scala.inline
  def apply(date: Date): WeekProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekProps]
  }
  
  @scala.inline
  implicit class WeekPropsMutableBuilder[Self <: WeekProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
