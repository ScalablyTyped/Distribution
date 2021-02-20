package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlidesLength extends StObject {
  
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
  implicit class SlidesLengthMutableBuilder[Self <: SlidesLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: js.Any): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesLength(value: js.Any): Self = StObject.set(x, "slidesLength", value.asInstanceOf[js.Any])
  }
}
