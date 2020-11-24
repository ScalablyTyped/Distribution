package typings.reveal

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#slide-changed-event
@js.native
trait SlideEvent extends js.Object {
  
  var currentSlide: Element = js.native
  
  var indexh: Double = js.native
  
  var indexv: js.UndefOr[Double] = js.native
  
  var previousSlide: js.UndefOr[Element] = js.native
}
object SlideEvent {
  
  @scala.inline
  def apply(currentSlide: Element, indexh: Double): SlideEvent = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], indexh = indexh.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEvent]
  }
  
  @scala.inline
  implicit class SlideEventOps[Self <: SlideEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentSlide(value: Element): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexh(value: Double): Self = this.set("indexh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexv(value: Double): Self = this.set("indexv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexv: Self = this.set("indexv", js.undefined)
    
    @scala.inline
    def setPreviousSlide(value: Element): Self = this.set("previousSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousSlide: Self = this.set("previousSlide", js.undefined)
  }
}
