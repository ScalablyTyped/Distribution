package typings.reactNativeWindows.popupMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupTargetState extends js.Object {
  
  var target: js.UndefOr[Double | Null] = js.native
  
  var targetRef: js.UndefOr[ReactNode] = js.native
}
object IPopupTargetState {
  
  @scala.inline
  def apply(): IPopupTargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupTargetState]
  }
  
  @scala.inline
  implicit class IPopupTargetStateOps[Self <: IPopupTargetState] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTargetRef(value: ReactNode): Self = this.set("targetRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetRef: Self = this.set("targetRef", js.undefined)
  }
}
