package typings.reactWindow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOnItemsRenderedProps extends StObject {
  
  var overscanColumnStartIndex: Double
  
  var overscanColumnStopIndex: Double
  
  var overscanRowStartIndex: Double
  
  var overscanRowStopIndex: Double
  
  var visibleColumnStartIndex: Double
  
  var visibleColumnStopIndex: Double
  
  var visibleRowStartIndex: Double
  
  var visibleRowStopIndex: Double
}
object GridOnItemsRenderedProps {
  
  inline def apply(
    overscanColumnStartIndex: Double,
    overscanColumnStopIndex: Double,
    overscanRowStartIndex: Double,
    overscanRowStopIndex: Double,
    visibleColumnStartIndex: Double,
    visibleColumnStopIndex: Double,
    visibleRowStartIndex: Double,
    visibleRowStopIndex: Double
  ): GridOnItemsRenderedProps = {
    val __obj = js.Dynamic.literal(overscanColumnStartIndex = overscanColumnStartIndex.asInstanceOf[js.Any], overscanColumnStopIndex = overscanColumnStopIndex.asInstanceOf[js.Any], overscanRowStartIndex = overscanRowStartIndex.asInstanceOf[js.Any], overscanRowStopIndex = overscanRowStopIndex.asInstanceOf[js.Any], visibleColumnStartIndex = visibleColumnStartIndex.asInstanceOf[js.Any], visibleColumnStopIndex = visibleColumnStopIndex.asInstanceOf[js.Any], visibleRowStartIndex = visibleRowStartIndex.asInstanceOf[js.Any], visibleRowStopIndex = visibleRowStopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOnItemsRenderedProps]
  }
  
  extension [Self <: GridOnItemsRenderedProps](x: Self) {
    
    inline def setOverscanColumnStartIndex(value: Double): Self = StObject.set(x, "overscanColumnStartIndex", value.asInstanceOf[js.Any])
    
    inline def setOverscanColumnStopIndex(value: Double): Self = StObject.set(x, "overscanColumnStopIndex", value.asInstanceOf[js.Any])
    
    inline def setOverscanRowStartIndex(value: Double): Self = StObject.set(x, "overscanRowStartIndex", value.asInstanceOf[js.Any])
    
    inline def setOverscanRowStopIndex(value: Double): Self = StObject.set(x, "overscanRowStopIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleColumnStartIndex(value: Double): Self = StObject.set(x, "visibleColumnStartIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleColumnStopIndex(value: Double): Self = StObject.set(x, "visibleColumnStopIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleRowStartIndex(value: Double): Self = StObject.set(x, "visibleRowStartIndex", value.asInstanceOf[js.Any])
    
    inline def setVisibleRowStopIndex(value: Double): Self = StObject.set(x, "visibleRowStopIndex", value.asInstanceOf[js.Any])
  }
}
