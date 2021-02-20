package typings.reactBigCalendar.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkWeekProps extends StObject {
  
  var date: Date = js.native
}
object WorkWeekProps {
  
  @scala.inline
  def apply(date: Date): WorkWeekProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkWeekProps]
  }
  
  @scala.inline
  implicit class WorkWeekPropsMutableBuilder[Self <: WorkWeekProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
