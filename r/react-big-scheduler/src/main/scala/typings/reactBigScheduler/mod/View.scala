package typings.reactBigScheduler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  var isEventPerspective: Boolean = js.native
  
  var showAgenda: Boolean = js.native
  
  var viewName: js.UndefOr[String] = js.native
  
  var viewType: ViewTypes = js.native
}
object View {
  
  @scala.inline
  def apply(isEventPerspective: Boolean, showAgenda: Boolean, viewType: ViewTypes): View = {
    val __obj = js.Dynamic.literal(isEventPerspective = isEventPerspective.asInstanceOf[js.Any], showAgenda = showAgenda.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    
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
    def setIsEventPerspective(value: Boolean): Self = this.set("isEventPerspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAgenda(value: Boolean): Self = this.set("showAgenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewType(value: ViewTypes): Self = this.set("viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewName(value: String): Self = this.set("viewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewName: Self = this.set("viewName", js.undefined)
  }
}
