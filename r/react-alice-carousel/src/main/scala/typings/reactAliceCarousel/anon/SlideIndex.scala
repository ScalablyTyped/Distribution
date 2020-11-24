package typings.reactAliceCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideIndex extends js.Object {
  
  var slideIndex: Double = js.native
  
  var slidesLength: Double = js.native
}
object SlideIndex {
  
  @scala.inline
  def apply(slideIndex: Double, slidesLength: Double): SlideIndex = {
    val __obj = js.Dynamic.literal(slideIndex = slideIndex.asInstanceOf[js.Any], slidesLength = slidesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideIndex]
  }
  
  @scala.inline
  implicit class SlideIndexOps[Self <: SlideIndex] (val x: Self) extends AnyVal {
    
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
    def setSlideIndex(value: Double): Self = this.set("slideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesLength(value: Double): Self = this.set("slidesLength", value.asInstanceOf[js.Any])
  }
}
