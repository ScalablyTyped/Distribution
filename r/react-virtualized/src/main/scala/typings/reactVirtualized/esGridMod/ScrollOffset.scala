package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollOffset extends StObject {
  
  var scrollLeft: Double
  
  var scrollTop: Double
}
object ScrollOffset {
  
  @scala.inline
  def apply(scrollLeft: Double, scrollTop: Double): ScrollOffset = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollOffset]
  }
  
  @scala.inline
  implicit class ScrollOffsetMutableBuilder[Self <: ScrollOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
