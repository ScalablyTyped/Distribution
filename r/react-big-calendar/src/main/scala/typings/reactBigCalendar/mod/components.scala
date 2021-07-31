package typings.reactBigCalendar.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait components extends StObject {
  
  var dateCellWrapper: ComponentType[js.Object]
  
  var eventWrapper: ComponentType[Event]
}
object components {
  
  @scala.inline
  def apply(dateCellWrapper: ComponentType[js.Object], eventWrapper: ComponentType[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[components]
  }
  
  @scala.inline
  implicit class componentsMutableBuilder[Self <: components] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateCellWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapper(value: ComponentType[Event]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
  }
}
