package typings.spectacle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentSlide extends js.Object {
  
  var currentSlide: Double = js.native
  
  var numberOfSlides: Double = js.native
}
object CurrentSlide {
  
  @scala.inline
  def apply(currentSlide: Double, numberOfSlides: Double): CurrentSlide = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], numberOfSlides = numberOfSlides.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentSlide]
  }
  
  @scala.inline
  implicit class CurrentSlideOps[Self <: CurrentSlide] (val x: Self) extends AnyVal {
    
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
    def setCurrentSlide(value: Double): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfSlides(value: Double): Self = this.set("numberOfSlides", value.asInstanceOf[js.Any])
  }
}
