package typings.rcMotion.cssmotionMod

import typings.rcMotion.interfaceMod.MotionStatus
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSMotionState extends js.Object {
  
  var newStatus: js.UndefOr[Boolean] = js.native
  
  var prevProps: js.UndefOr[CSSMotionProps] = js.native
  
  var status: js.UndefOr[MotionStatus] = js.native
  
  var statusActive: js.UndefOr[Boolean] = js.native
  
  var statusStyle: js.UndefOr[CSSProperties] = js.native
}
object CSSMotionState {
  
  @scala.inline
  def apply(): CSSMotionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSMotionState]
  }
  
  @scala.inline
  implicit class CSSMotionStateOps[Self <: CSSMotionState] (val x: Self) extends AnyVal {
    
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
    def setNewStatus(value: Boolean): Self = this.set("newStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewStatus: Self = this.set("newStatus", js.undefined)
    
    @scala.inline
    def setPrevProps(value: CSSMotionProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    
    @scala.inline
    def setStatus(value: MotionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusActive(value: Boolean): Self = this.set("statusActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusActive: Self = this.set("statusActive", js.undefined)
    
    @scala.inline
    def setStatusStyle(value: CSSProperties): Self = this.set("statusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusStyle: Self = this.set("statusStyle", js.undefined)
  }
}
