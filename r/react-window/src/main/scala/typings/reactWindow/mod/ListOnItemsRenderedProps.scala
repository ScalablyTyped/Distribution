package typings.reactWindow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOnItemsRenderedProps extends StObject {
  
  var overscanStartIndex: Double = js.native
  
  var overscanStopIndex: Double = js.native
  
  var visibleStartIndex: Double = js.native
  
  var visibleStopIndex: Double = js.native
}
object ListOnItemsRenderedProps {
  
  @scala.inline
  def apply(
    overscanStartIndex: Double,
    overscanStopIndex: Double,
    visibleStartIndex: Double,
    visibleStopIndex: Double
  ): ListOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any], visibleStartIndex = visibleStartIndex.asInstanceOf[js.Any], visibleStopIndex = visibleStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnItemsRenderedProps]
  }
  
  @scala.inline
  implicit class ListOnItemsRenderedPropsMutableBuilder[Self <: ListOnItemsRenderedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverscanStartIndex(value: Double): Self = StObject.set(x, "overscanStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscanStopIndex(value: Double): Self = StObject.set(x, "overscanStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleStartIndex(value: Double): Self = StObject.set(x, "visibleStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleStopIndex(value: Double): Self = StObject.set(x, "visibleStopIndex", value.asInstanceOf[js.Any])
  }
}
