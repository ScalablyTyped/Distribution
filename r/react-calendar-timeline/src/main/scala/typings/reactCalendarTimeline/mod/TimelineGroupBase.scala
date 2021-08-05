package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineGroupBase extends StObject {
  
  var id: Id
  
  var rightTitle: js.UndefOr[ReactNode] = js.undefined
  
  var title: ReactNode
}
object TimelineGroupBase {
  
  inline def apply(id: Id): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
  
  extension [Self <: TimelineGroupBase](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRightTitle(value: ReactNode): Self = StObject.set(x, "rightTitle", value.asInstanceOf[js.Any])
    
    inline def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
