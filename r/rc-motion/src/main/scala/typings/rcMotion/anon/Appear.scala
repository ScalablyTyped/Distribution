package typings.rcMotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appear extends js.Object {
  
  var appear: js.UndefOr[String] = js.native
  
  var appearActive: js.UndefOr[String] = js.native
  
  var enter: js.UndefOr[String] = js.native
  
  var enterActive: js.UndefOr[String] = js.native
  
  var leave: js.UndefOr[String] = js.native
  
  var leaveActive: js.UndefOr[String] = js.native
}
object Appear {
  
  @scala.inline
  def apply(): Appear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appear]
  }
  
  @scala.inline
  implicit class AppearOps[Self <: Appear] (val x: Self) extends AnyVal {
    
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
    def setAppear(value: String): Self = this.set("appear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setAppearActive(value: String): Self = this.set("appearActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearActive: Self = this.set("appearActive", js.undefined)
    
    @scala.inline
    def setEnter(value: String): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEnterActive(value: String): Self = this.set("enterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterActive: Self = this.set("enterActive", js.undefined)
    
    @scala.inline
    def setLeave(value: String): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    
    @scala.inline
    def setLeaveActive(value: String): Self = this.set("leaveActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveActive: Self = this.set("leaveActive", js.undefined)
  }
}
