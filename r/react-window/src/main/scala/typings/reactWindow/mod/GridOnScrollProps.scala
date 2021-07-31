package typings.reactWindow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOnScrollProps extends StObject {
  
  var horizontalScrollDirection: ScrollDirection
  
  var scrollLeft: Double
  
  var scrollTop: Double
  
  var scrollUpdateWasRequested: Boolean
  
  var verticalScrollDirection: ScrollDirection
}
object GridOnScrollProps {
  
  @scala.inline
  def apply(
    horizontalScrollDirection: ScrollDirection,
    scrollLeft: Double,
    scrollTop: Double,
    scrollUpdateWasRequested: Boolean,
    verticalScrollDirection: ScrollDirection
  ): GridOnScrollProps = {
    val __obj = js.Dynamic.literal(horizontalScrollDirection = horizontalScrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any], verticalScrollDirection = verticalScrollDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnScrollProps]
  }
  
  @scala.inline
  implicit class GridOnScrollPropsMutableBuilder[Self <: GridOnScrollProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalScrollDirection(value: ScrollDirection): Self = StObject.set(x, "horizontalScrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUpdateWasRequested(value: Boolean): Self = StObject.set(x, "scrollUpdateWasRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollDirection(value: ScrollDirection): Self = StObject.set(x, "verticalScrollDirection", value.asInstanceOf[js.Any])
  }
}
