package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCalendarGroupRendererProps[CustomGroup /* <: TimelineGroupBase */] extends StObject {
  
  var group: CustomGroup = js.native
  
  var isRightSidebar: js.UndefOr[Boolean] = js.native
}
object ReactCalendarGroupRendererProps {
  
  @scala.inline
  def apply[CustomGroup /* <: TimelineGroupBase */](group: CustomGroup): ReactCalendarGroupRendererProps[CustomGroup] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarGroupRendererProps[CustomGroup]]
  }
  
  @scala.inline
  implicit class ReactCalendarGroupRendererPropsMutableBuilder[Self <: ReactCalendarGroupRendererProps[_], CustomGroup /* <: TimelineGroupBase */] (val x: Self with ReactCalendarGroupRendererProps[CustomGroup]) extends AnyVal {
    
    @scala.inline
    def setGroup(value: CustomGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightSidebar(value: Boolean): Self = StObject.set(x, "isRightSidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightSidebarUndefined: Self = StObject.set(x, "isRightSidebar", js.undefined)
  }
}
