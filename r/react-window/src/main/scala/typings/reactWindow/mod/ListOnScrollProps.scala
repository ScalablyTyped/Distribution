package typings.reactWindow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOnScrollProps extends StObject {
  
  var scrollDirection: ScrollDirection
  
  var scrollOffset: Double
  
  var scrollUpdateWasRequested: Boolean
}
object ListOnScrollProps {
  
  inline def apply(scrollDirection: ScrollDirection, scrollOffset: Double, scrollUpdateWasRequested: Boolean): ListOnScrollProps = {
    val __obj = js.Dynamic.literal(scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollUpdateWasRequested = scrollUpdateWasRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnScrollProps]
  }
  
  extension [Self <: ListOnScrollProps](x: Self) {
    
    inline def setScrollDirection(value: ScrollDirection): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollUpdateWasRequested(value: Boolean): Self = StObject.set(x, "scrollUpdateWasRequested", value.asInstanceOf[js.Any])
  }
}
