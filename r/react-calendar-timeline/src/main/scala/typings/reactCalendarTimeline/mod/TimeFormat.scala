package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeFormat extends StObject {
  
  var long: String
  
  var medium: String
  
  var mediumLong: String
  
  var short: String
}
object TimeFormat {
  
  inline def apply(long: String, medium: String, mediumLong: String, short: String): TimeFormat = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumLong = mediumLong.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeFormat] (val x: Self) extends AnyVal {
    
    inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumLong(value: String): Self = StObject.set(x, "mediumLong", value.asInstanceOf[js.Any])
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
