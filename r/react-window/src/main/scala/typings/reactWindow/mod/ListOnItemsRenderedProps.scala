package typings.reactWindow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOnItemsRenderedProps extends StObject {
  
  var overscanStartIndex: Double
  
  var overscanStopIndex: Double
  
  var visibleStartIndex: Double
  
  var visibleStopIndex: Double
}
object ListOnItemsRenderedProps {
  
  inline def apply(
    overscanStartIndex: Double,
    overscanStopIndex: Double,
    visibleStartIndex: Double,
    visibleStopIndex: Double
  ): ListOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any], visibleStartIndex = visibleStartIndex.asInstanceOf[js.Any], visibleStopIndex = visibleStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnItemsRenderedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOnItemsRenderedProps] (val x: Self) extends AnyVal {
    
    inline def setOverscanStartIndex(value: Double): Self = StObject.set(x, "overscanStartIndex", value.asInstanceOf[js.Any])
    
    inline def setOverscanStopIndex(value: Double): Self = StObject.set(x, "overscanStopIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleStartIndex(value: Double): Self = StObject.set(x, "visibleStartIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleStopIndex(value: Double): Self = StObject.set(x, "visibleStopIndex", value.asInstanceOf[js.Any])
  }
}
