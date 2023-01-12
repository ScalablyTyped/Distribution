package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineGroupBase extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: Id
  
  var rightTitle: js.UndefOr[ReactNode] = js.undefined
  
  var stackItems: js.UndefOr[Boolean] = js.undefined
  
  var title: ReactNode
}
object TimelineGroupBase {
  
  inline def apply(id: Id): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineGroupBase] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRightTitle(value: ReactNode): Self = StObject.set(x, "rightTitle", value.asInstanceOf[js.Any])
    
    inline def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    inline def setStackItems(value: Boolean): Self = StObject.set(x, "stackItems", value.asInstanceOf[js.Any])
    
    inline def setStackItemsUndefined: Self = StObject.set(x, "stackItems", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
