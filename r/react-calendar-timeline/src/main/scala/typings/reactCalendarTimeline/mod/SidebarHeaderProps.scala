package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarHeaderProps[Data] extends js.Object {
  
  def children(props: SidebarHeaderChildrenFnProps[Data]): ReactNode = js.native
  
  var headerData: js.UndefOr[Data] = js.native
  
  var variant: js.UndefOr[left | right] = js.native
}
object SidebarHeaderProps {
  
  @scala.inline
  def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => ReactNode): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
  
  @scala.inline
  implicit class SidebarHeaderPropsOps[Self <: SidebarHeaderProps[_], Data] (val x: Self with SidebarHeaderProps[Data]) extends AnyVal {
    
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
    def setChildren(value: SidebarHeaderChildrenFnProps[Data] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderData(value: Data): Self = this.set("headerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderData: Self = this.set("headerData", js.undefined)
    
    @scala.inline
    def setVariant(value: left | right): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
