package typings.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactCalendarGroupRendererProps[CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  
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
  implicit class ReactCalendarGroupRendererPropsOps[Self <: ReactCalendarGroupRendererProps[_], CustomGroup /* <: TimelineGroupBase */] (val x: Self with ReactCalendarGroupRendererProps[CustomGroup]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroup(value: CustomGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightSidebar(value: Boolean): Self = this.set("isRightSidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRightSidebar: Self = this.set("isRightSidebar", js.undefined)
  }
}
