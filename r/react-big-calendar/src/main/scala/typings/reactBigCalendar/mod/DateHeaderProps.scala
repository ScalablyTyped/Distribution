package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateHeaderProps extends StObject {
  
  var date: js.Date
  
  var drilldownView: String
  
  var isOffRange: Boolean
  
  var label: String
  
  def onDrillDown(): Unit
}
object DateHeaderProps {
  
  inline def apply(date: js.Date, drilldownView: String, isOffRange: Boolean, label: String, onDrillDown: () => Unit): DateHeaderProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], drilldownView = drilldownView.asInstanceOf[js.Any], isOffRange = isOffRange.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onDrillDown = js.Any.fromFunction0(onDrillDown))
    __obj.asInstanceOf[DateHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDrilldownView(value: String): Self = StObject.set(x, "drilldownView", value.asInstanceOf[js.Any])
    
    inline def setIsOffRange(value: Boolean): Self = StObject.set(x, "isOffRange", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnDrillDown(value: () => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction0(value))
  }
}
