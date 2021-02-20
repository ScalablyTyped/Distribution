package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideTo extends StObject {
  
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
  implicit class SlideToMutableBuilder[Self <: SlideTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    @scala.inline
    def setFadeoutAnimationIndexUndefined: Self = StObject.set(x, "fadeoutAnimationIndex", js.undefined)
    
    @scala.inline
    def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    @scala.inline
    def setFadeoutAnimationPositionUndefined: Self = StObject.set(x, "fadeoutAnimationPosition", js.undefined)
  }
}
