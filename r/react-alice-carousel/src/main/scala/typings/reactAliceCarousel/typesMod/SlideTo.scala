package typings.reactAliceCarousel.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideTo extends js.Object {
  
  var activeIndex: Double = js.native
  
  var fadeoutAnimationIndex: js.UndefOr[Double | Null] = js.native
  
  var fadeoutAnimationPosition: js.UndefOr[Double | Null] = js.native
}
object SlideTo {
  
  @scala.inline
  def apply(activeIndex: Double): SlideTo = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideTo]
  }
  
  @scala.inline
  implicit class SlideToOps[Self <: SlideTo] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationIndex(value: Double): Self = this.set("fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeoutAnimationIndex: Self = this.set("fadeoutAnimationIndex", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationIndexNull: Self = this.set("fadeoutAnimationIndex", null)
    
    @scala.inline
    def setFadeoutAnimationPosition(value: Double): Self = this.set("fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeoutAnimationPosition: Self = this.set("fadeoutAnimationPosition", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationPositionNull: Self = this.set("fadeoutAnimationPosition", null)
  }
}
