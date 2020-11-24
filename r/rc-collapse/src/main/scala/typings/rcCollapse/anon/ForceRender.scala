package typings.rcCollapse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceRender extends js.Object {
  
  var forceRender: Boolean = js.native
  
  var headerClass: String = js.native
  
  var isActive: Boolean = js.native
  
  def onItemClick(): Unit = js.native
  
  var showArrow: Boolean = js.native
}
object ForceRender {
  
  @scala.inline
  def apply(
    forceRender: Boolean,
    headerClass: String,
    isActive: Boolean,
    onItemClick: () => Unit,
    showArrow: Boolean
  ): ForceRender = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onItemClick = js.Any.fromFunction0(onItemClick), showArrow = showArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceRender]
  }
  
  @scala.inline
  implicit class ForceRenderOps[Self <: ForceRender] (val x: Self) extends AnyVal {
    
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
    def setForceRender(value: Boolean): Self = this.set("forceRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClass(value: String): Self = this.set("headerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnItemClick(value: () => Unit): Self = this.set("onItemClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
  }
}
