package typings.reactAliceCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlidesLength extends js.Object {
  
  var activeIndex: js.Any = js.native
  
  var slidesLength: js.Any = js.native
}
object SlidesLength {
  
  @scala.inline
  def apply(activeIndex: js.Any, slidesLength: js.Any): SlidesLength = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], slidesLength = slidesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidesLength]
  }
  
  @scala.inline
  implicit class SlidesLengthOps[Self <: SlidesLength] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: js.Any): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesLength(value: js.Any): Self = this.set("slidesLength", value.asInstanceOf[js.Any])
  }
}
