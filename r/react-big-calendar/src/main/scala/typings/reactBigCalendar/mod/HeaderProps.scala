package typings.reactBigCalendar.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderProps extends StObject {
  
  var date: Date
  
  var label: String
  
  var localizer: DateLocalizer
}
object HeaderProps {
  
  inline def apply(date: Date, label: String, localizer: DateLocalizer): HeaderProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
  
  extension [Self <: HeaderProps](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLocalizer(value: DateLocalizer): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
  }
}
