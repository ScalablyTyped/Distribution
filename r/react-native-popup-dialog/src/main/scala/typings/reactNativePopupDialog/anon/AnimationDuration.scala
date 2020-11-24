package typings.reactNativePopupDialog.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDuration extends js.Object {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var toValue: js.UndefOr[Double] = js.native
}
object AnimationDuration {
  
  @scala.inline
  def apply(): AnimationDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDuration]
  }
  
  @scala.inline
  implicit class AnimationDurationOps[Self <: AnimationDuration] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setToValue(value: Double): Self = this.set("toValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToValue: Self = this.set("toValue", js.undefined)
  }
}
