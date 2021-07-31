package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: stringOrDate
  
  var start: stringOrDate
}
object End {
  
  @scala.inline
  def apply(end: stringOrDate, start: stringOrDate): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
