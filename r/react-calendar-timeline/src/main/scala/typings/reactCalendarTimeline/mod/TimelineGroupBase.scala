package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineGroupBase extends StObject {
  
  var id: Id = js.native
  
  var rightTitle: js.UndefOr[ReactNode] = js.native
  
  var title: ReactNode = js.native
}
object TimelineGroupBase {
  
  @scala.inline
  def apply(id: Id): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
  
  @scala.inline
  implicit class TimelineGroupBaseMutableBuilder[Self <: TimelineGroupBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitle(value: ReactNode): Self = StObject.set(x, "rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
