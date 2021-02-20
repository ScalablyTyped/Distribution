package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeFormat extends StObject {
  
  var long: String = js.native
  
  var medium: String = js.native
  
  var mediumLong: String = js.native
  
  var short: String = js.native
}
object TimeFormat {
  
  @scala.inline
  def apply(long: String, medium: String, mediumLong: String, short: String): TimeFormat = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumLong = mediumLong.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeFormat]
  }
  
  @scala.inline
  implicit class TimeFormatMutableBuilder[Self <: TimeFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumLong(value: String): Self = StObject.set(x, "mediumLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
