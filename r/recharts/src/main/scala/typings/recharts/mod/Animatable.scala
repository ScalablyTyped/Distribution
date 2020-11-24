package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animatable extends js.Object {
  
  var animationBegin: js.UndefOr[Double] = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationEasing: js.UndefOr[AnimationEasingType] = js.native
  
  var animationId: js.UndefOr[Double] = js.native
  
  var isAnimationActive: js.UndefOr[Boolean] = js.native
  
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.native
  
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.native
  
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.native
}
object Animatable {
  
  @scala.inline
  def apply(): Animatable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animatable]
  }
  
  @scala.inline
  implicit class AnimatableOps[Self <: Animatable] (val x: Self) extends AnyVal {
    
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
    def setAnimationBegin(value: Double): Self = this.set("animationBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationBegin: Self = this.set("animationBegin", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: AnimationEasingType): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    
    @scala.inline
    def setAnimationId(value: Double): Self = this.set("animationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationId: Self = this.set("animationId", js.undefined)
    
    @scala.inline
    def setIsAnimationActive(value: Boolean): Self = this.set("isAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnimationActive: Self = this.set("isAnimationActive", js.undefined)
    
    @scala.inline
    def setIsUpdateAnimationActive(value: Boolean): Self = this.set("isUpdateAnimationActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUpdateAnimationActive: Self = this.set("isUpdateAnimationActive", js.undefined)
    
    @scala.inline
    def setOnAnimationEnd(value: /* repeated */ js.Any => Unit): Self = this.set("onAnimationEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationEnd: Self = this.set("onAnimationEnd", js.undefined)
    
    @scala.inline
    def setOnAnimationStart(value: /* repeated */ js.Any => Unit): Self = this.set("onAnimationStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAnimationStart: Self = this.set("onAnimationStart", js.undefined)
  }
}
